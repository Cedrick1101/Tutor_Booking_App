
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import za.ac.tut.valideemail.ValideEmail;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class ForgetPassword extends javax.swing.JFrame {
;
   Connection connection;
    PreparedStatement statement=null,state=null;
    ResultSet result=null;
    String URL="jdbc:mysql://localhost:3306/itech_project";
    String USER = "root";
    String PASSWORD = "Ced11@#01$";
   
   public static Connection getConnection() {
    Connection connection = null;
    PreparedStatement statement=null;
    ResultSet result=null;
    String URL="jdbc:mysql://localhost:3306/itech_project";
    String USER = "root";
    String PASSWORD = "Ced11@#01$";   
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return connection;
      
    }
    public ForgetPassword() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        newPassword = new javax.swing.JPasswordField();
        save = new javax.swing.JButton();
        goBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Username");

        jLabel2.setText("New password");

        name.setText("Enter username");
        name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFocusLost(evt);
            }
        });

        newPassword.setText("**********");
        newPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                newPasswordFocusLost(evt);
            }
        });
        newPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPasswordActionPerformed(evt);
            }
        });

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        goBack.setText("Back");
        goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackActionPerformed(evt);
            }
        });

        jLabel3.setText("New password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(goBack, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(newPassword))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goBack))
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
       try {
           connection = DriverManager.getConnection(URL, USER, PASSWORD);
           Statement st= connection.createStatement();
           String registerQuery= "update register_tbl set password="+String.valueOf(newPassword.getText()+" where username='"+name.getText()+"'");
           st.executeUpdate(registerQuery);
           String loginQuery= "update login_tbl set password="+String.valueOf(newPassword.getText()+" where username='"+name.getText()+"'");
           st.executeUpdate(loginQuery);
           JOptionPane.showMessageDialog(null, "Password updated");
           
           new LoginPage().setVisible(true);
           this.dispose();
       } catch (SQLException ex) {
           Logger.getLogger(ForgetPassword.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    }//GEN-LAST:event_saveActionPerformed

    private void nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusGained
        if(name.getText().equals("Enter username")){
           name.setText("");
           name.setForeground(new Color(51,51,51));
       }
    }//GEN-LAST:event_nameFocusGained

    private void nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusLost
         if(name.getText().equals("")){
           name.setText("Enter username");
           name.setForeground(new Color(51,51,51));
       }
    }//GEN-LAST:event_nameFocusLost

    private void newPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newPasswordFocusGained
         if(newPassword.getText().equals("**********")){
           newPassword.setText("");
           newPassword.setForeground(new Color(51,51,51));
       }
    }//GEN-LAST:event_newPasswordFocusGained

    private void newPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newPasswordFocusLost
            if(newPassword.getText().equals("")){
           newPassword.setText("**********");
           newPassword.setForeground(new Color(51,51,51));
       }
    }//GEN-LAST:event_newPasswordFocusLost

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed
        new LoginPage().setVisible(true);
           this.dispose();
    }//GEN-LAST:event_goBackActionPerformed

    private void newPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgetPassword().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField newPassword;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
