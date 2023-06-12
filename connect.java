package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Connect {
    private static String url = "jdbc:sqlserver://AMAR\\SQLExpress;database=Northwind;integratedSecurity=true;";

    public static void main(String[] args) {
        RunDemo();
    }

    public static void RunDemo() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(url);

            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery("SELECT * from emp_details ");

            while (results.next()) {
                System.out.println("Product Name: ");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
