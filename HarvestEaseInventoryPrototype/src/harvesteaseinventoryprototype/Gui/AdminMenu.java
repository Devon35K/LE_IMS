/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package harvesteaseinventoryprototype.Gui;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Admin
 */
public class AdminMenu extends javax.swing.JFrame {
    DefaultTableModel model;
    DefaultTableModel model2;
    DefaultTableModel model3;
    DefaultTableModel model4;
    DefaultTableModel model5;
    DefaultTableModel model6;
    /**
     * Creates new form AdminMenu
     */
    public AdminMenu() {
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
        buttonGroup1 = new javax.swing.ButtonGroup();
        Menu_Panel = new javax.swing.JPanel();
        Dashboard_Button = new javax.swing.JButton();
        Staff_Button = new javax.swing.JButton();
        Product_Button = new javax.swing.JButton();
        Inventory_Button = new javax.swing.JButton();
        Reports_Button = new javax.swing.JButton();
        LogOut_Button = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Display_Tab = new javax.swing.JTabbedPane();
        Dashboard = new javax.swing.JPanel();
        Dashboard_Label = new javax.swing.JLabel();
        Separator1 = new javax.swing.JSeparator();
        Staff_Panel1 = new javax.swing.JPanel();
        Staff_label1 = new javax.swing.JLabel();
        StaffNum_Label1 = new javax.swing.JLabel();
        Staff_Icon1 = new javax.swing.JLabel();
        Product_Panel = new javax.swing.JPanel();
        Staff_label = new javax.swing.JLabel();
        StaffNum_Label3 = new javax.swing.JLabel();
        Product_Icon3 = new javax.swing.JLabel();
        Product_Panel2 = new javax.swing.JPanel();
        Staff_label3 = new javax.swing.JLabel();
        StaffNum_Label = new javax.swing.JLabel();
        Reports_Icon = new javax.swing.JLabel();
        Staff = new javax.swing.JPanel();
        Dashboard_Label1 = new javax.swing.JLabel();
        Separator2 = new javax.swing.JSeparator();
        SearchTF = new javax.swing.JTextField();
        Searh_Button = new javax.swing.JButton();
        allStaff = new javax.swing.JButton();
        Add_Button1 = new javax.swing.JButton();
        Edit_Button2 = new javax.swing.JButton();
        deleteBT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();

        jTable1 = new javax.swing.JTable();
        sortStaffBT = new javax.swing.JButton();
        Product = new javax.swing.JPanel();
        Dashboard_Label2 = new javax.swing.JLabel();
        Separator3 = new javax.swing.JSeparator();
        Food_Button = new javax.swing.JButton();
        Beverages_Button = new javax.swing.JButton();
        Medicine_Button = new javax.swing.JButton();
        ViewAll_Button = new javax.swing.JButton();
        prodSearchTF = new javax.swing.JTextField();
        prodSearchBT = new javax.swing.JButton();
        Add_Button = new javax.swing.JButton();
        Edit_Button = new javax.swing.JButton();
        Delete_Button = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Inventory = new javax.swing.JPanel();
        Dashboard_Label3 = new javax.swing.JLabel();
        Separator4 = new javax.swing.JSeparator();
        Food_Button1 = new javax.swing.JButton();
        Beverages_Button1 = new javax.swing.JButton();
        Medicine_Button1 = new javax.swing.JButton();
        ViewAll_Button1 = new javax.swing.JButton();
        prodSearchInventoryTF = new javax.swing.JTextField();
        Searh_Button2 = new javax.swing.JButton();
        Add_Button3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        Reports = new javax.swing.JPanel();
        Dashboard_Label4 = new javax.swing.JLabel();
        Separator5 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        listStaffBT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        salesBT = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        productBT = new javax.swing.JButton();
        StaffList = new javax.swing.JPanel();
        Dashboard_Label5 = new javax.swing.JLabel();
        Separator6 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        backBT1 = new javax.swing.JButton();
        ProductList = new javax.swing.JPanel();
        Dashboard_Label6 = new javax.swing.JLabel();
        Separator7 = new javax.swing.JSeparator();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        backBT = new javax.swing.JButton();
        sales = new javax.swing.JPanel();
        Dashboard_Label7 = new javax.swing.JLabel();
        Separator8 = new javax.swing.JSeparator();
        choiceComboBox = new javax.swing.JComboBox<>();
        viewBT = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        category_Food = new javax.swing.JCheckBox();
        category_Beverages = new javax.swing.JCheckBox();
        category_Medicine = new javax.swing.JCheckBox();
        sortValues = new javax.swing.JComboBox<>();
        sortBT = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        backBTSales = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(null);
        setTitle("Harvest Ease | Inventory Management System");

        Menu_Panel.setBackground(new java.awt.Color(245, 245, 245));

        Dashboard_Button.setBackground(new java.awt.Color(245, 245, 245));
        Dashboard_Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Dashboard_Button.setText("Dashboard");
        Dashboard_Button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Dashboard_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dashboard_ButtonActionPerformed(evt);
            }
        });

        Staff_Button.setBackground(new java.awt.Color(245, 245, 245));
        Staff_Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Staff_Button.setText("Staff");
        Staff_Button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Staff_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Staff_ButtonActionPerformed(evt);
            }
        });

        Product_Button.setBackground(new java.awt.Color(245, 245, 245));
        Product_Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Product_Button.setText("Product");
        Product_Button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Product_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Product_ButtonActionPerformed(evt);
            }
        });

        Inventory_Button.setBackground(new java.awt.Color(245, 245, 245));
        Inventory_Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Inventory_Button.setText("Inventory");
        Inventory_Button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Inventory_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inventory_ButtonActionPerformed(evt);
            }
        });

        Reports_Button.setBackground(new java.awt.Color(245, 245, 245));
        Reports_Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reports_Button.setText("Reports");
        Reports_Button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Reports_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reports_ButtonActionPerformed(evt);
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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/harvesteaseinventoryprototype/Gui/admin.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout Menu_PanelLayout = new javax.swing.GroupLayout(Menu_Panel);
        Menu_Panel.setLayout(Menu_PanelLayout);
        Menu_PanelLayout.setHorizontalGroup(
            Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_PanelLayout.createSequentialGroup()
                .addGroup(Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_PanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Reports_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Inventory_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Product_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Staff_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dashboard_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LogOut_Button)))
                    .addGroup(Menu_PanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        Menu_PanelLayout.setVerticalGroup(
            Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_PanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Dashboard_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Staff_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Product_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Inventory_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Reports_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LogOut_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        getContentPane().add(Menu_Panel);
        Menu_Panel.setBounds(0, 0, 187, 556);

        Display_Tab.setBackground(new java.awt.Color(255, 255, 255));
        Display_Tab.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        Dashboard.setBackground(new java.awt.Color(255, 255, 255));

        Dashboard_Label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Dashboard_Label.setText("DASHBOARD");

        Separator1.setForeground(new java.awt.Color(51, 51, 51));

        Staff_Panel1.setBackground(new java.awt.Color(40, 60, 99));

        Staff_label1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Staff_label1.setForeground(new java.awt.Color(255, 255, 255));
        Staff_label1.setText("STAFF");

        StaffNum_Label1.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N
        StaffNum_Label1.setForeground(new java.awt.Color(255, 255, 255));
        countStaff();



        Staff_Icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/harvesteaseinventoryprototype/Icons/Staff_Icon.png"))); // NOI18N

        javax.swing.GroupLayout Staff_Panel1Layout = new javax.swing.GroupLayout(Staff_Panel1);
        Staff_Panel1.setLayout(Staff_Panel1Layout);
        Staff_Panel1Layout.setHorizontalGroup(
            Staff_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Staff_Panel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Staff_label1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Staff_Panel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(Staff_Icon1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(StaffNum_Label1)
                .addGap(54, 54, 54))
        );
        Staff_Panel1Layout.setVerticalGroup(
            Staff_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Staff_Panel1Layout.createSequentialGroup()
                .addGroup(Staff_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Staff_Panel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(StaffNum_Label1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Staff_Panel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Staff_Icon1)
                        .addGap(18, 18, 18)))
                .addComponent(Staff_label1)
                .addGap(15, 15, 15))
        );

        Product_Panel.setBackground(new java.awt.Color(248, 95, 115));

        Staff_label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Staff_label.setForeground(new java.awt.Color(255, 255, 255));
        Staff_label.setText("PRODUCTS");

        StaffNum_Label3.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N
        StaffNum_Label3.setForeground(new java.awt.Color(255, 255, 255));
        countProduct();

        Product_Icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/harvesteaseinventoryprototype/Icons/Product_Icon.png"))); // NOI18N

        javax.swing.GroupLayout Product_PanelLayout = new javax.swing.GroupLayout(Product_Panel);
        Product_Panel.setLayout(Product_PanelLayout);
        Product_PanelLayout.setHorizontalGroup(
            Product_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Product_PanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Staff_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(StaffNum_Label3)
                .addGap(29, 29, 29))
            .addGroup(Product_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Product_PanelLayout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(Product_Icon3)
                    .addContainerGap(136, Short.MAX_VALUE)))
        );
        Product_PanelLayout.setVerticalGroup(
            Product_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Product_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Product_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Product_PanelLayout.createSequentialGroup()
                        .addComponent(Staff_label)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Product_PanelLayout.createSequentialGroup()
                        .addComponent(StaffNum_Label3)
                        .addGap(35, 35, 35))))
            .addGroup(Product_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Product_PanelLayout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(Product_Icon3)
                    .addContainerGap(55, Short.MAX_VALUE)))
        );

        Product_Panel2.setBackground(new java.awt.Color(73, 190, 183));

        Staff_label3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Staff_label3.setForeground(new java.awt.Color(255, 255, 255));
        Staff_label3.setText("REPORTS");

        StaffNum_Label.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N
        StaffNum_Label.setForeground(new java.awt.Color(255, 255, 255));
        StaffNum_Label.setText("20");
        countTransactions();

        Reports_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/harvesteaseinventoryprototype/Icons/Reports_Icon.png"))); // NOI18N

        javax.swing.GroupLayout Product_Panel2Layout = new javax.swing.GroupLayout(Product_Panel2);
        Product_Panel2.setLayout(Product_Panel2Layout);
        Product_Panel2Layout.setHorizontalGroup(
            Product_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Product_Panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Reports_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(StaffNum_Label)
                .addGap(40, 40, 40))
            .addGroup(Product_Panel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Staff_label3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Product_Panel2Layout.setVerticalGroup(
            Product_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Product_Panel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(Product_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(StaffNum_Label)
                    .addComponent(Reports_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(Staff_label3)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DashboardLayout = new javax.swing.GroupLayout(Dashboard);
        Dashboard.setLayout(DashboardLayout);
        DashboardLayout.setHorizontalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Dashboard_Label)
                    .addComponent(Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
            .addGroup(DashboardLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Product_Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(DashboardLayout.createSequentialGroup()
                        .addComponent(Staff_Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Product_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        DashboardLayout.setVerticalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Dashboard_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Product_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Staff_Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(Product_Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        Display_Tab.addTab("Tab1", Dashboard);

        Staff.setBackground(new java.awt.Color(255, 255, 255));

        Dashboard_Label1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Dashboard_Label1.setText("STAFF");

        Separator2.setForeground(new java.awt.Color(51, 51, 51));
        SearchTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTFActionPerformed(evt);
            }
        });

        Searh_Button.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Searh_Button.setText("SEARCH");
        Searh_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Searh_ButtonActionPerformed(evt);
            }
        });

        allStaff.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        allStaff.setText("VIEW ALL STAFF");
        allStaff.setBounds(350, 125, 160, 25);
        allStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allStaffActionPerformed(evt);
            }
        });
        Staff.add(allStaff);


        Add_Button1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Add_Button1.setText("ADD");
        Add_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_Button1ActionPerformed(evt);
            }
        });

        Edit_Button2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Edit_Button2.setText("EDIT");
        Edit_Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_Button2ActionPerformed(evt);
            }
        });

        deleteBT.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        deleteBT.setText("DELETE");
        deleteBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTActionPerformed(evt);
            }
        });

        model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTable1= new javax.swing.JTable(model);
        model.addColumn("Staff ID");
        model.addColumn("Name");
        model.addColumn("Username");
        model.addColumn("Password");
        showALlStaff();

        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        sortStaffBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/harvesteaseinventoryprototype/Gui/sortingIcon.png"))); // NOI18N
        sortStaffBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortStaffBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout StaffLayout = new javax.swing.GroupLayout(Staff);
        Staff.setLayout(StaffLayout);
        StaffLayout.setHorizontalGroup(
            StaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StaffLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(StaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sortStaffBT)
                    .addGroup(StaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                        .addGroup(StaffLayout.createSequentialGroup()
                            .addGroup(StaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Dashboard_Label1)
                                .addComponent(Separator2, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                .addComponent(SearchTF))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Searh_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Add_Button1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Edit_Button2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(deleteBT))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        StaffLayout.setVerticalGroup(
            StaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StaffLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Dashboard_Label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(StaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Searh_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edit_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sortStaffBT)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        Display_Tab.addTab("Tab2", Staff);

        Product.setBackground(new java.awt.Color(255, 255, 255));

        Dashboard_Label2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Dashboard_Label2.setText("PRODUCT");

        Separator3.setForeground(new java.awt.Color(51, 51, 51));

        Food_Button.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Food_Button.setText("Food");
        Food_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Food_ButtonActionPerformed(evt);
            }
        });


        Beverages_Button.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Beverages_Button.setText("Beverages");
        Beverages_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Beverages_ButtonActionPerformed(evt);
            }
        });

        Medicine_Button.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Medicine_Button.setText("Medicine");
        Medicine_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Medicine_ButtonActionPerformed(evt);
            }
        });

        ViewAll_Button.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ViewAll_Button.setText("View All");
        ViewAll_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAll_ButtonActionPerformed(evt);
            }
        });

        prodSearchTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodSearchTFActionPerformed(evt);
            }
        });

        prodSearchBT.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        prodSearchBT.setText("SEARCH");
        prodSearchBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodSearchBTActionPerformed(evt);
            }
        });

        Add_Button.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Add_Button.setText("ADD");
        Add_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_ButtonActionPerformed(evt);
            }
        });

        Edit_Button.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Edit_Button.setText("EDIT");
        Edit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_ButtonActionPerformed(evt);
            }
        });

        Delete_Button.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Delete_Button.setText("DELETE");
        Delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_ButtonActionPerformed(evt);
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
        model2.addColumn("Category");
        model2.addColumn("Name");
        model2.addColumn("Price");
        showALlProduct();

        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout ProductLayout = new javax.swing.GroupLayout(Product);
        Product.setLayout(ProductLayout);
        ProductLayout.setHorizontalGroup(
            ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2)
                        .addGroup(ProductLayout.createSequentialGroup()
                            .addComponent(prodSearchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(prodSearchBT, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Add_Button)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Edit_Button)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Delete_Button)))
                    .addGroup(ProductLayout.createSequentialGroup()
                        .addComponent(Food_Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Beverages_Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Medicine_Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ViewAll_Button))
                    .addComponent(Dashboard_Label2)
                    .addComponent(Separator3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        ProductLayout.setVerticalGroup(
            ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Dashboard_Label2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Food_Button)
                    .addComponent(Beverages_Button)
                    .addComponent(Medicine_Button)
                    .addComponent(ViewAll_Button))
                .addGap(18, 18, 18)
                .addGroup(ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prodSearchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prodSearchBT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        Display_Tab.addTab("Tab3", Product);

        Inventory.setBackground(new java.awt.Color(255, 255, 255));

        Dashboard_Label3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Dashboard_Label3.setText("INVENTORY");

        Separator4.setForeground(new java.awt.Color(51, 51, 51));

        Food_Button1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Food_Button1.setText("Food");
        Food_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Food_Button1ActionPerformed(evt);
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

        prodSearchInventoryTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodSearchInventoryTFActionPerformed(evt);
            }
        });

        Searh_Button2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Searh_Button2.setText("SEARCH");
        Searh_Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Searh_Button2ActionPerformed(evt);
            }
        });

        Add_Button3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Add_Button3.setText("ADD STOCK");
        Add_Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_Button3ActionPerformed(evt);
            }
        });

        model3 = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTable3= new javax.swing.JTable(model3);
        model3.addColumn("Product ID");
        model3.addColumn("Category");
        model3.addColumn("Name");
        model3.addColumn("Price");
        model3.addColumn("Stocks");
        showALlProductInventory();

        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
            jTable3.getColumnModel().getColumn(3).setResizable(false);
            jTable3.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout InventoryLayout = new javax.swing.GroupLayout(Inventory);
        Inventory.setLayout(InventoryLayout);
        InventoryLayout.setHorizontalGroup(
            InventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InventoryLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(InventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InventoryLayout.createSequentialGroup()
                        .addComponent(Food_Button1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Beverages_Button1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Medicine_Button1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ViewAll_Button1))
                    .addComponent(Dashboard_Label3)
                    .addComponent(Separator4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(InventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(InventoryLayout.createSequentialGroup()
                            .addComponent(prodSearchInventoryTF)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Searh_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Add_Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        InventoryLayout.setVerticalGroup(
            InventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InventoryLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Dashboard_Label3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Food_Button1)
                    .addComponent(Beverages_Button1)
                    .addComponent(Medicine_Button1)
                    .addComponent(ViewAll_Button1))
                .addGap(18, 18, 18)
                .addGroup(InventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prodSearchInventoryTF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Searh_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add_Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        Display_Tab.addTab("Tab4", Inventory);

        Reports.setBackground(new java.awt.Color(255, 255, 255));

        Dashboard_Label4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Dashboard_Label4.setText("Reports");

        Separator5.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("LIst of All Staff");

        listStaffBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/harvesteaseinventoryprototype/Gui/staff.png"))); // NOI18N
        listStaffBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listStaffBTActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("LIst of All Products");

        salesBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/harvesteaseinventoryprototype/Gui/sales.png"))); // NOI18N
        salesBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesBTActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("SALES");

        productBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/harvesteaseinventoryprototype/Gui/products.png"))); // NOI18N
        productBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ReportsLayout = new javax.swing.GroupLayout(Reports);
        Reports.setLayout(ReportsLayout);
        ReportsLayout.setHorizontalGroup(
            ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportsLayout.createSequentialGroup()
                .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReportsLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(listStaffBT, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ReportsLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReportsLayout.createSequentialGroup()
                        .addComponent(productBT, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReportsLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(89, 89, 89))))
            .addGroup(ReportsLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Dashboard_Label4)
                    .addComponent(Separator5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(ReportsLayout.createSequentialGroup()
                .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReportsLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(salesBT, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ReportsLayout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ReportsLayout.setVerticalGroup(
            ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportsLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Dashboard_Label4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(productBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listStaffBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addComponent(salesBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );

        Display_Tab.addTab("Tab5", Reports);

        StaffList.setBackground(new java.awt.Color(255, 255, 255));

        Dashboard_Label5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Dashboard_Label5.setText("List of All Staff");

        Separator6.setForeground(new java.awt.Color(51, 51, 51));


        model4 = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTable4= new javax.swing.JTable(model4);
        model4.addColumn("Staff ID");
        model4.addColumn("Name");
        model4.addColumn("Username");
        model4.addColumn("Password");
        model4.addColumn("Date Created");
        showALlStaffList();

        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
            jTable4.getColumnModel().getColumn(1).setResizable(false);
            jTable4.getColumnModel().getColumn(2).setResizable(false);
        }

        backBT1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backBT1.setText("BACK");
        backBT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBT1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout StaffListLayout = new javax.swing.GroupLayout(StaffList);
        StaffList.setLayout(StaffListLayout);
        StaffListLayout.setHorizontalGroup(
            StaffListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StaffListLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(StaffListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Dashboard_Label5)
                    .addComponent(Separator6, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 398, Short.MAX_VALUE))
            .addGroup(StaffListLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(StaffListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backBT1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        StaffListLayout.setVerticalGroup(
            StaffListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StaffListLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Dashboard_Label5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backBT1)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        Display_Tab.addTab("Tab5", StaffList);

        ProductList.setBackground(new java.awt.Color(255, 255, 255));

        Dashboard_Label6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Dashboard_Label6.setText("List of All Product");

        Separator7.setForeground(new java.awt.Color(51, 51, 51));

        model5 = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTable6= new javax.swing.JTable(model5);
        model5.addColumn("Product ID");
        model5.addColumn("Category");
        model5.addColumn("Name");
        model5.addColumn("Price");
        model5.addColumn("Stocks");
        showALlProductList();

        jScrollPane6.setViewportView(jTable6);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setResizable(false);
            jTable6.getColumnModel().getColumn(1).setResizable(false);
            jTable6.getColumnModel().getColumn(2).setResizable(false);
            jTable6.getColumnModel().getColumn(3).setResizable(false);
        }

        backBT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backBT.setText("BACK");
        backBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProductListLayout = new javax.swing.GroupLayout(ProductList);
        ProductList.setLayout(ProductListLayout);
        ProductListLayout.setHorizontalGroup(
            ProductListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductListLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(ProductListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Dashboard_Label6)
                    .addComponent(Separator7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductListLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(ProductListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBT, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        ProductListLayout.setVerticalGroup(
            ProductListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductListLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Dashboard_Label6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backBT)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        Display_Tab.addTab("Tab5", ProductList);

        sales.setBackground(new java.awt.Color(255, 255, 255));

        Dashboard_Label7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Dashboard_Label7.setText("Sales");

        Separator8.setForeground(new java.awt.Color(51, 51, 51));

        choiceComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sales per Product", "Total Sales" }));

        viewBT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewBT.setText("VIEW");
        viewBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBTActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Category:");

        category_Food.setText("Food");

        category_Beverages.setText("Beverages");
        category_Beverages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category_BeveragesActionPerformed(evt);
            }
        });

        category_Medicine.setText("Medicine");

        sortValues.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Daily", "Weekly", "Monthly" }));
        sortValues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortValuesActionPerformed(evt);
            }
        });

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JCheckBox selectedCheckBox = (JCheckBox) e.getSource();

                // Uncheck the other checkboxes
                if (selectedCheckBox == category_Food) {
                    category_Beverages.setSelected(false);
                    category_Medicine.setSelected(false);
                } else if (selectedCheckBox == category_Beverages) {
                    category_Food.setSelected(false);
                    category_Medicine.setSelected(false);
                } else if (selectedCheckBox == category_Medicine) {
                    category_Food.setSelected(false);
                    category_Beverages.setSelected(false);
                }
            }
        };

        category_Food.addActionListener(actionListener);
        category_Beverages.addActionListener(actionListener);
        category_Medicine.addActionListener(actionListener);

        sortBT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sortBT.setText("SORT");
        sortBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortBTActionPerformed(evt);
            }
        });

        model6 = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTable7= new javax.swing.JTable(model6);
        model6.addColumn("Daily Date");
        model6.addColumn("Total Amount");

        jScrollPane7.setViewportView(jTable7);
        if (jTable7.getColumnModel().getColumnCount() > 0) {
            jTable7.getColumnModel().getColumn(0).setResizable(false);
            jTable7.getColumnModel().getColumn(1).setResizable(false);
        }

        backBTSales.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backBTSales.setText("BACK");
        backBTSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTSalesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout salesLayout = new javax.swing.GroupLayout(sales);
        sales.setLayout(salesLayout);
        salesLayout.setHorizontalGroup(
            salesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(salesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(salesLayout.createSequentialGroup()
                        .addComponent(Separator8, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(salesLayout.createSequentialGroup()
                        .addComponent(Dashboard_Label7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(salesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(choiceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(salesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sortValues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewBT))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salesLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(salesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backBTSales)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(salesLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(category_Food, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(category_Beverages)
                        .addGap(18, 18, 18)
                        .addComponent(category_Medicine)
                        .addGap(166, 166, 166)
                        .addComponent(sortBT)))
                .addGap(43, 43, 43))
        );
        salesLayout.setVerticalGroup(
            salesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Dashboard_Label7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(salesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choiceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewBT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(salesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(category_Food)
                    .addComponent(category_Beverages)
                    .addComponent(category_Medicine)
                    .addComponent(sortBT)
                    .addComponent(sortValues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(backBTSales)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        Display_Tab.addTab("Tab5", sales);

        getContentPane().add(Display_Tab);
        Display_Tab.setBounds(187, 0, 610, 605);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Dashboard_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dashboard_ButtonActionPerformed
        
        Display_Tab.setSelectedIndex(0);
        
    }//GEN-LAST:event_Dashboard_ButtonActionPerformed

    private void Staff_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Staff_ButtonActionPerformed
      
        Display_Tab.setSelectedIndex(1);
        
    }//GEN-LAST:event_Staff_ButtonActionPerformed

    private void SearchTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTFActionPerformed

    private void Searh_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Searh_ButtonActionPerformed
        // TODO add your handling code here:
        if(SearchTF.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter the Staff Id or Username of a Staff", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else{
            searchStaff();
        }
    }//GEN-LAST:event_Searh_ButtonActionPerformed

    private void allStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category_BeveragesActionPerformed
        clearTable();
        showALlStaff();
    }//GEN-LAST:event_category_BeveragesActionPerformed

    private void Add_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_Button1ActionPerformed
        AddStaff addStaff = new AddStaff();
        addStaff.setVisible(true);
        dispose();
    }//GEN-LAST:event_Add_Button1ActionPerformed

    private void Edit_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_Button2ActionPerformed
        EditStaff editStaff = new EditStaff();
        editStaff.setVisible(true);
        dispose();
    }//GEN-LAST:event_Edit_Button2ActionPerformed

    private void deleteBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTActionPerformed
        DeleteStaff deleteStaff = new DeleteStaff();
        deleteStaff.setVisible(true);
        dispose();
    }//GEN-LAST:event_deleteBTActionPerformed

    private void ViewAll_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTFActionPerformed
        clearTableProduct();
        showALlProduct();
    }

    private void Food_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTFActionPerformed
        clearTableProduct();
        foodProductDisplay();
    }

    private void Beverages_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        clearTableProduct();
        beveragesProductDisplay();
    }

    private void Medicine_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        clearTableProduct();
        medicineProductDisplay();
    }

    private void Product_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Product_ButtonActionPerformed
          Display_Tab.setSelectedIndex(2);
    }//GEN-LAST:event_Product_ButtonActionPerformed

    private void prodSearchTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodSearchTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodSearchTFActionPerformed

    private void prodSearchBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodSearchBTActionPerformed
        if(prodSearchTF.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter the product id first", "Message", JOptionPane.INFORMATION_MESSAGE);
        }else{
            clearTableProduct();
            searchProduct();
        }
    }//GEN-LAST:event_prodSearchBTActionPerformed

    private void Add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ButtonActionPerformed
        AddProduct addProd = new AddProduct();
        addProd.setVisible(true);
        dispose();
    }//GEN-LAST:event_Add_ButtonActionPerformed

    private void Edit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_ButtonActionPerformed
        EditProduct editProd = new EditProduct();
        editProd.setVisible(true);
        dispose();
    }//GEN-LAST:event_Edit_ButtonActionPerformed

    private void Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_ButtonActionPerformed
        DeleteProduct delProd = new DeleteProduct();
        delProd.setVisible(true);
        dispose();
    }//GEN-LAST:event_Delete_ButtonActionPerformed

    private void Inventory_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inventory_ButtonActionPerformed
       Display_Tab.setSelectedIndex(3);
    }//GEN-LAST:event_Inventory_ButtonActionPerformed

    private void prodSearchInventoryTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodSearchInventoryTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodSearchInventoryTFActionPerformed

    private void Searh_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Searh_Button2ActionPerformed
        if(prodSearchInventoryTF.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter first the product ID", "Message", JOptionPane.INFORMATION_MESSAGE);
        }else{
            clearTableInventory();
            searchProductInventory();
        }
    }//GEN-LAST:event_Searh_Button2ActionPerformed

    private void Add_Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_Button3ActionPerformed
        AddStock addStock = new AddStock();
        addStock.setVisible(true);
        dispose();
    }//GEN-LAST:event_Add_Button3ActionPerformed

    private void Reports_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reports_ButtonActionPerformed
      Display_Tab.setSelectedIndex(4);
    }//GEN-LAST:event_Reports_ButtonActionPerformed

    private void LogOut_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOut_ButtonActionPerformed
       
        int result = JOptionPane.showConfirmDialog(null, "Do you want to log-out?", "Confirmation", JOptionPane.YES_NO_OPTION);
        
        if(result == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Log-out Successfully!");
            LoginMenu loginMenu = new LoginMenu();
            loginMenu.show();
            dispose();
        }
        
    }//GEN-LAST:event_LogOut_ButtonActionPerformed

    private void listStaffBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listStaffBTActionPerformed
        Display_Tab.setSelectedIndex(5);
    }//GEN-LAST:event_listStaffBTActionPerformed

    private void salesBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesBTActionPerformed
        Display_Tab.setSelectedIndex(7);
    }//GEN-LAST:event_salesBTActionPerformed

    private void backBT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBT1ActionPerformed
        Display_Tab.setSelectedIndex(4);
    }//GEN-LAST:event_backBT1ActionPerformed

    private void backBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTActionPerformed
        Display_Tab.setSelectedIndex(4);
    }//GEN-LAST:event_backBTActionPerformed

    private void productBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productBTActionPerformed
        Display_Tab.setSelectedIndex(6);
    }//GEN-LAST:event_productBTActionPerformed

    private void sortValuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category_BeveragesActionPerformed

    }//GEN-LAST:event_category_BeveragesActionPerformed

    private void sortBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category_BeveragesActionPerformed
        String selectedItem1 = (String) choiceComboBox.getSelectedItem();
        String selectedItem2 = (String) sortValues.getSelectedItem();

        if(selectedItem1.equals("Sales per Product") && selectedItem2.equals("Daily")){
            salesPerProductDailySort();

            if(category_Food.isSelected()){
                salesPerProductFoodDaily();
            } else if (!category_Food.isSelected()) {
                clearRowsBasedOnColumnValue(model6, 1, "Food");
            }

            if (category_Beverages.isSelected()){
                salesPerProductBeveragesDaily();
            } else if (!category_Beverages.isSelected()) {
                clearRowsBasedOnColumnValue(model6, 1, "Beverages");
            }

            if (category_Medicine.isSelected()){
                salesPerProductMedicineDaily();
            } else if (!category_Medicine.isSelected()) {
                clearRowsBasedOnColumnValue(model6, 1, "Medicine");
            }
        } else if (selectedItem1.equals("Sales per Product") && selectedItem2.equals("Weekly")) {
            salesPerProductWeeklySort();

            if(category_Food.isSelected()){
                salesPerProductWeekly("Food");
            } else if (!category_Food.isSelected()) {
                clearRowsBasedOnColumnValue(model6, 1, "Food");
            }

            if(category_Beverages.isSelected()){
                salesPerProductWeekly("Beverages");
            } else if (!category_Beverages.isSelected()) {
                clearRowsBasedOnColumnValue(model6, 1, "Beverages");
            }

            if(category_Medicine.isSelected()){
                salesPerProductWeekly("Medicine");
            } else if (!category_Medicine.isSelected()) {
                clearRowsBasedOnColumnValue(model6, 1, "Medicine");
            }

        } else if (selectedItem1.equals("Sales per Product") && selectedItem2.equals("Monthly")) {
            salesPerProductMonthlySort();

            if(category_Food.isSelected()){
                salesPerProductMonthly("Food");
            } else if (!category_Food.isSelected()) {
                clearRowsBasedOnColumnValue(model6, 1, "Food");
            }

            if(category_Beverages.isSelected()){
                salesPerProductMonthly("Beverages");
            } else if (!category_Beverages.isSelected()) {
                clearRowsBasedOnColumnValue(model6, 1, "Beverages");
            }

            if(category_Medicine.isSelected()){
                salesPerProductMonthly("Medicine");
            } else if (!category_Medicine.isSelected()) {
                clearRowsBasedOnColumnValue(model6, 1, "Medicine");
            }

        } else if (selectedItem1.equals("Total Sales") && selectedItem2.equals("Daily")) {
            totalSalesDailySort();
            clearTableSales();
            totalSalesDaily();
        } else if (selectedItem1.equals("Total Sales") && selectedItem2.equals("Weekly")) {
            totalSalesWeeklySort();
            clearTableSales();
            totalSalesWeekly();
        } else if (selectedItem1.equals("Total Sales") && selectedItem2.equals("Monthly")) {
            totalSalesMonthlySort();
            clearTableSales();
            totalSalesMonthly();
        }
    }//GEN-LAST:event_category_BeveragesActionPerformed

    private void viewBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBTActionPerformed
        String selectedItem = (String) choiceComboBox.getSelectedItem();
        
        if(selectedItem.equals("Sales per Product")){
            jLabel4.setVisible(true);
            category_Food.setVisible(true);
            category_Beverages.setVisible(true);
            category_Medicine.setVisible(true);
        }else if(selectedItem.equals("Total Sales")){
            jLabel4.setVisible(false);
            category_Food.setVisible(false);
            category_Beverages.setVisible(false);
            category_Medicine.setVisible(false);
        }
    }//GEN-LAST:event_viewBTActionPerformed

    private void category_BeveragesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category_BeveragesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_category_BeveragesActionPerformed

    private void backBTSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTSalesActionPerformed
        Display_Tab.setSelectedIndex(4);
    }//GEN-LAST:event_backBTSalesActionPerformed

    private void sortStaffBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTSalesActionPerformed
        clearTable();
        try{
            connectToDB();
            String sql = "SELECT * FROM staff order by name asc";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String staffId = resultSet.getString("staff_ID");
                String name = resultSet.getString("name");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");

                model.addRow(new Object[]{staffId, name, username, password});
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_backBTSalesActionPerformed

    private void Food_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTSalesActionPerformed
        clearTableInventory();
        foodProductInventoryDisplay();
    }//GEN-LAST:event_backBTSalesActionPerformed

    private void Beverages_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTSalesActionPerformed
        clearTableInventory();
        beveragesProductInventoryDisplay();
    }//GEN-LAST:event_backBTSalesActionPerformed

    private void Medicine_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTSalesActionPerformed
        clearTableInventory();
        medicineProductInventoryDisplay();
    }//GEN-LAST:event_backBTSalesActionPerformed

    private void ViewAll_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTSalesActionPerformed
        clearTableInventory();
        showALlProductInventory();
    }//GEN-LAST:event_backBTSalesActionPerformed

    //------------------------------------------------------------------------------------------
    //Methods
    //===============================Staff=============================================
    private void countStaff(){
        connectToDB();
        int staffCount = 0;
        String sql = "select count(*) from staff";
        try(Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql)) {
            if(rs.next()){
                staffCount = rs.getInt(1);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        StaffNum_Label1.setText("" +staffCount);
    }

    //----------------COUNT PRODUCT---------------
    private void countProduct(){
        connectToDB();
        int prodCount = 0;
        String sql = "select count(*) from product";
        try(Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql)) {
            if(rs.next()){
                prodCount = rs.getInt(1);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        StaffNum_Label3.setText("" +prodCount);
    }

    //-----------------COUNT TRANSACTIONS------------------
    private void countTransactions(){
        connectToDB();
        int transactionCount = 0;
        String sql = "select count(*) from payment";
        try(Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql)) {
            if(rs.next()){
                transactionCount = rs.getInt(1);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        StaffNum_Label.setText("" +transactionCount);
    }

    private void searchStaff(){
        connectToDB();
        String searchTF = SearchTF.getText();
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM staff WHERE staff_ID='" + searchTF + "'";
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                clearTable();
                    String staffId = resultSet.getString("staff_ID");
                    String name = resultSet.getString("name");
                    String username = resultSet.getString("username");
                    String password = resultSet.getString("password");

                    model.addRow(new Object[]{staffId, name, username, password});
            } else {
                JOptionPane.showMessageDialog(this, "No data found with the specified Staff ID.", "Error", JOptionPane.ERROR_MESSAGE);
                clearTable();
                SearchTF.setText("");
                showALlStaff();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to search for data in the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void showALlStaff(){
        try{
            connectToDB();
            String sql = "SELECT * FROM staff order by dateCreated";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String staffId = resultSet.getString("staff_ID");
                String name = resultSet.getString("name");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");

                model.addRow(new Object[]{staffId, name, username, password});
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    //===============================PRODUCT=============================================
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

                model2.addRow(new Object[]{productID, prodCategory, prodName, "₱ "+prodPrice});
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void searchProduct(){
        connectToDB();
        String prodSearch = prodSearchTF.getText();
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM product WHERE prod_ID='" + prodSearch + "'";
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                clearTableProduct();
                String prodID = resultSet.getString("prod_ID");
                String prodCategory = resultSet.getString("prod_type");
                String prodName = resultSet.getString("prod_name");
                String prodPrice = resultSet.getString("prod_Price");

                model2.addRow(new Object[]{prodID, prodCategory, prodName, "₱ "+prodPrice});
            } else {
                JOptionPane.showMessageDialog(this, "No data found with the specified Product ID.", "Error", JOptionPane.ERROR_MESSAGE);
                clearTableProduct();
                prodSearchTF.setText("");
                showALlProduct();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to search for data in the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void foodProductDisplay(){
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

                model2.addRow(new Object[]{productID, prodCategory, prodName, "₱ "+prodPrice});
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void beveragesProductDisplay(){
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

                model2.addRow(new Object[]{productID, prodCategory, prodName, "₱ "+prodPrice});
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void medicineProductDisplay(){
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

                model2.addRow(new Object[]{productID, prodCategory, prodName, "₱ "+prodPrice});
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    //===============================INVENTORY=============================================
    private void showALlProductInventory(){
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

    private void searchProductInventory(){
        connectToDB();
        String prodSearch = prodSearchInventoryTF.getText();
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM product WHERE prod_ID='" + prodSearch + "'";
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                clearTableProduct();
                String prodID = resultSet.getString("prod_ID");
                String prodCategory = resultSet.getString("prod_type");
                String prodName = resultSet.getString("prod_name");
                String prodPrice = resultSet.getString("prod_price");
                String prodStock = resultSet.getString("prod_quantity");

                model3.addRow(new Object[]{prodID, prodCategory, prodName, "₱ "+prodPrice, prodStock});
            } else {
                JOptionPane.showMessageDialog(this, "No data found with the specified Product ID.", "Error", JOptionPane.ERROR_MESSAGE);
                clearTableProduct();
                prodSearchInventoryTF.setText("");
                showALlProductInventory();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to search for data in the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void foodProductInventoryDisplay(){
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

    private void beveragesProductInventoryDisplay(){
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
                String prodStock = resultSet.getString("prod_Quantity");

                model3.addRow(new Object[]{productID, prodCategory, prodName, "₱ "+prodPrice, prodStock});
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void medicineProductInventoryDisplay(){
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

    //===========================REPORTS===============================================
    //-------------STAFF LIST--------------------
    private void showALlStaffList(){
        try{
            connectToDB();
            String sql = "SELECT * FROM staff order by dateCreated";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String staffId = resultSet.getString("staff_ID");
                String name = resultSet.getString("name");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String dateCreated = resultSet.getString("dateCreated");

                model4.addRow(new Object[]{staffId, name, username, password, dateCreated});
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    //---------------PRODUCT LIST---------------
    private void showALlProductList(){
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

                model5.addRow(new Object[]{productID, prodCategory, prodName, "₱ "+prodPrice, prodStock});
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    //================================SALES===================================
    //----------------------SALES PER PRODUCT--------------------------
    private void salesPerProductDailySort(){
        model6.setColumnCount(0);
        model6.addColumn("Daily Date");
        model6.addColumn("Category");
        model6.addColumn("Total Amount");
    }

    //-------------DAILY---------------
    private void salesPerProductBeveragesDaily(){
        clearTableSales();
        try{
            connectToDB();
            String sql = "SELECT product_ts, product_type, sum(product_TotalPrice) as totalAmount FROM payment where product_type = 'Beverages' GROUP BY product_ts;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String dailyDate = resultSet.getString("product_ts");
                String product_type = resultSet.getString("product_type");
                String totalAmount = resultSet.getString("totalAmount");

                model6.addRow(new Object[]{dailyDate, product_type, "₱ "+totalAmount});
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void salesPerProductMedicineDaily(){
        clearTableSales();
        try{
            connectToDB();
            String sql = "SELECT product_ts, product_type, sum(product_TotalPrice) as totalAmount FROM payment where product_type = 'Medicine' GROUP BY product_ts;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String dailyDate = resultSet.getString("product_ts");
                String product_type = resultSet.getString("product_type");
                String totalAmount = resultSet.getString("totalAmount");

                model6.addRow(new Object[]{dailyDate, product_type, "₱ "+totalAmount});
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void salesPerProductFoodDaily(){
        clearTableSales();
        try{
            connectToDB();
            String sql = "SELECT product_ts, product_type, sum(product_TotalPrice) as totalAmount FROM payment where product_type = 'Food' GROUP BY product_ts;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String dailyDate = resultSet.getString("product_ts");
                String product_type = resultSet.getString("product_type");
                String totalAmount = resultSet.getString("totalAmount");

                model6.addRow(new Object[]{dailyDate, product_type, "₱ "+totalAmount});
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    //-------------SALES PER PRODUCT WEEKLY---------------
    private void salesPerProductWeeklySort(){
        model6.setColumnCount(0);
        model6.addColumn("Month");
        model6.addColumn("Week");
        model6.addColumn("Category");
        model6.addColumn("Total Amount");
    }

    private void salesPerProductWeekly(String productType){
        clearTableSales();
        try{
            connectToDB();
            String sql = "SELECT " +
                    "product_ts, " +
                    "product_type, " +
                    "SUM(product_TotalPrice) AS totalAmount, " +
                    "EXTRACT(MONTH FROM product_ts) AS monthNumber, " +
                    "WEEK(product_ts) AS weekNumber, " +
                    "CASE " +
                    "    WHEN WEEK(product_ts) = WEEK(CURRENT_DATE()) THEN 'Current Week' " +
                    "    ELSE CONCAT('Week ', WEEK(product_ts)) " +
                    "END AS weekName, " +
                    "CASE EXTRACT(MONTH FROM product_ts) " +
                    "    WHEN 1 THEN 'January' " +
                    "    WHEN 2 THEN 'February' " +
                    "    WHEN 3 THEN 'March' " +
                    "    WHEN 4 THEN 'April' " +
                    "    WHEN 5 THEN 'May' " +
                    "    WHEN 6 THEN 'June' " +
                    "    WHEN 7 THEN 'July' " +
                    "    WHEN 8 THEN 'August' " +
                    "    WHEN 9 THEN 'September' " +
                    "    WHEN 10 THEN 'October' " +
                    "    WHEN 11 THEN 'November' " +
                    "    WHEN 12 THEN 'December' " +
                    "END AS monthName " +
                    "FROM " +
                    "payment " +
                    "WHERE " +
                    "product_type = '" + productType + "' " +
                    "GROUP BY " +
                    "product_ts, monthNumber, weekNumber, weekName, monthName, product_type " +
                    "ORDER BY " +
                    "monthNumber, weekNumber;";



            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String month = resultSet.getString("monthName");
                String week = resultSet.getString("weekNumber");
                String category = resultSet.getString("product_type");
                String totalAmount = resultSet.getString("totalAmount");

                model6.addRow(new Object[]{month, week, category, "₱ "+totalAmount});
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    //-----------SALES PER PRODUCT MONTHLY--------------
    private void salesPerProductMonthlySort(){
        model6.setColumnCount(0);
        model6.addColumn("Month");
        model6.addColumn("Category");
        model6.addColumn("Total Amount");
    }

    private void salesPerProductMonthly(String productType){
        clearTableSales();
        try{
            connectToDB();
            String sql = "SELECT " +
                    "product_ts, " +
                    "product_type, " +
                    "SUM(product_TotalPrice) AS totalAmount, " +
                    "EXTRACT(MONTH FROM product_ts) AS monthNumber, " +
                    "CASE EXTRACT(MONTH FROM product_ts) " +
                    "   WHEN 1 THEN 'January' " +
                    "   WHEN 2 THEN 'February' " +
                    "   WHEN 3 THEN 'March' " +
                    "   WHEN 4 THEN 'April' " +
                    "   WHEN 5 THEN 'May' " +
                    "   WHEN 6 THEN 'June' " +
                    "   WHEN 7 THEN 'July' " +
                    "   WHEN 8 THEN 'August' " +
                    "   WHEN 9 THEN 'September' " +
                    "   WHEN 10 THEN 'October' " +
                    "   WHEN 11 THEN 'November' " +
                    "   WHEN 12 THEN 'December' " +
                    "END AS monthName " +
                    "FROM " +
                    "payment " +
                    "WHERE " +
                    "product_type = '" + productType + "' " +
                    "GROUP BY " +
                    "EXTRACT(MONTH FROM product_ts), monthName " +
                    "ORDER BY " +
                    "EXTRACT(MONTH FROM product_ts);";


            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String month = resultSet.getString("monthName");
                String category = resultSet.getString("product_type");
                String totalAmount = resultSet.getString("totalAmount");

                model6.addRow(new Object[]{month, category, "₱ "+totalAmount});
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }


    //--------------------TOTAL SALES----------------------------
    //---------------TOTAL SALES DAILY---------------
    private void totalSalesDailySort(){
        model6.setColumnCount(0);
        model6.addColumn("Daily Date");
        model6.addColumn("Total Amount");
    }

    private void totalSalesDaily(){
        clearTableSales();
        try{
            connectToDB();
            String sql = "SELECT product_ts, sum(product_TotalPrice) as totalAmount FROM payment GROUP BY product_ts;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String dailyDate = resultSet.getString("product_ts");
                String totalAmount = resultSet.getString("totalAmount");

                model6.addRow(new Object[]{dailyDate, "₱ "+totalAmount});
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }


    //---------------------TOTAL SALES WEEKLY--------------------
    private void totalSalesWeeklySort(){
        model6.setColumnCount(0);
        model6.addColumn("Month");
        model6.addColumn("Week");
        model6.addColumn("Total Amount");
    }

    private void totalSalesWeekly(){
        clearTableSales();
        try{
            connectToDB();
            String sql = "SELECT " +
                    "product_ts, " +
                    "SUM(product_TotalPrice) AS totalAmount, " +
                    "EXTRACT(MONTH FROM product_ts) AS monthNumber, " +
                    "WEEK(product_ts) AS weekNumber, " +
                    "CASE " +
                    "    WHEN WEEK(product_ts) = WEEK(CURRENT_DATE()) THEN 'Current Week' " +
                    "    ELSE CONCAT('Week ', WEEK(product_ts)) " +
                    "END AS weekName, " +
                    "CASE EXTRACT(MONTH FROM product_ts) " +
                    "    WHEN 1 THEN 'January' " +
                    "    WHEN 2 THEN 'February' " +
                    "    WHEN 3 THEN 'March' " +
                    "    WHEN 4 THEN 'April' " +
                    "    WHEN 5 THEN 'May' " +
                    "    WHEN 6 THEN 'June' " +
                    "    WHEN 7 THEN 'July' " +
                    "    WHEN 8 THEN 'August' " +
                    "    WHEN 9 THEN 'September' " +
                    "    WHEN 10 THEN 'October' " +
                    "    WHEN 11 THEN 'November' " +
                    "    WHEN 12 THEN 'December' " +
                    "END AS monthName " +
                    "FROM " +
                    "payment " +
                    "GROUP BY " +
                    "EXTRACT(MONTH FROM product_ts), weekNumber, monthName " +
                    "ORDER BY " +
                    "monthNumber, weekNumber;";



            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String month = resultSet.getString("monthName");
                String week = resultSet.getString("weekNumber");
                String totalAmount = resultSet.getString("totalAmount");

                model6.addRow(new Object[]{month, week, "₱ "+totalAmount});
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    //----------TOTAL SALES MONTHLY-------------
    private void totalSalesMonthlySort(){
        model6.setColumnCount(0);
        model6.addColumn("Month");
        model6.addColumn("Total Amount");
    }

    private void totalSalesMonthly(){
        clearTableSales();
        try{
            connectToDB();
            String sql = "SELECT " +
                    "product_ts, " +
                    "SUM(product_TotalPrice) AS totalAmount, " +
                    "EXTRACT(MONTH FROM product_ts) AS monthNumber, " +
                    "CASE EXTRACT(MONTH FROM product_ts) " +
                    "    WHEN 1 THEN 'January' " +
                    "    WHEN 2 THEN 'February' " +
                    "    WHEN 3 THEN 'March' " +
                    "    WHEN 4 THEN 'April' " +
                    "    WHEN 5 THEN 'May' " +
                    "    WHEN 6 THEN 'June' " +
                    "    WHEN 7 THEN 'July' " +
                    "    WHEN 8 THEN 'August' " +
                    "    WHEN 9 THEN 'September' " +
                    "    WHEN 10 THEN 'October' " +
                    "    WHEN 11 THEN 'November' " +
                    "    WHEN 12 THEN 'December' " +
                    "END AS monthName " +
                    "FROM " +
                    "payment " +
                    "GROUP BY " +
                    "EXTRACT(MONTH FROM product_ts), monthName " +
                    "ORDER BY " +
                    "EXTRACT(MONTH FROM product_ts);";



            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String month = resultSet.getString("monthName");
                String totalAmount = resultSet.getString("totalAmount");

                model6.addRow(new Object[]{month, "₱ "+totalAmount});
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void clearTable(){
        model.setRowCount(0);
    }

    private void clearTableProduct(){
        model2.setRowCount(0);
    }

    private void clearTableInventory(){
        model3.setRowCount(0);
    }

    private void clearTableSales(){
        model6.setRowCount(0);
    }

    //-------E delete niya ang row nga naay value nga naka check-------
    public static void clearRowsBasedOnColumnValue(DefaultTableModel model6, int column, Object value) {
        for (int i = model6.getRowCount() - 1; i >= 0; i--) {
            Object cellValue = model6.getValueAt(i, column);
            if (cellValue != null && cellValue.equals(value)) {
                model6.removeRow(i);
            } else if (cellValue == null && value == null) {
                model6.removeRow(i);
            }
        }
    }




    public static void main(String args[]) {
        
        FlatLightLaf.setup();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Button;
    private javax.swing.JButton Add_Button1;
    private javax.swing.JButton Add_Button3;
    private javax.swing.JButton Beverages_Button;
    private javax.swing.JButton Beverages_Button1;
    private javax.swing.JPanel Dashboard;
    private javax.swing.JButton Dashboard_Button;
    private javax.swing.JLabel Dashboard_Label;
    private javax.swing.JLabel Dashboard_Label1;
    private javax.swing.JLabel Dashboard_Label2;
    private javax.swing.JLabel Dashboard_Label3;
    private javax.swing.JLabel Dashboard_Label4;
    private javax.swing.JLabel Dashboard_Label5;
    private javax.swing.JLabel Dashboard_Label6;
    private javax.swing.JLabel Dashboard_Label7;
    private javax.swing.JButton Delete_Button;
    private javax.swing.JTabbedPane Display_Tab;
    private javax.swing.JButton Edit_Button;
    private javax.swing.JButton Edit_Button2;
    private javax.swing.JButton Food_Button;
    private javax.swing.JButton Food_Button1;
    private javax.swing.JPanel Inventory;
    private javax.swing.JButton Inventory_Button;
    private javax.swing.JButton LogOut_Button;
    private javax.swing.JButton Medicine_Button;
    private javax.swing.JButton Medicine_Button1;
    private javax.swing.JPanel Menu_Panel;
    private javax.swing.JPanel Product;
    private javax.swing.JPanel ProductList;
    private javax.swing.JButton Product_Button;
    private javax.swing.JLabel Product_Icon3;
    private javax.swing.JPanel Product_Panel;
    private javax.swing.JPanel Product_Panel2;
    private javax.swing.JPanel Reports;
    private javax.swing.JButton Reports_Button;
    private javax.swing.JLabel Reports_Icon;
    private javax.swing.JTextField prodSearchTF;
    private javax.swing.JTextField prodSearchInventoryTF;
    private javax.swing.JTextField SearchTF;
    private javax.swing.JButton Searh_Button;
    private javax.swing.JButton allStaff;
    private javax.swing.JButton prodSearchBT;
    private javax.swing.JButton Searh_Button2;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JSeparator Separator2;
    private javax.swing.JSeparator Separator3;
    private javax.swing.JSeparator Separator4;
    private javax.swing.JSeparator Separator5;
    private javax.swing.JSeparator Separator6;
    private javax.swing.JSeparator Separator7;
    private javax.swing.JSeparator Separator8;
    private javax.swing.JPanel Staff;
    private javax.swing.JPanel StaffList;
    private javax.swing.JLabel StaffNum_Label;
    private javax.swing.JLabel StaffNum_Label1;
    private javax.swing.JLabel StaffNum_Label3;
    private javax.swing.JButton Staff_Button;
    private javax.swing.JLabel Staff_Icon1;
    private javax.swing.JPanel Staff_Panel1;
    private javax.swing.JLabel Staff_label;
    private javax.swing.JLabel Staff_label1;
    private javax.swing.JLabel Staff_label3;
    private javax.swing.JButton ViewAll_Button;
    private javax.swing.JButton ViewAll_Button1;
    private javax.swing.JButton backBT;
    private javax.swing.JButton backBT1;
    private javax.swing.JButton backBTSales;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox category_Beverages;
    private javax.swing.JCheckBox category_Food;
    private javax.swing.JCheckBox category_Medicine;
    private javax.swing.JComboBox<String> choiceComboBox;
    private javax.swing.JButton deleteBT;
    private javax.swing.JButton sortStaffBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JButton listStaffBT;
    private javax.swing.JButton productBT;
    private javax.swing.JPanel sales;
    private javax.swing.JButton salesBT;
    private javax.swing.JButton sortBT;
    private javax.swing.JComboBox<String> sortValues;
    private javax.swing.JButton viewBT;
    // End of variables declaration//GEN-END:variables
}
