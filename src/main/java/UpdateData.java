import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
    public static void main(String[] args)  {
        String query = "update employee_payroll set salary=80000 where name='Sandip'";
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_service? user=root & password=root");
            System.out.println("connected to sql server successfully");
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data updated");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
