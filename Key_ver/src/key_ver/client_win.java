/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package key_ver;

import javax.swing.JOptionPane;



/**
 *
 * @author lenovo
 */
public class client_win extends javax.swing.JFrame {

    /**
     * Creates new form client_win
     */
    public client_win() {
        super("key verifier");
        initComponents();
        tf1.setTransferHandler(null);
        tf2.setTransferHandler(null);
        tf3.setTransferHandler(null);
        tf4.setTransferHandler(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        res_but = new javax.swing.JButton();
        ver_but = new javax.swing.JButton();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Key verifier");
        setBackground(new java.awt.Color(102, 0, 0));
        setLocationByPlatform(true);
        setResizable(false);

        res_but.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\Key_ver\\images\\reset.png")); // NOI18N
        res_but.setToolTipText("Reset");
        res_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                res_butActionPerformed(evt);
            }
        });

        ver_but.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\Key_ver\\images\\accept.png")); // NOI18N
        ver_but.setToolTipText("Verify");
        ver_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_butActionPerformed(evt);
            }
        });

        tf1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf1KeyTyped(evt);
            }
        });

        tf2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tf2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf2KeyTyped(evt);
            }
        });

        tf3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf3ActionPerformed(evt);
            }
        });
        tf3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf3KeyTyped(evt);
            }
        });

        tf4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tf4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf4KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ver_but, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(res_but, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(res_but, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ver_but, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf3ActionPerformed

    private void tf1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyPressed
  
    }//GEN-LAST:event_tf1KeyPressed
   
    
    private void tf2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf2KeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tf2KeyPressed

    private void tf3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf3KeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_tf3KeyPressed

    private void tf4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf4KeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tf4KeyPressed

    private void tf1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyTyped
        // TODO add your handling code here:
        String str="1234567890";
            char c=(char)evt.getKeyChar();
            if(str.indexOf(c)<0)evt.consume();
        if(tf1.getText().length()>3)evt.consume();
    }//GEN-LAST:event_tf1KeyTyped

    private void tf2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf2KeyTyped
        // TODO add your handling code here:
       
            String str="1234567890";
            char c=(char)evt.getKeyChar();
            if(str.indexOf(c)<0)evt.consume();
        if(tf2.getText().length()>3)evt.consume();        
    }//GEN-LAST:event_tf2KeyTyped

    private void tf3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf3KeyTyped
        // TODO add your handling code here:
         
            String str="1234567890";
            char c=(char)evt.getKeyChar();
            if(str.indexOf(c)<0)evt.consume();
        if(tf3.getText().length()>3)evt.consume();    
    }//GEN-LAST:event_tf3KeyTyped

    private void tf4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf4KeyTyped
        // TODO add your handling code here:
        
            String str="1234567890";
            char c=(char)evt.getKeyChar();
            if(str.indexOf(c)<0)evt.consume();
        if(tf4.getText().length()>3)evt.consume();
    }//GEN-LAST:event_tf4KeyTyped

    private void tf1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyReleased
        // TODO add your handling code here:
        if(tf1.getText().length()>=4)
        {
            evt.consume();
            tf2.grabFocus();
        }
    }//GEN-LAST:event_tf1KeyReleased

    private void tf2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf2KeyReleased
        // TODO add your handling code here:
         if(tf2.getText().length()>=4)
        { evt.consume();tf3.grabFocus();}
        
    }//GEN-LAST:event_tf2KeyReleased

    private void tf3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf3KeyReleased
        // TODO add your handling code here:
        if(tf3.getText().length()>=4)
         { evt.consume();tf4.grabFocus();}
    }//GEN-LAST:event_tf3KeyReleased

    private void tf4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf4KeyReleased
        // TODO add your handling code here:
        if(tf4.getText().length()>=4)
        {evt.consume();ver_but.grabFocus();}
    }//GEN-LAST:event_tf4KeyReleased

    private void res_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_res_butActionPerformed
        // TODO add your handling code here:
        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
        tf4.setText("");
        tf1.grabFocus();
    }//GEN-LAST:event_res_butActionPerformed
 public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage,titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    private void ver_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver_butActionPerformed
        // TODO add your handling code here:
    //concatenate texts    
    String st=tf1.getText()+tf2.getText()+tf3.getText()+tf4.getText();
    //length validation
    if(st.length()!=16)
    {
        infoBox("enter a 16 digit code!","ALERT!");
        res_butActionPerformed(evt);
        return;
    }
    //character validation
    for(int i=0;i<st.length();i++)
    {
     char ch=st.charAt(i);
     if(!(ch>='0'&&ch<='9'))
     {
       infoBox("enter only numbers not alphabets","ALERT!");
       res_butActionPerformed(evt);
       return;
     }
    }
    Client c=new Client(st);
    boolean f=c.run();
    if(f){
        infoBox("congrats!!product registered","ALERT!");
    }
    else
    {
        infoBox("invalid key","ALERT!");
    }
    }//GEN-LAST:event_ver_butActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(client_win.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(client_win.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(client_win.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(client_win.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new client_win().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton res_but;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JButton ver_but;
    // End of variables declaration//GEN-END:variables

    
}
