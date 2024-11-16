/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package harvesteaseinventoryprototype.Gui;

import javax.swing.*;
import javax.swing.plaf.nimbus.State;
import java.sql.*;

/**
 *
 * @author USER
 */
public class EditStaff extends javax.swing.JFrame {

    /**
     * Creates new form EditStaff
     */
    public EditStaff() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private Connection connection;
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
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        staffIDField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        unFIeld = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pwFIeld = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nameField1 = new javax.swing.JTextField();
        searchBT = new javax.swing.JButton();
        editStaffBT = new javax.swing.JButton();
        cancelBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Staff | Harvest Ease IMS");
        setSize(350, 450);
        setLocationRelativeTo(null);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(355, 470));
        jPanel1.setMinimumSize(new java.awt.Dimension(355, 470));
        jPanel1.setPreferredSize(new java.awt.Dimension(355, 470));
        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/harvesteaseinventoryprototype/Gui/edit-info.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(130, 20, 100, 100);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("EDIT STAFF");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 120, 100, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setText("Staff ID:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 180, 60, 21);

        staffIDField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        staffIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffIDFieldActionPerformed(evt);
            }
        });
        jPanel1.add(staffIDField);
        staffIDField.setBounds(130, 180, 80, 26);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setText("Username:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 260, 80, 21);

        unFIeld.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        unFIeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unFIeldActionPerformed(evt);
            }
        });
        jPanel1.add(unFIeld);
        unFIeld.setBounds(130, 260, 170, 26);
        unFIeld.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 300, 80, 21);

        pwFIeld.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pwFIeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwFIeldActionPerformed(evt);
            }
        });
        jPanel1.add(pwFIeld);
        pwFIeld.setBounds(130, 300, 170, 26);
        pwFIeld.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("Name:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 220, 50, 21);

        nameField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameField1ActionPerformed(evt);
            }
        });
        jPanel1.add(nameField1);
        nameField1.setBounds(130, 220, 170, 26);
        nameField1.setEditable(false);

        searchBT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchBT.setText("SEARCH");
        searchBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTActionPerformed(evt);
            }
        });
        jPanel1.add(searchBT);
        searchBT.setBounds(220, 180, 80, 23);

        editStaffBT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editStaffBT.setText("EDIT");
        editStaffBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editStaffBTActionPerformed(evt);
            }
        });
        jPanel1.add(editStaffBT);
        editStaffBT.setBounds(60, 360, 90, 40);
        editStaffBT.setEnabled(false);

        cancelBT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelBT.setText("CANCEL");
        cancelBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBTActionPerformed(evt);
            }
        });
        jPanel1.add(cancelBT);
        cancelBT.setBounds(190, 360, 90, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void staffIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffIDFieldActionPerformed

    private void unFIeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unFIeldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unFIeldActionPerformed

    private void pwFIeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwFIeldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwFIeldActionPerformed

    private void nameField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameField1ActionPerformed

    private void editStaffBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStaffBTActionPerformed
        if(staffIDField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter first the staff ID", "Message", JOptionPane.INFORMATION_MESSAGE);
        }else {
            editStaff();
        }
    }//GEN-LAST:event_editStaffBTActionPerformed

    private void cancelBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBTActionPerformed
        AdminMenu adminMenu = new AdminMenu();
        adminMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelBTActionPerformed

    private void searchBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTActionPerformed
        if(staffIDField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter first the staff ID", "Message", JOptionPane.INFORMATION_MESSAGE);
        }else {
            searchStaff();
        }
    }//GEN-LAST:event_searchBTActionPerformed

    ///---------------------------------------------------------------------------------------------------------------

    //Methods
    private void searchStaff(){
        connectToDB();
        String staffID = staffIDField.getText();
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM staff WHERE staff_ID='" + staffID + "'";
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                nameField1.setText(resultSet.getString("name"));
                unFIeld.setText(resultSet.getString("username"));
                pwFIeld.setText(resultSet.getString("password"));
                nameField1.setEditable(true);
                unFIeld.setEditable(true);
                pwFIeld.setEditable(true);
                editStaffBT.setEnabled(true);
            } else {
                editStaffBT.setEnabled(false);
                clearFields();
                staffIDField.setText("");
                JOptionPane.showMessageDialog(this, "No data found with the specified Book Code.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to search for data in the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void editStaff(){
        String staffID = staffIDField.getText();
        String staffName = nameField1.getText();
        String staffUsername = unFIeld.getText();
        String staffPW = pwFIeld.getText();

        try {
            Statement statement = connection.createStatement();
            String sql = "UPDATE staff SET name='" + staffName + "', username='" + staffUsername + "', password='" + staffPW + "' WHERE staff_ID='" + staffID + "'";
            int rowsAffected = statement.executeUpdate(sql);
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Data updated successfully.");
                AdminMenu adminMenu = new AdminMenu();
                adminMenu.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "No data found with the specified Staff ID.", "Error", JOptionPane.ERROR_MESSAGE);
                clearFields();
                staffIDField.setText("");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to update data in the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearFields(){
        nameField1.setText("");
        unFIeld.setText("");
        pwFIeld.setText("");
    }

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
            java.util.logging.Logger.getLogger(EditStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBT;
    private javax.swing.JButton editStaffBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameField1;
    private javax.swing.JTextField pwFIeld;
    private javax.swing.JButton searchBT;
    private javax.swing.JTextField staffIDField;
    private javax.swing.JTextField unFIeld;
    // End of variables declaration//GEN-END:variables
}
