import java.sql.*;

public class Main {
    public static void main(String[] args) {
        // para establecer una coneccion JDBC se usa el DriverManager        
        try {
            Connection conn = DriverManager.getConnection("database_url", "user", "password");
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}