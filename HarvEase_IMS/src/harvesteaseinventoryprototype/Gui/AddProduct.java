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
public class AddProduct extends javax.swing.JFrame {

    /**
     * Creates new form AddProduct
     */
    public AddProduct() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        prodCategory = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        prodNameTF = new javax.swing.JTextField();
        addProductBT = new javax.swing.JButton();
        cancelBT = new javax.swing.JButton();
        prodPriceTF1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Product | Harvest Ease IMS");
        setSize(350, 450);
        setLocationRelativeTo(null);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(355, 460));
        jPanel1.setMinimumSize(new java.awt.Dimension(355, 460));
        jPanel1.setPreferredSize(new java.awt.Dimension(355, 460));
        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/harvesteaseinventoryprototype/Gui/addProduct.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(130, 20, 100, 100);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("ADD PRODUCT");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(110, 130, 130, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setText("Name:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 220, 50, 21);

        prodCategory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prodCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Food", "Beverages", "Medicine" }));
        jPanel1.add(prodCategory);
        prodCategory.setBounds(130, 180, 170, 26);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setText("Category:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 180, 70, 21);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("Price:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 260, 50, 21);

        prodNameTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prodNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodNameTFActionPerformed(evt);
            }
        });
        jPanel1.add(prodNameTF);
        prodNameTF.setBounds(130, 220, 170, 26);

        addProductBT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addProductBT.setText("ADD");
        addProductBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductBTActionPerformed(evt);
            }
        });
        jPanel1.add(addProductBT);
        addProductBT.setBounds(60, 330, 90, 40);

        cancelBT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelBT.setText("CANCEL");
        cancelBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBTActionPerformed(evt);
            }
        });
        jPanel1.add(cancelBT);
        cancelBT.setBounds(190, 330, 90, 40);

        prodPriceTF1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prodPriceTF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodPriceTF1ActionPerformed(evt);
            }
        });
        jPanel1.add(prodPriceTF1);
        prodPriceTF1.setBounds(130, 260, 170, 26);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prodNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodNameTFActionPerformed

    private void addProductBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductBTActionPerformed
        if(prodNameTF.getText().isEmpty() || prodNameTF.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill all the field", "Message", JOptionPane.INFORMATION_MESSAGE);
            clearFields();
        }else{
            addProduct();
        }
    }//GEN-LAST:event_addProductBTActionPerformed

    private void cancelBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBTActionPerformed
        AdminMenu adminMenu = new AdminMenu();
        adminMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelBTActionPerformed

    private void prodPriceTF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodPriceTF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodPriceTF1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProduct().setVisible(true);
            }
        });
    }

    //----------------------------------------------------------------------------------------------------------
    //Methods
    private void addProduct(){
        try{
            connectToDB();
            String checkProduct = "SELECT COUNT(*) FROM product WHERE prod_name = ?";
            PreparedStatement checkStatement = connection.prepareStatement(checkProduct);
            checkStatement.setString(1, prodNameTF.getText());
            ResultSet resultSet = checkStatement.executeQuery();
            resultSet.next();
            int count = resultSet.getInt(1);
            if (count > 0) {
                JOptionPane.showMessageDialog(null, "Product with the same name already exists.", "Error", JOptionPane.ERROR_MESSAGE);
                clearFields();
                return;
            }

            String selectedCategory = (String) prodCategory.getSelectedItem();

            String addProduct = "INSERT INTO product (prod_type, prod_name, prod_price) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(addProduct);
            preparedStatement.setString(1, selectedCategory);
            preparedStatement.setString(2, prodNameTF.getText());
            preparedStatement.setString(3, prodPriceTF1.getText());
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Product added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                clearFields();
                AdminMenu adminMenu = new AdminMenu();
                adminMenu.setVisible(true);
                dispose();
            }
        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error adding Product: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearFields(){
        prodNameTF.setText("");
        prodPriceTF1.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProductBT;
    private javax.swing.JButton cancelBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> prodCategory;
    private javax.swing.JTextField prodNameTF;
    private javax.swing.JTextField prodPriceTF1;
    // End of variables declaration//GEN-END:variables
}
