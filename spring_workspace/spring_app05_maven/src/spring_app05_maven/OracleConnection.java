package spring_app05_maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection {
	   private static OracleConnection oc = null;
	   private static Connection conn;
	   
	   final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	   final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	   final String USER = "scott";
	   final String PASSWORD = "tiger";
	   
	   private OracleConnection() {}
	   
	   public static OracleConnection getInstance() {
	      if(oc==null) oc = new OracleConnection();
	      return oc;
	   }
	   
	   public Connection getConnection() {
	      if(conn==null) {
	         try {
	            Class.forName(DRIVER);
	            
	            conn = DriverManager.getConnection(URL, USER, PASSWORD);
	            
	            System.out.println("conn : " + conn);
	               
	            } catch (SQLException e) {
	               // TODO Auto-generated catch block
	               e.printStackTrace();
	         } catch (ClassNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	         }
	      }// if end
	      return conn;
	  }
}

