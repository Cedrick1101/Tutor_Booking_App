
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public void currentTime(){
       new javax.swing.Timer(0, new ActionListener() {
   @Override
   public void actionPerformed(ActionEvent e) {
   Date d = new Date();
   SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
   currentT.setText(s.format(d));
           }
           
       }
       
         ).start();
   }
    public Home() {
        initComponents();
        currentTime();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        bookingButton = new javax.swing.JButton();
        chatButton = new javax.swing.JButton();
        sendEmailConfirmationButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        about = new javax.swing.JButton();
        currentT = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookingButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bookingButton.setText("BOOKING");
        bookingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingButtonActionPerformed(evt);
            }
        });
        jPanel2.add(bookingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 120, 50));

        chatButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chatButton.setText("CHAT");
        chatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatButtonActionPerformed(evt);
            }
        });
        jPanel2.add(chatButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 130, 50));

        sendEmailConfirmationButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sendEmailConfirmationButton.setText("SEND CONFIRMATION EMAIL");
        sendEmailConfirmationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendEmailConfirmationButtonActionPerformed(evt);
            }
        });
        jPanel2.add(sendEmailConfirmationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 240, 50));

        backButton.setBackground(new java.awt.Color(204, 0, 0));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel2.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 50));

        logOutButton.setBackground(new java.awt.Color(153, 0, 0));
        logOutButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logOutButton.setText("EXIT");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });
        jPanel2.add(logOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 112, 50));

        about.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        about.setText("ABOUT");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        jPanel2.add(about, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 130, 50));

        currentT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        currentT.setText("Time");
        jPanel2.add(currentT, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 140, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePic.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatButtonActionPerformed
          // TODO add your handling code here:
        setVisible(false);
        new Chat().setVisible(true);
        
    }//GEN-LAST:event_chatButtonActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
          setVisible(false);
          new About().setVisible(true);
    }//GEN-LAST:event_aboutActionPerformed

    private void bookingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingButtonActionPerformed
        // TODO add your handling code here:
        Booking bk = new Booking();
        bk.show(); //display Booking.java here
        dispose(); //close Home.java after openneing Booking.java
    }//GEN-LAST:event_bookingButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
            int confirm;
            confirm= JOptionPane.showConfirmDialog(null, "Do you really want to exit", "Exit", JOptionPane.YES_NO_OPTION);
            if(confirm ==JOptionPane.YES_OPTION){
                setVisible(false);
                new LoginPage().setVisible(true);
            }else{
                setVisible(true);
            }
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void sendEmailConfirmationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendEmailConfirmationButtonActionPerformed
        // TODO add your handling code here:
        Email em = new Email();
        em.show(); 
        dispose(); 
    }//GEN-LAST:event_sendEmailConfirmationButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new StatusConfirmation().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about;
    private javax.swing.JButton backButton;
    private javax.swing.JButton bookingButton;
    private javax.swing.JButton chatButton;
    private javax.swing.JLabel currentT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton sendEmailConfirmationButton;
    // End of variables declaration//GEN-END:variables
}
