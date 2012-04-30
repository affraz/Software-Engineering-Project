
package Model;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDBOracle {
    
    public static void main(String[] args)
      throws ClassNotFoundException, SQLException
  {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    //
    // or
    // DriverManager.registerDriver
    //        (new oracle.jdbc.driver.OracleDriver());
  
        String url = "jdbc:oracle:thin:@//server.local:3306/root";
    //               jdbc:oracle:thin:@//host:port/service
    // or
    // String url = "jdbc:oracle:thin:@server.local:1521:prodsid";
    //               jdbc:oracle:thin:@host:port:SID
    Connection conn =
         DriverManager.getConnection(url,"root", "jalil123");
  
    conn.setAutoCommit(false);
        java.sql.Statement stmt = conn.createStatement();
    ResultSet rset =
         stmt.executeQuery("select mobileNumber from Doctor");
    while (rset.next()) {
         System.out.println (rset.getString(1)); 
    }
    stmt.close();
    System.out.println ("Ok."); 
  }
    
}
