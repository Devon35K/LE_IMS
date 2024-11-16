/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package harvesteaseinventoryprototype.Gui;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author USER
 */
public class EditProduct extends javax.swing.JFrame {

    /**
     * Creates new form EditProduct
     */
    public EditProduct() {
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
        searchBT = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        prodIDField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        prodNameTF = new javax.swing.JTextField();
        editProductBT = new javax.swing.JButton();
        prodPriceTF = new javax.swing.JTextField();
        cancelBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Product | Harvest Ease IMS");
        setSize(350, 450);
        setLocationRelativeTo(null);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(350, 455));
        jPanel1.setMinimumSize(new java.awt.Dimension(350, 455));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 455));
        jPanel1.setLayout(null);

        searchBT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchBT.setText("SEARCH");
        searchBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTActionPerformed(evt);
            }
        });
        jPanel1.add(searchBT);
        searchBT.setBounds(220, 180, 80, 23);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("EDIT PRODUCT");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(110, 130, 130, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setText("Product Code:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 180, 80, 21);

        prodIDField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prodIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodIDFieldActionPerformed(evt);
            }
        });
        jPanel1.add(prodIDField);
        prodIDField.setBounds(130, 180, 80, 26);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/harvesteaseinventoryprototype/Gui/editProduct.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(130, 20, 100, 100);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("Name:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 220, 50, 21);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setText("Price:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 260, 60, 21);

        prodNameTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prodNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodNameTFActionPerformed(evt);
            }
        });
        jPanel1.add(prodNameTF);
        prodNameTF.setBounds(130, 220, 170, 26);
        prodNameTF.setEditable(false);

        editProductBT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editProductBT.setText("EDIT");
        editProductBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProductBTActionPerformed(evt);
            }
        });
        jPanel1.add(editProductBT);
        editProductBT.setBounds(60, 330, 90, 40);
        editProductBT.setEnabled(false);

        prodPriceTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prodPriceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodPriceTFActionPerformed(evt);
            }
        });
        jPanel1.add(prodPriceTF);
        prodPriceTF.setBounds(130, 260, 170, 26);
        prodPriceTF.setEditable(false);

        cancelBT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelBT.setText("CANCEL");
        cancelBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBTActionPerformed(evt);
            }
        });
        jPanel1.add(cancelBT);
        cancelBT.setBounds(190, 330, 90, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 350, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prodIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodIDFieldActionPerformed

    private void searchBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTActionPerformed
        if(prodIDField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter first the Product Code", "Message", JOptionPane.INFORMATION_MESSAGE);
        }else{
            searchProduct();
        }
    }//GEN-LAST:event_searchBTActionPerformed

    private void prodNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodNameTFActionPerformed

    private void prodPriceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodPriceTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodPriceTFActionPerformed

    private void editProductBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProductBTActionPerformed
        if(prodNameTF.getText().isEmpty() || prodNameTF.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill all the field", "Message", JOptionPane.INFORMATION_MESSAGE);
            clearFields();
        }else{
            editProduct();
        }
    }//GEN-LAST:event_editProductBTActionPerformed

    private void cancelBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBTActionPerformed
        AdminMenu adminMenu = new AdminMenu();
        adminMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelBTActionPerformed

    //---------------------------------------------------------------------------------------------------
    //Methods
    private void searchProduct(){
        connectToDB();
        String productID = prodIDField.getText();
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM product WHERE prod_ID='" + productID + "'";
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                prodNameTF.setText(resultSet.getString("prod_name"));
                prodPriceTF.setText(resultSet.getString("prod_price"));
                editProductBT.setEnabled(true);
                prodNameTF.setEditable(true);
                prodPriceTF.setEditable(true);
            } else {
                editProductBT.setEnabled(false);
                clearFields();
                prodIDField.setText("");
                JOptionPane.showMessageDialog(this, "No data found with the specified Product Code.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to search for data in the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void editProduct(){
        String productID = prodIDField.getText();
        String prodName = prodNameTF.getText();
        String prodPrice = prodPriceTF.getText();

        try {
            Statement statement = connection.createStatement();
            String sql = "UPDATE product SET prod_name='" + prodName + "', prod_price='" + prodPrice + "' WHERE prod_ID='" + productID + "'";
            int rowsAffected = statement.executeUpdate(sql);
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Data updated successfully.");
                AdminMenu adminMenu = new AdminMenu();
                adminMenu.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "No data found with the specified Product Code.", "Error", JOptionPane.ERROR_MESSAGE);
                clearFields();
                prodIDField.setText("");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to update data in the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearFields(){
        prodNameTF.setText("");
        prodPriceTF.setText("");
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
            java.util.logging.Logger.getLogger(EditProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBT;
    private javax.swing.JButton editProductBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField prodIDField;
    private javax.swing.JTextField prodNameTF;
    private javax.swing.JTextField prodPriceTF;
    private javax.swing.JButton searchBT;
    // End of variables declaration//GEN-END:variables
}
