
package util;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class conexao {
    private static String URL = "jdbc:postgresql://localhost:5432/Trabalho";
    private static String USUARIO = "postgres";
    private static String SENHA = "1877";
    
    public Connection conectar() throws SQLException {
         return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}
