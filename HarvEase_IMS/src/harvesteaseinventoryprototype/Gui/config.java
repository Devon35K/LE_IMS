package harvesteaseinventoryprototype.Gui;
import java.sql.*;
//This file is connected to the Main File
public class config {
    public config(){
        connectToDB();
        createDB();
        staffTable();
        productTable();
        paymentTable();
        cart();
        tempHolder();
    }
    static final String DB_URL = "jdbc:mysql://localhost/";
    static final String USER = "root";
    static final String PASS = "";
    static final String TABLE1 = "clients_user";

    public void connectToDB() {

        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
        }catch(SQLException e) {
            e.printStackTrace();
        }

    }

    public void createDB() {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();

            // Check if db exists
            ResultSet rs = conn.getMetaData().getCatalogs();
            boolean dbExists = false;
            while (rs.next()) {
                String dbName = rs.getString(1);
                if (dbName.equalsIgnoreCase("harvesteasedb")) {
                    dbExists = true;
                    break;
                }
            }
            rs.close();

            if (!dbExists) {
                String sql = "CREATE DATABASE harvesteasedb";
                stmt.executeUpdate(sql);
                System.out.println("DB created successfully!");
            } else {
                System.out.println("DB already exists.");
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void staffTable() {
        try {
            String DB_URL = "jdbc:mysql://localhost/harvesteasedb";
            String USER = "root";
            String PASS = "";

            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();

            // Check if the table already exists
            DatabaseMetaData dbm = conn.getMetaData();
            ResultSet table = dbm.getTables(null, null, "staff", null);

            if (!table.next()) {
                // If the table doesn't exist, create it
                String createTableSQL = "CREATE TABLE staff ("
                        + "staff_ID INT auto_Increment, "
                        + "name VARCHAR(255), "
                        + "username VARCHAR(255), "
                        + "password VARCHAR(255), primary key (staff_ID), "
                        + "dateCreated DATE DEFAULT CURRENT_DATE "
                        + ") auto_increment = 1000";

                stmt.executeUpdate(createTableSQL);
                System.out.println("Created Staff Table successfully.");
            } else {
                System.out.println("Staff Table already exists.");
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void productTable() {
        try {
            String DB_URL = "jdbc:mysql://localhost/harvesteasedb";
            String USER = "root";
            String PASS = "";

            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();

            // Check if the table already exists
            DatabaseMetaData dbm = conn.getMetaData();
            ResultSet table = dbm.getTables(null, null, "product", null);

            if (!table.next()) {
                // If the table doesn't exist, create it
                String createTableSQL = "CREATE TABLE product ("
                        + "prod_ID INT auto_Increment, "
                        + "prod_name VARCHAR(255), "
                        + "prod_quantity int(11), "
                        + "prod_price DECIMAL(10,2),"
                        + "prod_type VARCHAR(255), primary key (prod_ID)"
                        + ") auto_increment = 1000";

                stmt.executeUpdate(createTableSQL);
                System.out.println("Created Product Table successfully.");
            } else {
                System.out.println("Product Table already exists.");
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void paymentTable() {
        try {
            String DB_URL = "jdbc:mysql://localhost/harvesteasedb";
            String USER = "root";
            String PASS = "";

            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();

            // Check if the table already exists
            DatabaseMetaData dbm = conn.getMetaData();
            ResultSet table = dbm.getTables(null, null, "payment", null);

            if (!table.next()) {
                // If the table doesn't exist, create it
                String createTableSQL = "CREATE TABLE payment ("
                        + "payment_ID INT auto_Increment, "
                        + "product_type VARCHAR(255), "
                        + "product_name VARCHAR(255), "
                        + "product_quantity int(11), "
                        + "product_TotalPrice DECIMAL(10,2), "
                        + "product_ts DATE DEFAULT CURRENT_DATE, PRIMARY KEY (payment_ID)"
                        + ") auto_increment = 100";

                stmt.executeUpdate(createTableSQL);
                System.out.println("Created Payment Table successfully.");
            } else {
                System.out.println("Payment Table already exists.");
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void cart() {
        try {
            String DB_URL = "jdbc:mysql://localhost/harvesteasedb";
            String USER = "root";
            String PASS = "";

            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();

            // Check if the table already exists
            DatabaseMetaData dbm = conn.getMetaData();
            ResultSet table = dbm.getTables(null, null, "cart", null);

            if (!table.next()) {
                // If the table doesn't exist, create it
                String createTableSQL = "CREATE TABLE cart ("
                        + "cart_ID INT(11), "
                        + "item VARCHAR(255), "
                        + "totalPrice DECIMAL(10,2), "
                        + "stock int(11)"
                        + ")";

                stmt.executeUpdate(createTableSQL);
                System.out.println("Created Cart Table successfully.");
            } else {
                System.out.println("Cart Table already exists.");
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void tempHolder() {
        try {
            String DB_URL = "jdbc:mysql://localhost/harvesteasedb";
            String USER = "root";
            String PASS = "";

            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();

            // Check if the table already exists
            DatabaseMetaData dbm = conn.getMetaData();
            ResultSet table = dbm.getTables(null, null, "tempHolder", null);

            if (!table.next()) {
                // If the table doesn't exist, create it
                String createTableSQL = "CREATE TABLE tempHolder ("
                        + "cash varchar(255), "
                        + "moneyChange varchar(255)"
                        + ")";

                stmt.executeUpdate(createTableSQL);
                System.out.println("Created temporary Table successfully.");
            } else {
                System.out.println("temporary Table already exists.");
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        config connDB = new config();
        connDB.createDB();
        connDB.staffTable();
        connDB.productTable();
        connDB.paymentTable();
        connDB.cart();
        connDB.tempHolder();
    }

}
