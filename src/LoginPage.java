
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.JOptionPane;
import za.ac.tut.valideemail.ValideEmail;

public class LoginPage extends javax.swing.JFrame {
    Connection connection;
    PreparedStatement statement=null;
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
    
    public LoginPage() {       
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        show = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 133, 57));

        password.setBackground(new java.awt.Color(240, 240, 240));
        password.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        password.setText("Password");
        password.setBorder(null);
        password.setEchoChar('\u0000');
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 198, 300, 37));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 101, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Sign up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 101, 40));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Forget password");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 220, 44));

        name.setBackground(new java.awt.Color(240, 240, 240));
        name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        name.setForeground(new java.awt.Color(51, 51, 51));
        name.setText("Enter username");
        name.setBorder(null);
        name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFocusLost(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 124, 300, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Computer Science Courses\\2) SECOND  YEAR\\Advanced Object-Oriented Programming\\AOP PROJECT\\Booking App\\ProjectAOP\\src\\username.png")); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 124, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Computer Science Courses\\2) SECOND  YEAR\\Advanced Object-Oriented Programming\\AOP PROJECT\\Booking App\\ProjectAOP\\src\\lock.png")); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 187, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 170, 189, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 241, 189, -1));

        show.setBackground(new java.awt.Color(51, 51, 51));
        show.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        show.setForeground(new java.awt.Color(255, 255, 255));
        show.setText("Show password");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        jPanel2.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 170, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TUT-Logo1.jpg"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginPic.jpg"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String pass= String.valueOf(password.getPassword());
        String username = name.getText();
           
        //call validateEmail method from valideEmail Class
      boolean status=ValideEmail.validateEmail(name.getText());
     
          // set the condition to get a valid username
         if(status){
        try {
            
            String query= "select username,password from login_tbl where username= ? AND password=?";
            statement = LoginPage.getConnection().prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, pass);
            result = statement.executeQuery();
            
       if(result.next()){
           
           //show the confirmation status page
           StatusConfirmation sc = new StatusConfirmation();
           sc.setVisible(true);
           sc.pack();
           sc.setLocationRelativeTo(null);
          
           this.dispose();
       }else{
           //error message
         JOptionPane.showMessageDialog(null, "Error! incorrect password or username" + "\n" +
                 "Provide correct information or create an account", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
       }
    
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex); 
        } 
        }else{
              JOptionPane.showMessageDialog(null, "Invalid username or password! " ,"Wrong password or username", JOptionPane.ERROR_MESSAGE);
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                 setVisible(false);
                new Register().setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       setVisible(false);
       new ForgetPassword().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        if(password.getText().equals("Password")){
            password.setText("");
            password.setForeground(new Color(51,51,51));
        }
    }//GEN-LAST:event_passwordFocusGained

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
           if(password.getText().equals("")){
            password.setText("Password");
            password.setForeground(new Color(51,51,51));
        }    }//GEN-LAST:event_passwordFocusLost

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
       if(show.isSelected()){
           password.setEchoChar((char)0);
       }else{
           password.setEchoChar('*');
       }
    }//GEN-LAST:event_showActionPerformed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            String pass= String.valueOf(password.getPassword());
        String username = name.getText();
        
        try {
            
            String query= "select username,password from login_tbl where username= ? AND password=?";
            statement = LoginPage.getConnection().prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, pass);
            result = statement.executeQuery();
            
       if(result.next()){
           
           //show a new home
           Home home = new Home();
           home.setVisible(true);
           home.pack();
           home.setLocationRelativeTo(null);
           //close the current home(login home)
           this.dispose();
       }else{
           //error message
         JOptionPane.showMessageDialog(null, "Error! incorrect password or username", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
       }
    
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex); 
        }
        }
    }//GEN-LAST:event_passwordKeyPressed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LoginPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JCheckBox show;
    // End of variables declaration//GEN-END:variables
}
