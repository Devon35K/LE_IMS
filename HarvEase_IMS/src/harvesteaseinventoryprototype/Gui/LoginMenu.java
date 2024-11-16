/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package harvesteaseinventoryprototype.Gui;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class LoginMenu extends javax.swing.JFrame {

    public LoginMenu() {
        initComponents();
    }
    Connection connection;
    private void displaySQLErrors(SQLException e) {
        System.out.println("SQLException: " + e.getMessage());
        System.out.println("SQLState: " + e.getSQLState());
        System.out.println("VendorError: " + e.getErrorCode());
    }

    public void connectToDB() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/harvesteasedb","root", "");
        }
        catch(SQLException e) {
            displaySQLErrors(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SIGN_PANEL = new javax.swing.JPanel();
        SignIn_Label = new javax.swing.JLabel();
        Username_Label = new javax.swing.JLabel();
        UN_Field = new javax.swing.JTextField();
        UN_Separator = new javax.swing.JSeparator();
        Password_Label1 = new javax.swing.JLabel();
        PW_Field = new javax.swing.JPasswordField();
        PW_Separator1 = new javax.swing.JSeparator();
        SignIn_Button = new javax.swing.JButton();
        Display_Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 400));
        setResizable(false);
        setTitle("Harvest Ease | Inventory Management System");

        SIGN_PANEL.setBackground(new java.awt.Color(255, 255, 255));

        SignIn_Label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        SignIn_Label.setText("SIGN IN");

        Username_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Username_Label.setText("USERNAME");

        UN_Field.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        UN_Field.setBorder(null);

        Password_Label1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Password_Label1.setText("PASSWORD");

        PW_Field.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        PW_Field.setBorder(null);

        SignIn_Button.setBackground(new java.awt.Color(49, 54, 63));
        SignIn_Button.setForeground(new java.awt.Color(255, 255, 255));
        SignIn_Button.setText("SIGN_IN");
        SignIn_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignIn_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SIGN_PANELLayout = new javax.swing.GroupLayout(SIGN_PANEL);
        SIGN_PANEL.setLayout(SIGN_PANELLayout);
        SIGN_PANELLayout.setHorizontalGroup(
            SIGN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SIGN_PANELLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(SIGN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SignIn_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Username_Label)
                    .addComponent(UN_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UN_Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password_Label1)
                    .addComponent(PW_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PW_Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SignIn_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        SIGN_PANELLayout.setVerticalGroup(
            SIGN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SIGN_PANELLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(SignIn_Label)
                .addGap(42, 42, 42)
                .addComponent(Username_Label)
                .addGap(6, 6, 6)
                .addComponent(UN_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(UN_Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Password_Label1)
                .addGap(6, 6, 6)
                .addComponent(PW_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(PW_Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(SignIn_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        Display_Panel.setBackground(new java.awt.Color(245, 245, 245));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/harvesteaseinventoryprototype/Icons/Login_Icon.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout Display_PanelLayout = new javax.swing.GroupLayout(Display_Panel);
        Display_Panel.setLayout(Display_PanelLayout);
        Display_PanelLayout.setHorizontalGroup(
            Display_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Display_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        Display_PanelLayout.setVerticalGroup(
            Display_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Display_PanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(Display_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(SIGN_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Display_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(SIGN_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SignIn_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignIn_ButtonActionPerformed
        boolean staffLogin = false;
        try{
            connectToDB();
            String sql = "select * from staff";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                String un = resultSet.getString("username");
                String pw = resultSet.getString("password");
                if(un.equals(UN_Field.getText()) && pw.equals(PW_Field.getText())) {
                    staffLogin = true;
                }
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        if(UN_Field.getText().equals("Admin") && PW_Field.getText().equals("Admin123")){ 
            
            JOptionPane.showMessageDialog(null, "Login successfully!");
            
            AdminMenu runAdminMenu = new AdminMenu();
            runAdminMenu.show();
            dispose();
            
        }else if(staffLogin == true){
            JOptionPane.showMessageDialog(null, "Login successfully!");
            StaffMenu runStaffMenu = new StaffMenu();
            runStaffMenu.show();
            dispose();

        }else{
            JOptionPane.showMessageDialog(null, "Cannot find credentials please try again!");
        }
        
    }//GEN-LAST:event_SignIn_ButtonActionPerformed

    public static void main(String args[]) {

        FlatLightLaf.setup();
        config con = new config();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Display_Panel;
    private javax.swing.JPasswordField PW_Field;
    private javax.swing.JSeparator PW_Separator1;
    private javax.swing.JLabel Password_Label1;
    private javax.swing.JPanel SIGN_PANEL;
    private javax.swing.JButton SignIn_Button;
    private javax.swing.JLabel SignIn_Label;
    private javax.swing.JTextField UN_Field;
    private javax.swing.JSeparator UN_Separator;
    private javax.swing.JLabel Username_Label;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
