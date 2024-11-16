/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package harvesteaseinventoryprototype.Gui;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author USER
 */
public class AddStock extends javax.swing.JFrame {

    public AddStock() {
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
        jLabel5 = new javax.swing.JLabel();
        prodCategory = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        prodIDTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        prodNameTF = new javax.swing.JTextField();
        addProductBT = new javax.swing.JButton();
        cancelBT = new javax.swing.JButton();
        searchBT = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        stocksTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Stock | Harvest Ease IMS");
        setSize(350, 460);
        setLocationRelativeTo(null);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/harvesteaseinventoryprototype/Gui/addProduct.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(130, 20, 100, 100);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("ADD STOCKS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 130, 120, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setText("Category:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 180, 70, 21);

        prodCategory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prodCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Food", "Beverages", "Medicine" }));
        jPanel1.add(prodCategory);
        prodCategory.setBounds(140, 180, 170, 26);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setText("Product ID:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 220, 80, 21);

        prodIDTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prodIDTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodIDTFActionPerformed(evt);
            }
        });
        jPanel1.add(prodIDTF);
        prodIDTF.setBounds(140, 220, 80, 26);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("Name:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 260, 50, 21);

        prodNameTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prodNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodNameTFActionPerformed(evt);
            }
        });
        jPanel1.add(prodNameTF);
        prodNameTF.setBounds(140, 260, 170, 26);
        prodNameTF.setEditable(false);

        addProductBT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addProductBT.setText("ADD");
        addProductBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductBTActionPerformed(evt);
            }
        });
        jPanel1.add(addProductBT);
        addProductBT.setBounds(60, 350, 90, 40);
        addProductBT.setEnabled(false);

        cancelBT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelBT.setText("CANCEL");
        cancelBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBTActionPerformed(evt);
            }
        });
        jPanel1.add(cancelBT);
        cancelBT.setBounds(190, 350, 90, 40);

        searchBT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchBT.setText("SEARCH");
        searchBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTActionPerformed(evt);
            }
        });
        jPanel1.add(searchBT);
        searchBT.setBounds(230, 220, 80, 25);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setText("Enter Stocks:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 300, 90, 21);

        stocksTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        stocksTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stocksTFActionPerformed(evt);
            }
        });
        jPanel1.add(stocksTF);
        stocksTF.setBounds(140, 300, 170, 26);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prodIDTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodIDTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodIDTFActionPerformed

    private void prodNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodNameTFActionPerformed

    private void addProductBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductBTActionPerformed
        if(prodIDTF.getText().isEmpty() || prodNameTF.getText().isEmpty() || stocksTF.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill all the field", "Message", JOptionPane.INFORMATION_MESSAGE);
            clearFields();
            prodIDTF.setText("");
        }else{
            addStock();
        }
    }//GEN-LAST:event_addProductBTActionPerformed

    private void cancelBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBTActionPerformed
        AdminMenu adminMenu = new AdminMenu();
        adminMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelBTActionPerformed

    private void searchBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTActionPerformed
        if(prodIDTF.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter first the product ID", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else{
            searchProduct();
        }
    }//GEN-LAST:event_searchBTActionPerformed

    private void stocksTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stocksTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stocksTFActionPerformed

    //----------------------------------------------------------------------------------------
    //Methods
    private void searchProduct(){
        try{
            connectToDB();
            String selectedCategory = (String) prodCategory.getSelectedItem();
            boolean theSame = false;
            String checkProduct = "SELECT * FROM product WHERE prod_ID = ? and prod_type = ?";
            PreparedStatement checkStatement = connection.prepareStatement(checkProduct);
            checkStatement.setString(1, prodIDTF.getText());
            checkStatement.setString(2, selectedCategory);
            ResultSet resultSet = checkStatement.executeQuery();
            if (resultSet.next()) {
                prodNameTF.setText(resultSet.getString("prod_name"));
                addProductBT.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "Product ID and Product Type is not the same", "Message", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error adding Stock: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addStock() {
        String prodStock = stocksTF.getText();
        int stockToAdd;
        try {
            stockToAdd = Integer.parseInt(prodStock);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid stock value: " + prodStock, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int stockTemp = 0;
        try {
            connectToDB();

            // Retrieve the current stock
            String getStock = "SELECT prod_quantity FROM product WHERE prod_ID = ?";
            PreparedStatement getStockStatement = connection.prepareStatement(getStock);
            getStockStatement.setString(1, prodIDTF.getText());
            ResultSet resultSet = getStockStatement.executeQuery();

            if (resultSet.next()) {
                stockTemp = resultSet.getInt("prod_quantity");
                stockTemp += stockToAdd;
            }

            // Update the stock
            String addProduct = "UPDATE product SET prod_quantity = ? WHERE prod_ID = ?";
            PreparedStatement updateStatement = connection.prepareStatement(addProduct);
            updateStatement.setInt(1, stockTemp);
            updateStatement.setString(2, prodIDTF.getText());
            int rowsAffected = updateStatement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Stock added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                clearFields();
                AdminMenu adminMenu = new AdminMenu();
                adminMenu.setVisible(true);
                dispose();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error updating stock: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void clearFields(){
        prodIDTF.setText("");
        prodNameTF.setText("");
        stocksTF.setText("");
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
            java.util.logging.Logger.getLogger(AddStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProductBT;
    private javax.swing.JButton cancelBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> prodCategory;
    private javax.swing.JTextField prodIDTF;
    private javax.swing.JTextField prodNameTF;
    private javax.swing.JButton searchBT;
    private javax.swing.JTextField stocksTF;
    // End of variables declaration//GEN-END:variables
}
