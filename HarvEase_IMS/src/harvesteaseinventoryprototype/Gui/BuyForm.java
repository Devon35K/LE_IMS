/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package harvesteaseinventoryprototype.Gui;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

/**
 *
 * @author USER
 */
public class BuyForm extends javax.swing.JFrame {

    /**
     * Creates new form BuyForm
     */
    public BuyForm() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buy Form | Harvest Ease IMS");
        setSize(350, 450);
        setLocationRelativeTo(null);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Point of Sale");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 30, 110, 25);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Change:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 190, 60, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("");
        jLabel3.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 190, 120, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Total Amount:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 90, 90, 20);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(90, 150, 90, 22);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("COMPUTE");
        jPanel1.add(jButton1);
        jButton1.setBounds(200, 150, 90, 23);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Cash:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 150, 40, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 90, 70, 20);
        totalAmountToPay();

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(170, 250, 100, 30);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("PAY");
        jPanel1.add(jButton3);
        jButton3.setBounds(50, 250, 90, 30);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        StaffMenu staffMenu = new StaffMenu();
        staffMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the amount to be paid.");
        }else{
            computeCash();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the amount to be paid.");
        }else{
            payProduct();

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    //======================METHODS========================
    private void totalAmountToPay(){
        connectToDB();
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT sum(totalPrice) as totalPrice FROM cart";
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                jLabel6.setText("₱ "+resultSet.getString("totalPrice"));
            } else {
                JOptionPane.showMessageDialog(this, "No data found", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to search for data in the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void computeCash() {
        connectToDB();
        String price = null;
        try{
            Statement statement = connection.createStatement();
            String sql = "SELECT sum(totalPrice) as totalPrice FROM cart";
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                price = resultSet.getString("totalPrice");
            }
            double totalAmount = Double.parseDouble(price);
            double cash = Double.parseDouble(jTextField1.getText());
            double change = 0;
            if (cash < totalAmount) {
                JOptionPane.showMessageDialog(this, "Cash is insufficient", "Error", JOptionPane.ERROR_MESSAGE);
                jTextField1.setText("");
            } else {
                change = cash - totalAmount;
                JOptionPane.showMessageDialog(this, "Computed Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                jLabel3.setText("₱ "+change);
        }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    private void payProduct() {
        connectToDB();
        String productID = null;
        String prodName = null;
        String productQuantity = null;
        String totalAmount = null;
        String prodCategory = null;

        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT cart_ID, item, SUM(totalPrice) as totalPrice, SUM(stock) as totalQuantity FROM cart GROUP BY cart_ID";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                productID = resultSet.getString("cart_ID");
                prodName = resultSet.getString("item");
                totalAmount = resultSet.getString("totalPrice");
                productQuantity = resultSet.getString("totalQuantity");

                Statement searchStatement = connection.createStatement();
                String searchSql = "SELECT * FROM product WHERE prod_ID = '" + productID + "'";
                ResultSet rs = searchStatement.executeQuery(searchSql);

                if (rs.next()) {
                    prodCategory = rs.getString("prod_type");
                }

                String addPayment = "INSERT INTO payment (product_type, product_name, product_quantity, product_TotalPrice) VALUES (?, ?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(addPayment);
                preparedStatement.setString(1, prodCategory);
                preparedStatement.setString(2, prodName);
                preparedStatement.setString(3, productQuantity);
                preparedStatement.setString(4, totalAmount);
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Transaction has been successful.", "Success", JOptionPane.INFORMATION_MESSAGE);
                }


                String addTemp = "INSERT INTO tempHolder (cash, moneyChange) VALUES (?, ?)";
                PreparedStatement ps = connection.prepareStatement(addTemp);
                ps.setString(1, jTextField1.getText());
                ps.setString(2, jLabel3.getText());
                int rowsAffectedTemp = ps.executeUpdate();
                if (rowsAffectedTemp > 0) {

                }

                rs.close();
                searchStatement.close();
            }

            resultSet.close();
            statement.close();


            reciept recieptForm = new reciept();
            recieptForm.setVisible(true);
            dispose();

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to process payment.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getCashText(){
        return jTextField1.getText();
    }

    public String getChangeText(){
        return jLabel3.getText();
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
            java.util.logging.Logger.getLogger(BuyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuyForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
