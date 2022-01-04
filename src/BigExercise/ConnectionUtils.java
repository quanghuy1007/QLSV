package BigExercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
// Kết nối vào SQLServer.
    public static Connection getSQLServerConnection()
            throws SQLException, ClassNotFoundException {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433; databaseName=BigExercise";
            String userName = "sa";
            String password = "123456789";
            conn = DriverManager.getConnection(url, userName, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    static void closeConnection(Connection conn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
}
