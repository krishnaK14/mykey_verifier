package key_ver;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;
 
public class Server
{
 
    private static Socket socket;
    static boolean validkey(String n)throws Exception
    {
        boolean flag=false;
        
        Connection connect = null;
        Statement statement = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
           connect = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/key_ver","root","root");
           
           statement=connect.createStatement();
           rs=statement.executeQuery("select * from key_stat where KeyNum="+n);
           flag=false;
           while(rs.next())
           {
               flag=true;
               if(rs.getInt(2)==1)flag=false;
           }
           
           if(flag)
           {
               ps=connect.prepareStatement("update key_stat set KeyStatus=1 where KeyNum="+n);
               ps.execute();
           }
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            connect.close();
        }
        
        return flag;
    }
    public static void main(String[] args)
    {
        try
        {
 
            int port = 25000;
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server Started and listening to the port 25000");
 
            //Server is running always. This is done using this while(true) loop
            while(true)
            {
                //Reading the message from the client
                socket = serverSocket.accept();
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                String number = br.readLine();
                System.out.println("Message received from client is "+number);
 
                
                String returnMessage="";
                try
                {
                    if(validkey(number))
                    {
                         returnMessage="t"+"\n";
                    }
                    else{
                        returnMessage="f"+"\n";
                    }
                }
                catch(NumberFormatException e)
                {
                    //Input was not a number. Sending proper message back to client.
                    returnMessage = "Please send a proper number\n";
                }
 
                //Sending the response back to the client.
                OutputStream os = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(os);
                BufferedWriter bw = new BufferedWriter(osw);
                bw.write(returnMessage);
                System.out.println("Message sent to the client is "+returnMessage);
                bw.flush();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                socket.close();
            }
            catch(Exception e){}
        }
    }
}