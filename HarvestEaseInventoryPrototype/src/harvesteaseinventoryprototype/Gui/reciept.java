/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package harvesteaseinventoryprototype.Gui;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
/**
 *
 * @author USER
 */
public class reciept extends javax.swing.JFrame {
    DefaultTableModel model;
    public reciept() {
        initComponents();
    }
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        recieptTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        changeTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        totalAmountTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cashTF = new javax.swing.JTextField();
        backBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Order Reciept | Harvest Ease IMS");
        setSize(603, 502);
        setLocationRelativeTo(null);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("ORDER RECIEPT");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 40, 140, 25);

        model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        recieptTable = new javax.swing.JTable(model);
        model.addColumn("Product ID");
        model.addColumn("Name");
        model.addColumn("Price");
        model.addColumn("Quantity");
        displayAllProdInCart();

        jScrollPane1.setViewportView(recieptTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 90, 560, 220);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Change:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(370, 381, 100, 20);

        changeTF.setBackground(new java.awt.Color(204, 204, 204));
        changeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeTFActionPerformed(evt);
            }
        });
        jPanel1.add(changeTF);
        changeTF.setBounds(490, 380, 90, 23);
        changeTF.setEditable(false);


        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Total Amount:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(370, 321, 110, 20);

        totalAmountTF.setBackground(new java.awt.Color(204, 204, 204));
        totalAmountTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalAmountTFActionPerformed(evt);
            }
        });
        jPanel1.add(totalAmountTF);
        totalAmountTF.setBounds(490, 320, 90, 23);
        totalAmountTF.setEditable(false);
        totalAmountToPay();

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Cash:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(370, 351, 100, 20);

        cashTF.setBackground(new java.awt.Color(204, 204, 204));
        cashTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashTFActionPerformed(evt);
            }
        });
        jPanel1.add(cashTF);
        cashTF.setBounds(490, 350, 90, 23);
        cashTF.setEditable(false);
        retrieveCashChange();

        backBT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backBT.setText("BACK");
        backBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTActionPerformed(evt);
            }
        });
        jPanel1.add(backBT);
        backBT.setBounds(250, 430, 80, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void changeTFActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void totalAmountTFActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void cashTFActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void backBTActionPerformed(java.awt.event.ActionEvent evt) {
        clearCartTable();
        clearTempHolder();
        totalAmountTF.setText("");
        StaffMenu staffMenu = new StaffMenu();
        staffMenu.setVisible(true);
        dispose();
    }

    //=======================METHODS=======================
    private void displayAllProdInCart(){
        try{
            connectToDB();
            String sql = "SELECT * FROM cart";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String productID = resultSet.getString("cart_ID");
                String prodName = resultSet.getString("item");
                String prodPrice = resultSet.getString("totalPrice");
                String prodStock = resultSet.getString("stock");

                model.addRow(new Object[]{productID, prodName, "₱ "+prodPrice, prodStock});
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void totalAmountToPay(){
        connectToDB();
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT sum(totalPrice) as totalPrice FROM cart";
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                totalAmountTF.setText("₱ "+resultSet.getString("totalPrice"));
            } else {
                JOptionPane.showMessageDialog(this, "No data found", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to search for data in the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void retrieveCashChange(){
        String cash = null;
        String change = null;
        try{
            connectToDB();
            String sql = "SELECT * FROM tempHolder";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                cash = resultSet.getString("cash");
                change = resultSet.getString("moneyChange");
                cashTF.setText("₱ "+cash);
                changeTF.setText(change);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void clearCartTable(){
        connectToDB();
        try{
            String sql = "Delete from cart";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void clearTempHolder(){
        connectToDB();
        try{
            String sql = "Delete from tempHolder";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        FlatLightLaf.setup();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(reciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reciept().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton backBT;
    private javax.swing.JTextField cashTF;
    private javax.swing.JTextField changeTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable recieptTable;
    private javax.swing.JTextField totalAmountTF;
    // End of variables declaration
}
