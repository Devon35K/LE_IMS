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
public class AddCart extends javax.swing.JFrame {

    /**
     * Creates new form AddCart
     */
    public AddCart() {
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
        prodCodeTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        prodQuantityTF = new javax.swing.JTextField();
        addCartBT = new javax.swing.JButton();
        cancelBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Cart | Harvest Ease IMS");
        setSize(350, 450);
        setLocationRelativeTo(null);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/harvesteaseinventoryprototype/Gui/add-cart.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(130, 20, 100, 100);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("ADD CART");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 130, 110, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setText("Product ID:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 180, 110, 21);

        prodCodeTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prodCodeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodCodeTFActionPerformed(evt);
            }
        });
        jPanel1.add(prodCodeTF);
        prodCodeTF.setBounds(140, 180, 170, 26);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("Quantity:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 230, 70, 21);

        prodQuantityTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prodQuantityTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodQuantityTFActionPerformed(evt);
            }
        });
        jPanel1.add(prodQuantityTF);
        prodQuantityTF.setBounds(140, 230, 170, 26);

        addCartBT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addCartBT.setText("ADD");
        addCartBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCartBTActionPerformed(evt);
            }
        });
        jPanel1.add(addCartBT);
        addCartBT.setBounds(70, 290, 90, 40);

        cancelBT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelBT.setText("CANCEL");
        cancelBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBTActionPerformed(evt);
            }
        });
        jPanel1.add(cancelBT);
        cancelBT.setBounds(200, 290, 90, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prodCodeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodCodeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodCodeTFActionPerformed

    private void prodQuantityTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodQuantityTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodQuantityTFActionPerformed

    private void addCartBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCartBTActionPerformed
        if(prodCodeTF.getText().isEmpty() || prodQuantityTF.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill all the field", "Message", JOptionPane.INFORMATION_MESSAGE);
            prodCodeTF.setText("");
            prodQuantityTF.setText("");
        } else{
            searchProduct();
        }
    }//GEN-LAST:event_addCartBTActionPerformed

    private void cancelBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBTActionPerformed
        StaffMenu staffMenu = new StaffMenu();
        staffMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelBTActionPerformed

    //============================METHODS=================================
    private void searchProduct(){
        connectToDB();
        String productID = prodCodeTF.getText();
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM product WHERE prod_ID='" + productID + "'";
            ResultSet resultSet = statement.executeQuery(sql);
            int prodStock = Integer.parseInt(prodQuantityTF.getText());
            if (resultSet.next()) {
                int stockFromDB = resultSet.getInt("prod_quantity");
                if(prodStock<=stockFromDB){
                    addCartProd();
                }else {
                    JOptionPane.showMessageDialog(null, "Insuficient Stocks", "Error", JOptionPane.ERROR_MESSAGE);
                    prodQuantityTF.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(this, "No data found with the specified Product ID.", "Error", JOptionPane.ERROR_MESSAGE);
                prodCodeTF.setText("");
                prodQuantityTF.setText("");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to search for data in the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addCartProd(){
        try{
        connectToDB();
        String sql = "SELECT * FROM product where prod_ID = '"+prodCodeTF.getText()+"'";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        int quantityTF = Integer.parseInt(prodQuantityTF.getText());
        double total_Price = 0;
        int quantity = 0;
        while (resultSet.next()) {
            String productID = resultSet.getString("prod_ID");
            String prodName = resultSet.getString("prod_name");
            String prodPrice = resultSet.getString("prod_price");

            double price = Double.parseDouble(prodPrice);
            total_Price = price * quantityTF;

            String addProduct = "INSERT INTO cart (cart_ID, item, totalPrice, stock) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(addProduct);
            preparedStatement.setString(1, productID);
            preparedStatement.setString(2, prodName);
            preparedStatement.setDouble(3, total_Price);
            preparedStatement.setString(4, prodQuantityTF.getText());
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Product added successfully in the cart.", "Success", JOptionPane.INFORMATION_MESSAGE);
                updateStockProduct();
                break;
            }
        }
    }
        catch (SQLException e){
        e.printStackTrace();
    }
    }

    private void updateStockProduct(){
        String productID = prodCodeTF.getText();
        String prodQuantity = prodQuantityTF.getText();
        int prod_Quantity = Integer.parseInt(prodQuantity);
        int quantity = 0;
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT prod_quantity FROM product WHERE prod_ID='" + productID + "'";
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                quantity = Integer.parseInt(resultSet.getString("prod_quantity"));
            } else {
                JOptionPane.showMessageDialog(this, "No data found with the specified Product Code.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to search for data in the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        int tempQuantity = quantity - prod_Quantity;

        try {
            Statement statement = connection.createStatement();
            String sql = "UPDATE product SET prod_quantity='" + tempQuantity +"' WHERE prod_ID='" + productID + "'";
            int rowsAffected = statement.executeUpdate(sql);
            if (rowsAffected > 0) {
                StaffMenu staffMenu = new StaffMenu();
                staffMenu.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "No data found with the specified Product Code.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to update data in the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

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
            java.util.logging.Logger.getLogger(AddCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCartBT;
    private javax.swing.JButton cancelBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField prodCodeTF;
    private javax.swing.JTextField prodQuantityTF;
    // End of variables declaration//GEN-END:variables
}
