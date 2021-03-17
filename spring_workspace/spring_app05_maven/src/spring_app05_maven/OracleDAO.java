package spring_app05_maven;

import java.sql.Connection;

public class OracleDAO implements CommonDAO{
   
   public OracleDAO() {}
   
   @Override
   public Connection connect() {
      
      return OracleConnection.getInstance().getConnection();
   }

   @Override
   public void selectAll() {
      // TODO Auto-generated method stub
      System.out.println("오라클 dbms에서 데이터 전부 출력");
   }

}