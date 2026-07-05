package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/student_management";
    private static final String USER = "root";
    private static final String PASSWORD = "Patil@123";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database Connected Successfully!");
            return con;
        } catch (Exception e)  {
            System.out.println("Connection Failed!");
            e.printStackTrace();
            return null;
        }
    }
}