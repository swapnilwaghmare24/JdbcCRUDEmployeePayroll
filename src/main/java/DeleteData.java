import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
    public static void main(String[] args) {
        String query = "DELETE FROM employee_payroll WHERE name='sandip'";
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_service? user=root & password=root");
            System.out.println("connected to sql server successfully");
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data deleted from DB");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
