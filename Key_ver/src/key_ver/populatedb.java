/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package key_ver;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.util.Random;

/**
 *
 * @author lenovo
 */
public class populatedb {

    /**
     * @param args the command line arguments
     */
    public static String randSti()
    {
        String s="";
        
        while(s.length()<16)
        {
            int k=(int)Math.abs(Math.random()*10);
            if(k!=10&&k!=0)
            s=s+k;
        }
        return s;
    }
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        Connection connect=null;
        PreparedStatement ps=null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/key_ver";
            String user="root";
            String password="root";
            connect=(Connection) DriverManager.getConnection(url, user, password);
            
           
     
            for(int i=0;i<100;i++)
            {
                String s=randSti();
                ps=(PreparedStatement)connect.prepareStatement("insert into key_stat values(?,0);");
                  ps.setString(1,s);
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
    }
    
}
