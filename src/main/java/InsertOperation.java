import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertOperation {
    public static void main(String[] args) {
        String query = "INSERT INTO employee_payroll (name,salary,start ) VALUES ('Sandip',200000,'22-05-25')";
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_service? user=root & password=root");
            System.out.println("connected to sql server successfully");
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data inserted in Database");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
