
import java.awt.Color;
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
import za.ac.tut.valideemail.ValideEmail;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOME
 */
public class Register extends javax.swing.JFrame {
    
   Connection connection = null;
   PreparedStatement statement = null;
   PreparedStatement state = null;
   String url = "jdbc:mysql://localhost:3306/itech_project";
   String username = "root";
   String password = "Ced11@#01$";
   ResultSet results  = null;
   

    /**
     * Creates new form Register
     */
   public void currentTime(){
       new Timer(0, new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
           Date d = new Date();
           SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
           currentTime.setText(s.format(d));
           }
           
       }
       
         ).start();
   }
    public Register() {
        initComponents(); 
        currentTime();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        passwd = new javax.swing.JPasswordField();
        confirm = new javax.swing.JPasswordField();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        saveInformation = new javax.swing.JButton();
        status = new javax.swing.JComboBox();
        surname = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        studentNumber = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        subject1 = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        show = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        currentTime = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Computer Science Courses\\2) SECOND  YEAR\\Advanced Object-Oriented Programming\\AOP PROJECT\\Booking App\\ProjectAOP\\src\\signup.png")); // NOI18N
        jLabel1.setText("Sign up");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 145, 52));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Computer Science Courses\\2) SECOND  YEAR\\Advanced Object-Oriented Programming\\AOP PROJECT\\Booking App\\ProjectAOP\\src\\user.png")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 199, 84, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Computer Science Courses\\2) SECOND  YEAR\\Advanced Object-Oriented Programming\\AOP PROJECT\\Booking App\\ProjectAOP\\src\\name1.png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 135, 65, 46));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Computer Science Courses\\2) SECOND  YEAR\\Advanced Object-Oriented Programming\\AOP PROJECT\\Booking App\\ProjectAOP\\src\\lock.png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 84, 44));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Computer Science Courses\\2) SECOND  YEAR\\Advanced Object-Oriented Programming\\AOP PROJECT\\Booking App\\ProjectAOP\\src\\email.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 65, 54));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Computer Science Courses\\2) SECOND  YEAR\\Advanced Object-Oriented Programming\\AOP PROJECT\\Booking App\\ProjectAOP\\src\\lock.png")); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 326, 69, -1));

        passwd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        passwd.setForeground(new java.awt.Color(102, 102, 102));
        passwd.setText("Password");
        passwd.setBorder(null);
        passwd.setEchoChar('\u0000');
        passwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwdFocusLost(evt);
            }
        });
        passwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwdActionPerformed(evt);
            }
        });
        jPanel1.add(passwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 264, 162, 45));

        confirm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        confirm.setForeground(new java.awt.Color(102, 102, 102));
        confirm.setText("Confirm password");
        confirm.setBorder(null);
        confirm.setEchoChar('\u0000');
        confirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmFocusLost(evt);
            }
        });
        jPanel1.add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 326, 162, 37));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Computer Science Courses\\2) SECOND  YEAR\\Advanced Object-Oriented Programming\\AOP PROJECT\\Booking App\\ProjectAOP\\src\\subject.png")); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 65, 52));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Computer Science Courses\\2) SECOND  YEAR\\Advanced Object-Oriented Programming\\AOP PROJECT\\Booking App\\ProjectAOP\\src\\year.png")); // NOI18N
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 57, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Computer Science Courses\\2) SECOND  YEAR\\Advanced Object-Oriented Programming\\AOP PROJECT\\Booking App\\ProjectAOP\\src\\student.png")); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 81, 56));

        saveInformation.setBackground(new java.awt.Color(0, 153, 255));
        saveInformation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        saveInformation.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Computer Science Courses\\2) SECOND  YEAR\\Advanced Object-Oriented Programming\\AOP PROJECT\\Booking App\\ProjectAOP\\src\\save.png")); // NOI18N
        saveInformation.setText("Save ");
        saveInformation.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 51), new java.awt.Color(0, 255, 51), new java.awt.Color(0, 255, 51), new java.awt.Color(0, 255, 51)));
        saveInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveInformationActionPerformed(evt);
            }
        });
        jPanel1.add(saveInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 150, -1));

        status.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Student", "Tutor" }));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 230, 56));

        surname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        surname.setForeground(new java.awt.Color(102, 102, 102));
        surname.setText("Enter surname");
        surname.setBorder(null);
        surname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                surnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                surnameFocusLost(evt);
            }
        });
        surname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnameActionPerformed(evt);
            }
        });
        jPanel1.add(surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 135, 162, 44));

        name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        name.setForeground(new java.awt.Color(102, 102, 102));
        name.setText("Enter name");
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
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 70, 162, 46));

        studentNumber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        studentNumber.setForeground(new java.awt.Color(102, 102, 102));
        studentNumber.setText("Enter student number");
        studentNumber.setBorder(null);
        studentNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                studentNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                studentNumberFocusLost(evt);
            }
        });
        studentNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNumberActionPerformed(evt);
            }
        });
        jPanel1.add(studentNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 200, 162, 39));

        email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email.setForeground(new java.awt.Color(102, 102, 102));
        email.setText("Email");
        email.setBorder(null);
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 234, 50));

        subject1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        subject1.setForeground(new java.awt.Color(102, 102, 102));
        subject1.setText("Enter subject code");
        subject1.setBorder(null);
        subject1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                subject1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                subject1FocusLost(evt);
            }
        });
        subject1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subject1ActionPerformed(evt);
            }
        });
        jPanel1.add(subject1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 230, 52));

        year.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        year.setForeground(new java.awt.Color(102, 102, 102));
        year.setText("Enter your year");
        year.setBorder(null);
        year.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                yearFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                yearFocusLost(evt);
            }
        });
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });
        jPanel1.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 230, 48));

        show.setBackground(new java.awt.Color(0, 0, 0));
        show.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        show.setForeground(new java.awt.Color(255, 255, 255));
        show.setText("View password");
        show.setBorder(null);
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        jPanel1.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 397, 118, 37));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Computer Science Courses\\2) SECOND  YEAR\\Advanced Object-Oriented Programming\\AOP PROJECT\\Booking App\\ProjectAOP\\src\\name1.png")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 70, 65, 46));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 122, 162, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 185, 162, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 245, 169, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 315, 171, 5));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 384, 171, -1));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 119, 184, -1));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 197, 184, -1));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 184, 10));

        currentTime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(currentTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 24, 92, 21));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RegisterPic.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, -1));

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

    
    private void saveInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveInformationActionPerformed

          //call validateEmail method from valideEmail Class
      boolean emailStatus=ValideEmail.validateEmail(email.getText());
     
     
          // set the condition to get a valid username
         if(emailStatus){
        
       try {
           connection = DriverManager.getConnection(url,username, password);
            String sql = "INSERT INTO register_tbl" + "(name,surname,student_number,password,username,subject,year,status)"
                         + "VALUES (?,?,?,?,?,?,?,?)";
            String sql2 = "INSERT INTO login_tbl" + "(username,password)"
                         + "VALUES (?,?)";
            
            statement = connection.prepareStatement(sql);
            state = connection.prepareStatement(sql2);
            
            statement.setString(1, name.getText());
            statement.setString(2, surname.getText());
            statement.setString(3, studentNumber.getText());
            statement.setString(4, passwd.getText());
            statement.setString(5, email.getText());
            statement.setString(6, subject1.getText());
            statement.setString(7, year.getText());
            statement.setString(8, String.valueOf(status.getSelectedItem()));
                   
            state.setString(1, email.getText());
            state.setString(2, passwd.getText());
            //status.addItem(status);
            state.executeUpdate();
            statement.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Registration is successfull");
                 
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,ex);
       } 
                setVisible(false);
                new LoginPage().setVisible(true); 
                }else{
              JOptionPane.showMessageDialog(null, "Invalid email address!"+"\n"+
                                                  "Invalid password. \n Please provide at least "+"\n"+
                                                  "Lower case, upper case, "+"\n"+
                                                  "digit and special character","ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
            
    }//GEN-LAST:event_saveInformationActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        Tutor tutor = new Tutor();
        setVisible(false);
        tutor.setVisible(true);
        
    }//GEN-LAST:event_statusActionPerformed

    private void surnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_surnameFocusGained
        if(surname.getText().equals("Enter surname")){
           surname.setText("");
           surname.setForeground(new Color(153,153,153));
       }
    }//GEN-LAST:event_surnameFocusGained

    private void surnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_surnameFocusLost
        if(surname.getText().equals("")){
           surname.setText("Enter surname");
           surname.setForeground(new Color(153,153,153));
       }
    }//GEN-LAST:event_surnameFocusLost

    private void nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusGained
       if(name.getText().equals("Enter name")){
          name.setText("");
          name.setForeground(new Color(153,153,153));
       }
    }//GEN-LAST:event_nameFocusGained

    private void nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusLost
        if(name.getText().equals("")){
          name.setText("Enter name");
          name.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_nameFocusLost

    private void surnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surnameActionPerformed

    private void studentNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_studentNumberFocusGained
        
        if(studentNumber.getText().equals("Enter student number")){
          studentNumber.setText("");
          studentNumber.setForeground(new Color(153,153,153));
       }
    }//GEN-LAST:event_studentNumberFocusGained

    private void studentNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_studentNumberFocusLost
        if(studentNumber.getText().equals("")){
          studentNumber.setText("Enter student number");
          studentNumber.setForeground(new Color(153,153,153));
       }
    }//GEN-LAST:event_studentNumberFocusLost

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        if(email.getText().equals("Email")){
          email.setText("");
          email.setForeground(new Color(153,153,153));
       }
    }//GEN-LAST:event_emailFocusGained

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        if(email.getText().equals("")){
          email.setText("Email");
          email.setForeground(new Color(153,153,153));
       }
    }//GEN-LAST:event_emailFocusLost

    private void passwdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwdFocusGained
        if(passwd.getText().equals("Password")){
          passwd.setText("");
          passwd.setForeground(new Color(153,153,153));
       }
    }//GEN-LAST:event_passwdFocusGained

    private void passwdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwdFocusLost
        if(passwd.getText().equals("")){
          passwd.setText("Password");
          passwd.setForeground(new Color(153,153,153));
       }
    }//GEN-LAST:event_passwdFocusLost

    private void confirmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmFocusGained
        if(confirm.getText().equals("Confirm password")){
          confirm.setText("");
          confirm.setForeground(new Color(153,153,153));
       }
    }//GEN-LAST:event_confirmFocusGained

    private void confirmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmFocusLost
        if(confirm.getText().equals("")){
          confirm.setText("Confirm password");
          confirm.setForeground(new Color(153,153,153));
       }
    }//GEN-LAST:event_confirmFocusLost

    private void subject1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_subject1FocusGained
        if(subject1.getText().equals("Enter subject code")){
          subject1.setText("");
          subject1.setForeground(new Color(153,153,153));
       }
    }//GEN-LAST:event_subject1FocusGained

    private void subject1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_subject1FocusLost
        if(subject1.getText().equals("")){
          subject1.setText("Enter subject code");
          subject1.setForeground(new Color(153,153,153));
       }
    }//GEN-LAST:event_subject1FocusLost

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        if(show.isSelected()){
            passwd.setEchoChar((char)0);
            confirm.setEchoChar((char)0);
        }else{
            passwd.setEchoChar('*');
            confirm.setEchoChar('*');
        }
    }//GEN-LAST:event_showActionPerformed

    private void studentNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentNumberActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void yearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yearFocusLost
        if(year.getText().equals("")){
            year.setText("Enter your year");
            year.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_yearFocusLost

    private void yearFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yearFocusGained
        if(year.getText().equals("Enter your year")){
            year.setText("");
            year.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_yearFocusGained

    private void subject1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subject1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subject1ActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void passwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwdActionPerformed

    public static void main(String args[]){
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
           ex.printStackTrace();
        }
       //</editor-fold>
       
        //</editor-fold>

        /* Create and display the form */ 
        java.awt.EventQueue.invokeLater(() -> {
            new Register().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirm;
    private javax.swing.JLabel currentTime;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField passwd;
    private javax.swing.JButton saveInformation;
    private javax.swing.JCheckBox show;
    private javax.swing.JComboBox status;
    private javax.swing.JTextField studentNumber;
    private javax.swing.JTextField subject1;
    private javax.swing.JTextField surname;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
