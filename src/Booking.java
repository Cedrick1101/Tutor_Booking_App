
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Booking extends javax.swing.JFrame {
    
     Connection connection = null;
   PreparedStatement statement = null;
   PreparedStatement state = null;
   String url = "jdbc:mysql://localhost:3306/itech_project";
   String username = "root";
   String password = "Ced11@#01$";
   ResultSet results  = null;
   
     public void currentTime(){
       new Timer(0, new ActionListener() {
       @Override
      public void actionPerformed(ActionEvent e) {
     Date d = new Date();
     SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
    currentT.setText(s.format(d));
           }
           
       }
       
         ).start();
   }
    /**
     * Creates new form Booking
     */
    public Booking() {
        initComponents();
        currentTime();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        moduleName = new javax.swing.JComboBox<String>();
        tutorComboBox = new javax.swing.JComboBox<String>();
        placeComboBox = new javax.swing.JComboBox();
        backButton = new javax.swing.JButton();
        date = new com.toedter.calendar.JDateChooser();
        timeField = new java.awt.TextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        currentT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MODULE NAME");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, 190, 37));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PLACE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 257, 112, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DESCRIPTION");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, 37));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DATE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 128, 112, 37));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("STARTING TIME");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 192, 190, 37));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SELECT TUTOR");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 296, 190, 37));

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setForeground(new java.awt.Color(153, 153, 153));
        descriptionTextArea.setRows(5);
        jScrollPane2.setViewportView(descriptionTextArea);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 220, 53));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("CONFIRM");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, 162, 50));

        moduleName.setBackground(new java.awt.Color(153, 153, 153));
        moduleName.setForeground(new java.awt.Color(153, 153, 153));
        moduleName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "ORS216D", "ISC216D", "AOP216D", "SEF216D", "DTP216D" }));
        moduleName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moduleNameActionPerformed(evt);
            }
        });
        jPanel1.add(moduleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 220, 37));

        tutorComboBox.setBackground(new java.awt.Color(153, 153, 153));
        tutorComboBox.setForeground(new java.awt.Color(153, 153, 153));
        tutorComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Malebane", "Provia", "Hans", "John", "David" }));
        tutorComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutorComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(tutorComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 220, 40));

        placeComboBox.setBackground(new java.awt.Color(153, 153, 153));
        placeComboBox.setForeground(new java.awt.Color(153, 153, 153));
        placeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Campus", "Online" }));
        jPanel1.add(placeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 220, 40));

        backButton.setBackground(new java.awt.Color(153, 0, 0));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 353, 93, 41));

        date.setBackground(new java.awt.Color(153, 153, 153));
        date.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 220, 40));
        jPanel1.add(timeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 220, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BookingPic.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 880, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 91, -1, 422));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Booking Tutor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 29, 192, 39));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 85, 39));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, 874, 10));

        currentT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        currentT.setText("Time");
        getContentPane().add(currentT, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 100, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int confirm;
            confirm= JOptionPane.showConfirmDialog(null, "Do you really want to exit", "Exit", JOptionPane.YES_NO_OPTION);
            if(confirm ==JOptionPane.YES_OPTION){
            setVisible(false);
            new LoginPage().setVisible(true);
            }else{
                setVisible(true);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void moduleNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moduleNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moduleNameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            connection = DriverManager.getConnection(url,username, password);

            String sql = "INSERT INTO booking_tbl" + "(module_name,description,date,time,place,tutor)"
            + "VALUES (?,?,?,?,?,?)";

            statement = connection.prepareStatement(sql);

            statement.setString(1, String.valueOf(moduleName.getSelectedItem()));
            statement.setString(2, descriptionTextArea.getText());
                 //get date
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            String dt = sf.format(date.getDate()); 
            statement.setString(3, dt);
            statement.setString(4,timeField.getText());
            statement.setString(5, String.valueOf(placeComboBox.getSelectedItem()));
            statement.setString(6, String.valueOf(tutorComboBox.getSelectedItem()));
           
            statement.executeUpdate(); 
            JOptionPane.showMessageDialog(null,"Booking successfully");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }

        setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        Home hm = new Home(); 
        hm.show();
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void tutorComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutorComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tutorComboBoxActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel currentT;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> moduleName;
    private javax.swing.JComboBox placeComboBox;
    private java.awt.TextField timeField;
    private javax.swing.JComboBox<String> tutorComboBox;
    // End of variables declaration//GEN-END:variables
}