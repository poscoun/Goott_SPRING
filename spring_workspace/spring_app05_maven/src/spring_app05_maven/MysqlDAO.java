package spring_app05_maven;

import java.sql.Connection;

public class MysqlDAO implements CommonDAO {
	
	public MysqlDAO() {}
	
	public Connection connect() {
		return MyConnection.getInstance().getConnection();
	}

	@Override
	public void selectAll() {
		// TODO Auto-generated method stub
		System.out.println("mysql dbms에서 데이터 전부 출력");
	}
}
