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
public class DeleteProduct extends javax.swing.JFrame {

    /**
     * Creates new form DeleteProduct
     */
    public DeleteProduct() {
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
        prodIDField = new javax.swing.JTextField();
        searchBT = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        prodNameTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        prodPriceTF = new javax.swing.JTextField();
        deleteProductBT = new javax.swing.JButton();
        cancelBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delete Product | Harvest Ease IMS");
        setSize(350, 450);
        setLocationRelativeTo(null);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(350, 455));
        jPanel1.setMinimumSize(new java.awt.Dimension(350, 455));
        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/harvesteaseinventoryprototype/Gui/deleteProduct.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(130, 20, 100, 100);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("DELETE PRODUCT");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 130, 160, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setText("Product ID:");
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

        searchBT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchBT.setText("SEARCH");
        searchBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTActionPerformed(evt);
            }
        });
        jPanel1.add(searchBT);
        searchBT.setBounds(220, 180, 80, 23);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("Name:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 220, 50, 21);

        prodNameTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prodNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodNameTFActionPerformed(evt);
            }
        });
        jPanel1.add(prodNameTF);
        prodNameTF.setBounds(130, 220, 170, 26);
        prodNameTF.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setText("Price:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 260, 60, 21);

        prodPriceTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prodPriceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodPriceTFActionPerformed(evt);
            }
        });
        jPanel1.add(prodPriceTF);
        prodPriceTF.setBounds(130, 260, 170, 26);
        prodPriceTF.setEditable(false);

        deleteProductBT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteProductBT.setText("DELETE");
        deleteProductBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProductBTActionPerformed(evt);
            }
        });
        jPanel1.add(deleteProductBT);
        deleteProductBT.setBounds(60, 330, 90, 40);
        deleteProductBT.setEnabled(false);

        cancelBT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelBT.setText("CANCEL");
        cancelBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBTActionPerformed(evt);
            }
        });
        jPanel1.add(cancelBT);
        cancelBT.setBounds(190, 330, 90, 40);

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

    private void prodIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodIDFieldActionPerformed

    private void searchBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTActionPerformed
        if(prodIDField.getText().isEmpty()){
            clearFields();
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

    private void deleteProductBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProductBTActionPerformed
        if(prodNameTF.getText().isEmpty() || prodNameTF.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill all the field", "Message", JOptionPane.INFORMATION_MESSAGE);
            prodNameTF.setText("");
            prodNameTF.setText("");
        }else{
            deleteProduct();
        }
    }//GEN-LAST:event_deleteProductBTActionPerformed

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
                deleteProductBT.setEnabled(true);
                prodNameTF.setEditable(true);
                prodPriceTF.setEditable(true);
            } else {
                deleteProductBT.setEnabled(false);
                clearFields();
                prodIDField.setText("");
                JOptionPane.showMessageDialog(this, "No data found with the specified Product Code.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to search for data in the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteProduct(){
        connectToDB();
        String productID = prodIDField.getText();

        try {
            int result = JOptionPane.showConfirmDialog(null, "Do you want to proceed?", "Message", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                String sql = "DELETE FROM product WHERE prod_ID=?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, productID);
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Product Record deleted successfully.");
                    AdminMenu adminMenu = new AdminMenu();
                    adminMenu.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "No record found with the specified Product Code.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else if (result == JOptionPane.NO_OPTION) {
                clearFields();
                prodIDField.setText("");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to delete record from the database.", "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(DeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBT;
    private javax.swing.JButton deleteProductBT;
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
