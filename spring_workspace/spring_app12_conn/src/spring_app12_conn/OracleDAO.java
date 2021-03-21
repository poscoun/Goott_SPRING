package spring_app12_conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

public class OracleDAO implements DAO{

   String driver = "oracle.jdbc.driver.OracleDriver";
   String url = "jdbc:oracle:thin:@localhost:1521:XE";
   String user = "scott";
   String password = "tiger";
   
   Connection conn = null;
   StringBuffer sb = new StringBuffer();
   PreparedStatement pstmt = null;
   ResultSet rs = null;
   
   public OracleDAO() {
      // TODO Auto-generated constructor stub
      try {
         Class.forName(driver);
         
         conn = DriverManager.getConnection(url, user, password);
         
         System.out.println("conn :" + conn);
         
      
      } catch (ClassNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }// OracleDAO() end
   
   
   
   
   @Override
   public int selectCount() {
            
      sb.setLength(0);
      sb.append("select count(*) cnt ");
      sb.append("from dept");
      
      int result = 0;
      
      try {
         pstmt = conn.prepareStatement(sb.toString());
         rs = pstmt.executeQuery();
         
         rs.next();
         
         result = rs.getInt("cnt");
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      return result;
   }// selectCount() end

}