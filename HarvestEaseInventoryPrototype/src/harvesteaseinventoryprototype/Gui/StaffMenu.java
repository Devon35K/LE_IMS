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
 * @author Admin
 */
public class StaffMenu extends javax.swing.JFrame {
    DefaultTableModel model;
    DefaultTableModel model2;
    DefaultTableModel model3;
    DefaultTableModel model4;

    public StaffMenu() {
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

        Menu_Panel = new javax.swing.JPanel();
        Cashier_Button = new javax.swing.JButton();
        Inventory_Button1 = new javax.swing.JButton();
        Transaction_Button2 = new javax.swing.JButton();
        LogOut_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Display_Tab = new javax.swing.JTabbedPane();
        Cashier = new javax.swing.JPanel();
        POS_Label = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Food_Button = new javax.swing.JButton();
        Beverages_Button = new javax.swing.JButton();
        Medicine_Button = new javax.swing.JButton();
        Product_Tab = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        AddCart_Button = new javax.swing.JButton();
        Buy_Button = new javax.swing.JButton();
        Remove_Button = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        Food_Button3 = new javax.swing.JButton();
        Beverages_Button1 = new javax.swing.JButton();
        Medicine_Button1 = new javax.swing.JButton();
        ViewAll_Button1 = new javax.swing.JButton();
        Search2 = new javax.swing.JTextField();
        Searh_Button2 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        POS_Label1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        POS_Label2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        Search3 = new javax.swing.JTextField();
        Searh_Button3 = new javax.swing.JButton();
        allTransactions = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(null);
        setTitle("Harvest Ease | Inventory Management System");

        Menu_Panel.setBackground(new java.awt.Color(245, 245, 245));

        Cashier_Button.setBackground(new java.awt.Color(245, 245, 245));
        Cashier_Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Cashier_Button.setText("Cashier");
        Cashier_Button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Cashier_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cashier_ButtonActionPerformed(evt);
            }
        });

        Inventory_Button1.setBackground(new java.awt.Color(245, 245, 245));
        Inventory_Button1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Inventory_Button1.setText("Inventory");
        Inventory_Button1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Inventory_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inventory_Button1ActionPerformed(evt);
            }
        });

        Transaction_Button2.setBackground(new java.awt.Color(245, 245, 245));
        Transaction_Button2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Transaction_Button2.setText("Transaction");
        Transaction_Button2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Transaction_Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Transaction_Button2ActionPerformed(evt);
            }
        });

        LogOut_Button.setBackground(new java.awt.Color(245, 245, 245));
        LogOut_Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LogOut_Button.setText("Log-Out");
        LogOut_Button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LogOut_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOut_ButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/harvesteaseinventoryprototype/Gui/staffSide.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout Menu_PanelLayout = new javax.swing.GroupLayout(Menu_Panel);
        Menu_Panel.setLayout(Menu_PanelLayout);
        Menu_PanelLayout.setHorizontalGroup(
            Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_PanelLayout.createSequentialGroup()
                .addGroup(Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_PanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Transaction_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Inventory_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LogOut_Button)
                            .addComponent(Cashier_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Menu_PanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        Menu_PanelLayout.setVerticalGroup(
            Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_PanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(Cashier_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Inventory_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Transaction_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LogOut_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
        );

        getContentPane().add(Menu_Panel);
        Menu_Panel.setBounds(0, 0, 187, 556);

        Display_Tab.setBackground(new java.awt.Color(255, 255, 255));
        Display_Tab.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        Cashier.setBackground(new java.awt.Color(255, 255, 255));

        POS_Label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        POS_Label.setText("POINT OF SALES");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTable1= new javax.swing.JTable(model);
        model.addColumn("Product ID");
        model.addColumn("Name");
        model.addColumn("Price");
        model.addColumn("Quantity");
        clearTableModel();
        displayAllProdCart();

        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        Food_Button.setText("Food");
        Food_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Food_ButtonActionPerformed(evt);
            }
        });

        Beverages_Button.setText("Beverages");
        Beverages_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Beverages_ButtonActionPerformed(evt);
            }
        });

        Medicine_Button.setText("Medicine");
        Medicine_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Medicine_ButtonActionPerformed(evt);
            }
        });

        Product_Tab.setBackground(new java.awt.Color(255, 255, 255));
        Product_Tab.setTabPlacement(javax.swing.JTabbedPane.RIGHT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 305, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        Product_Tab.addTab("tab1", jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"BU67", "Coke", "20", "500"},
                {"PY27", "Nestea", "24", "302"}
            },
            new String [] {
                "Code", "Name", "Price", "Stock"
            }
        ));
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );

        Product_Tab.addTab("tab2", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"ME75", "Paracetamol", "6", "30"},
                {"UV73", "Neozep", "10", "70"}
            },
            new String [] {
                "Code", "Name", "Price", "Stock"
            }
        ));
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
            jTable4.getColumnModel().getColumn(1).setResizable(false);
            jTable4.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );

        Product_Tab.addTab("tab3", jPanel3);

        AddCart_Button.setText("Add to cart");
        AddCart_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCart_ButtonActionPerformed(evt);
            }
        });

        Buy_Button.setText("Buy");
        Buy_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buy_ButtonActionPerformed(evt);
            }
        });

        Remove_Button.setText("Remove");
        Remove_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remove_ButtonActionPerformed(evt);
            }
        });

        model2 = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTable2= new javax.swing.JTable(model2);
        model2.addColumn("Product ID");
        model2.addColumn("Name");
        model2.addColumn("Price");
        model2.addColumn("Stock");
        showALlProductFood();

        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout CashierLayout = new javax.swing.GroupLayout(Cashier);
        Cashier.setLayout(CashierLayout);
        CashierLayout.setHorizontalGroup(
            CashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CashierLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(CashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CashierLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Product_Tab, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(CashierLayout.createSequentialGroup()
                            .addComponent(Buy_Button)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Remove_Button)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddCart_Button))
                        .addGroup(CashierLayout.createSequentialGroup()
                            .addGroup(CashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(POS_Label)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(131, 131, 131)
                            .addComponent(Food_Button)
                            .addGap(18, 18, 18)
                            .addComponent(Beverages_Button)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Medicine_Button)
                            .addGap(6, 6, 6))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CashierLayout.setVerticalGroup(
            CashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CashierLayout.createSequentialGroup()
                .addGroup(CashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CashierLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(POS_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(CashierLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(CashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Food_Button)
                            .addComponent(Beverages_Button)
                            .addComponent(Medicine_Button))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(CashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddCart_Button)
                    .addGroup(CashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Buy_Button)
                        .addComponent(Remove_Button)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Product_Tab)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(134, 134, 134))
        );

        Display_Tab.addTab("tab1", Cashier);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        Food_Button3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Food_Button3.setText("Food");
        Food_Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Food_Button3ActionPerformed(evt);
            }
        });

        Beverages_Button1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Beverages_Button1.setText("Beverages");
        Beverages_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Beverages_Button1ActionPerformed(evt);
            }
        });

        Medicine_Button1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Medicine_Button1.setText("Medicine");
        Medicine_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Medicine_Button1ActionPerformed(evt);
            }
        });

        ViewAll_Button1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ViewAll_Button1.setText("View All");
        ViewAll_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAll_Button1ActionPerformed(evt);
            }
        });

        Search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search2ActionPerformed(evt);
            }
        });

        Searh_Button2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Searh_Button2.setText("SEARCH");
        Searh_Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Searh_Button2ActionPerformed(evt);
            }
        });

        allTransactions.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        allTransactions.setText("VIEW ALL");
        allTransactions.setBounds(440, 87, 110, 25);
        allTransactions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allTransactionsActionPerformed(evt);
            }
        });
        jPanel5.add(allTransactions);

        model3 = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTable5= new javax.swing.JTable(model3);
        model3.addColumn("Product ID");
        model3.addColumn("Category");
        model3.addColumn("Name");
        model3.addColumn("Price");
        model3.addColumn("Stock");
        showALlProduct();

        jScrollPane5.setViewportView(jTable5);

        POS_Label1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        POS_Label1.setText("INVENTORY");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Food_Button3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Beverages_Button1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Medicine_Button1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ViewAll_Button1))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(Search2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Searh_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(108, 108, 108))
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(POS_Label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(POS_Label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Food_Button3)
                    .addComponent(Beverages_Button1)
                    .addComponent(Medicine_Button1)
                    .addComponent(ViewAll_Button1))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Searh_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        Display_Tab.addTab("tab2", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        POS_Label2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        POS_Label2.setText("TRANSACTION");

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));

        model4 = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTable6= new javax.swing.JTable(model4);
        model4.addColumn("Category");
        model4.addColumn("Name");
        model4.addColumn("Quantity");
        model4.addColumn("Total Price");
        model4.addColumn("Date Purchased");
        showAllTransaction();

        jScrollPane6.setViewportView(jTable6);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setResizable(false);
            jTable6.getColumnModel().getColumn(1).setResizable(false);
            jTable6.getColumnModel().getColumn(2).setResizable(false);
            jTable6.getColumnModel().getColumn(3).setResizable(false);
        }

        Search3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search3ActionPerformed(evt);
            }
        });

        Searh_Button3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Searh_Button3.setText("SEARCH");
        Searh_Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Searh_Button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(POS_Label2, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Search3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Searh_Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(POS_Label2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Searh_Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        Display_Tab.addTab("tab3", jPanel5);

        getContentPane().add(Display_Tab);
        Display_Tab.setBounds(190, 0, 610, 556);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogOut_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOut_ButtonActionPerformed
          
         int result = JOptionPane.showConfirmDialog(null, "Do you want to log-out?", "Confirmation", JOptionPane.YES_NO_OPTION);
        
         if(result == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Log-out Successfully!");
            LoginMenu loginMenu = new LoginMenu();
            loginMenu.show();
            dispose();
        }
        

    }//GEN-LAST:event_LogOut_ButtonActionPerformed

    private void Food_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Food_ButtonActionPerformed
        clearTableModel2();
        showALlProductFood();
    }//GEN-LAST:event_Food_ButtonActionPerformed

    private void Beverages_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Beverages_ButtonActionPerformed
         clearTableModel2();
         showALlProductBeverages();
    }//GEN-LAST:event_Beverages_ButtonActionPerformed

    private void Medicine_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Medicine_ButtonActionPerformed
         clearTableModel2();
         showALlProductMedicine();
    }//GEN-LAST:event_Medicine_ButtonActionPerformed

    private void Remove_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Medicine_ButtonActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to remove the selected item?", "Confirm Removal", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION){
            removeSelectedRow();
        } else if (response == JOptionPane.NO_OPTION) {
            StaffMenu staffMenu = new StaffMenu();
            staffMenu.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_Medicine_ButtonActionPerformed

    private void Search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search2ActionPerformed

    }//GEN-LAST:event_Search2ActionPerformed

    private void Searh_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Searh_Button2ActionPerformed
        if(Search2.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill the search field");
        } else {
            searchProduct();
        }
    }//GEN-LAST:event_Searh_Button2ActionPerformed

    private void allTransactionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allTransactionsActionPerformed
        clearTableModel4();
        showAllTransaction();
    }//GEN-LAST:event_allTransactionsActionPerformed

    private void Cashier_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cashier_ButtonActionPerformed
        Display_Tab.setSelectedIndex(0);
    }//GEN-LAST:event_Cashier_ButtonActionPerformed

    private void Inventory_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inventory_Button1ActionPerformed
         Display_Tab.setSelectedIndex(1);
    }//GEN-LAST:event_Inventory_Button1ActionPerformed

    private void Transaction_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Transaction_Button2ActionPerformed
         Display_Tab.setSelectedIndex(2);
    }//GEN-LAST:event_Transaction_Button2ActionPerformed

    private void Food_Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Food_Button3ActionPerformed
        clearTableModel3();
        Search2.setText("");
        displayFoodProdInventory();
    }//GEN-LAST:event_Food_Button3ActionPerformed

    private void Beverages_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Beverages_Button1ActionPerformed
        clearTableModel3();
        Search2.setText("");
        displayBeveragesProdInventory();
    }//GEN-LAST:event_Beverages_Button1ActionPerformed

    private void Medicine_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Medicine_Button1ActionPerformed
        clearTableModel3();
        Search2.setText("");
        displayMedicineProdInventory();
    }//GEN-LAST:event_Medicine_Button1ActionPerformed

    private void ViewAll_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAll_Button1ActionPerformed
        clearTableModel3();
        Search2.setText("");
        showALlProduct();
    }//GEN-LAST:event_ViewAll_Button1ActionPerformed

    private void Buy_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buy_ButtonActionPerformed
        if (jTable1.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "The Cart is empty", "Error", JOptionPane.ERROR_MESSAGE);
        }else {
            BuyForm buy = new BuyForm();
            buy.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_Buy_ButtonActionPerformed

    private void Search3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search3ActionPerformed

    private void Searh_Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Searh_Button3ActionPerformed
        if(Search3.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill first the search field");
        }else{
            clearTableModel4();
            searchTransaction();
        }
    }//GEN-LAST:event_Searh_Button3ActionPerformed

    private void AddCart_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCart_ButtonActionPerformed
        AddCart addCart = new AddCart();
        addCart.setVisible(true);
        dispose();
    }//GEN-LAST:event_AddCart_ButtonActionPerformed

    //=========================CASHIER===================================
    private void showALlProductFood(){
        try{
            connectToDB();
            String sql = "SELECT * FROM product where prod_type = 'Food'";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String productID = resultSet.getString("prod_ID");
                String prodName = resultSet.getString("prod_name");
                String prodPrice = resultSet.getString("prod_price");
                String prodStock = resultSet.getString("prod_quantity");

                model2.addRow(new Object[]{productID, prodName, "₱ "+prodPrice, prodStock});
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void showALlProductBeverages(){
        try{
            connectToDB();
            String sql = "SELECT * FROM product where prod_type = 'Beverages'";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String productID = resultSet.getString("prod_ID");
                String prodName = resultSet.getString("prod_name");
                String prodPrice = resultSet.getString("prod_price");
                String prodStock = resultSet.getString("prod_quantity");

                model2.addRow(new Object[]{productID, prodName, "₱ "+prodPrice, prodStock});
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void showALlProductMedicine(){
        try{
            connectToDB();
            String sql = "SELECT * FROM product where prod_type = 'Medicine'";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String productID = resultSet.getString("prod_ID");
                String prodName = resultSet.getString("prod_name");
                String prodPrice = resultSet.getString("prod_price");
                String prodStock = resultSet.getString("prod_quantity");

                model2.addRow(new Object[]{productID, prodName, "₱ "+prodPrice, prodStock});
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    //-------------------CART-----------------------------
    private void displayAllProdCart() {
        try {
            connectToDB();
            String sql = "SELECT * FROM cart";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String cartId = resultSet.getString("cart_ID");
                String prodName = resultSet.getString("item");
                int quantity = resultSet.getInt("stock");
                double totalPrice = resultSet.getDouble("totalPrice");

                boolean productExists = false;
                int existingRow = -1;

                // Check if the product already exists in the JTable
                for (int i = 0; i < model.getRowCount(); i++) {
                    if (model.getValueAt(i, 0).equals(cartId)) {
                        productExists = true;
                        existingRow = i;
                        break;
                    }
                }

                if (productExists) {
                    int existingQuantity = (int) model.getValueAt(existingRow, 3);  // assuming quantity is in the 4th column (index 3)
                    double existingTotalPrice = Double.parseDouble(model.getValueAt(existingRow, 2).toString().replace("₱ ", "")); // assuming total price is in the 3rd column (index 2)

                    model.setValueAt(existingQuantity + quantity, existingRow, 3);
                    model.setValueAt("₱ " + (existingTotalPrice + totalPrice), existingRow, 2);
                } else {
                    model.addRow(new Object[]{cartId, prodName, "₱ " + totalPrice, quantity});
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private void removeSelectedRow() {
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow >= 0) {
            String productId = model.getValueAt(selectedRow, 0).toString();
            updateStockProduct(productId);
            deleteRowFromDatabase(productId);
            model.removeRow(selectedRow);
            clearTableModel2();
            showALlProductFood();
        } else {
            JOptionPane.showMessageDialog(this, "No row selected.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteRowFromDatabase(String productId) {


        String sql = "DELETE FROM cart WHERE cart_ID = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, productId);
            int rowsDeleted = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void updateStockProduct(String productID){
        int quantity = 0;
        int tempQuantity = 0;
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT sum(stock) as totalStock FROM cart WHERE cart_ID='" + productID + "'";
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                quantity = Integer.parseInt(resultSet.getString("totalStock"));
            } else {
                JOptionPane.showMessageDialog(this, "No data found with the specified Product Code.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to search for data in the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT prod_quantity FROM product WHERE prod_ID='" + productID + "'";
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                tempQuantity = Integer.parseInt(resultSet.getString("prod_quantity"));
            } else {
                JOptionPane.showMessageDialog(this, "No data found with the specified Product Code.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to search for data in the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        int updateStock = quantity + tempQuantity;

        try {
            Statement statement = connection.createStatement();
            String sql = "UPDATE product SET prod_quantity='" + updateStock +"' WHERE prod_ID='" + productID + "'";
            int rowsAffected = statement.executeUpdate(sql);
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Data updated!");
            } else {
                JOptionPane.showMessageDialog(this, "No data found with the specified Product Code.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to update data in the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    //==========================INVENTORY============================
    private void showALlProduct(){
        try{
            connectToDB();
            String sql = "SELECT * FROM product";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String productID = resultSet.getString("prod_ID");
                String prodCategory = resultSet.getString("prod_type");
                String prodName = resultSet.getString("prod_name");
                String prodPrice = resultSet.getString("prod_price");
                String prodStock = resultSet.getString("prod_quantity");

                model3.addRow(new Object[]{productID, prodCategory, prodName, "₱ "+prodPrice, prodStock});
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void searchProduct(){
        connectToDB();
        String prodSearch = Search2.getText();
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM product WHERE prod_ID='" + prodSearch + "'";
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                clearTableModel3();
                String prodID = resultSet.getString("prod_ID");
                String prodCategory = resultSet.getString("prod_type");
                String prodName = resultSet.getString("prod_name");
                String prodPrice = resultSet.getString("prod_price");
                String prodStock = resultSet.getString("prod_quantity");

                model3.addRow(new Object[]{prodID, prodCategory, prodName, "₱ "+prodPrice, prodStock});
            } else {
                JOptionPane.showMessageDialog(this, "No data found with the specified Product ID.", "Error", JOptionPane.ERROR_MESSAGE);
                clearTableModel3();
                Search2.setText("");
                showALlProduct();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to search for data in the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void displayFoodProdInventory(){
        try{
            connectToDB();
            String sql = "SELECT * FROM product where prod_type ='Food'";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String productID = resultSet.getString("prod_ID");
                String prodCategory = resultSet.getString("prod_type");
                String prodName = resultSet.getString("prod_name");
                String prodPrice = resultSet.getString("prod_price");
                String prodStock = resultSet.getString("prod_quantity");

                model3.addRow(new Object[]{productID, prodCategory, prodName, "₱ "+prodPrice, prodStock});
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void displayBeveragesProdInventory(){
        try{
            connectToDB();
            String sql = "SELECT * FROM product where prod_type ='Beverages'";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String productID = resultSet.getString("prod_ID");
                String prodCategory = resultSet.getString("prod_type");
                String prodName = resultSet.getString("prod_name");
                String prodPrice = resultSet.getString("prod_price");
                String prodStock = resultSet.getString("prod_quantity");

                model3.addRow(new Object[]{productID, prodCategory, prodName, "₱ "+prodPrice, prodStock});
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void displayMedicineProdInventory(){
        try{
            connectToDB();
            String sql = "SELECT * FROM product where prod_type ='Medicine'";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String productID = resultSet.getString("prod_ID");
                String prodCategory = resultSet.getString("prod_type");
                String prodName = resultSet.getString("prod_name");
                String prodPrice = resultSet.getString("prod_price");
                String prodStock = resultSet.getString("prod_quantity");

                model3.addRow(new Object[]{productID, prodCategory, prodName, "₱ "+prodPrice, prodStock});
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    //=========================TRANSACTIONS============================
    private void showAllTransaction(){
        try{
            connectToDB();
            String sql = "SELECT * FROM payment order by product_ts";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String prodCategory = resultSet.getString("product_type");
                String prodName = resultSet.getString("product_name");
                String prodQuantity = resultSet.getString("product_quantity");
                String prodPrice = resultSet.getString("product_TotalPrice");
                String timeStamp = resultSet.getString("product_ts");

                model4.addRow(new Object[]{prodCategory, prodName, prodQuantity, "₱ "+prodPrice, timeStamp});
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void searchTransaction(){
        connectToDB();
        String transactionSearch = Search3.getText();
        boolean found = false;
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM payment WHERE product_ts like '%" + transactionSearch + "%'";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                clearTableModel3();
                String prodCategory = resultSet.getString("product_type");
                String prodName = resultSet.getString("product_name");
                String prodQuantity = resultSet.getString("product_quantity");
                String prodPrice = resultSet.getString("product_TotalPrice");
                String timeStamp = resultSet.getString("product_ts");

                model4.addRow(new Object[]{prodCategory, prodName, prodQuantity, "₱ "+prodPrice, timeStamp});
                found = true;
            } if (found == false){
                JOptionPane.showMessageDialog(this, "Wrong Date format entered(Date Format yyyy-MM-dd) or Date entered have no transactions.", "Error", JOptionPane.ERROR_MESSAGE);
                clearTableModel4();
                Search3.setText("");
                showAllTransaction();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to search for data in the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {
        
        FlatLightLaf.setup();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffMenu().setVisible(true);
            }
        });
    }

    //---------------------CLEAR TABLE METHODS------------------------------------
    private void clearTableModel(){
        model.setRowCount(0);
    }

    private void clearTableModel2(){
        model2.setRowCount(0);
    }

    private void clearTableModel3(){
        model3.setRowCount(0);
    }

    private void clearTableModel4(){
        model4.setRowCount(0);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCart_Button;
    private javax.swing.JButton Beverages_Button;
    private javax.swing.JButton Beverages_Button1;
    private javax.swing.JButton Buy_Button;
    private javax.swing.JPanel Cashier;
    private javax.swing.JButton Cashier_Button;
    private javax.swing.JTabbedPane Display_Tab;
    private javax.swing.JButton Food_Button;
    private javax.swing.JButton Food_Button3;
    private javax.swing.JButton Inventory_Button1;
    private javax.swing.JButton LogOut_Button;
    private javax.swing.JButton Medicine_Button;
    private javax.swing.JButton Medicine_Button1;
    private javax.swing.JPanel Menu_Panel;
    private javax.swing.JLabel POS_Label;
    private javax.swing.JLabel POS_Label1;
    private javax.swing.JLabel POS_Label2;
    private javax.swing.JTabbedPane Product_Tab;
    private javax.swing.JButton Remove_Button;
    private javax.swing.JTextField Search2;
    private javax.swing.JTextField Search3;
    private javax.swing.JButton Searh_Button2;
    private javax.swing.JButton Searh_Button3;
    private javax.swing.JButton Transaction_Button2;
    private javax.swing.JButton ViewAll_Button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JButton allTransactions;
    // End of variables declaration//GEN-END:variables
}
