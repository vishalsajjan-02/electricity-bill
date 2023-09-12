package electricity.billing.system;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.sql.*;
//
//public class database {
//    Connection connection;
//    Statement statement;
//
//    public database() {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver"); // Load the MySQL JDBC driver
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bill_system", "root", "Vs@02122001");
//            statement = connection.createStatement();
//        }
//        catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}

//
//public class database {
//    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/bill_system";
//    private static final String USER = "root";
//    private static final String PASSWORD = "Vs@02122001";
//    public PreparedStatement statement;
//
//    public static void main(String[] args) {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
//            Statement statement = connection.createStatement();
//            System.out.println("Connected to the database");
//            // Perform database operations here
//            connection.close();
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
import java.sql.*;

public class database {
    Connection connection;
    Statement statement;
    database(){
        try {
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bill_system","root","AyushVish");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bill_system1", "root", "Vs@02122001");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
