package Project;
import java.sql.*;

public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
            // Atualizando a classe do driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Atualizando a string de conexão com parâmetros recomendados
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Bibliotech?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", 
                "root", 
                "Gabrieleition2@"
            );
            return con;
        }
        catch (ClassNotFoundException | SQLException e)
        {
            System.out.println("Project.ConnectionProvider.getCon()");
            e.printStackTrace(); // Isso ajudará a identificar a causa exata do erro, se houver.
            return null;
        }
    }
}