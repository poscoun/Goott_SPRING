package kr.co.goott.app.mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class ConnectionManager {
//	SqlSession  ==== Connection
	
	static SqlSessionFactory factory;
	
//	static {} : ConnectionManager가 메모리에 로딩될 때 같이 실행되는 부분
//	          : new 하기 전에 실행되는  코드 블록
	
	static {
		try {
			Reader r = Resources.getResourceAsReader("resource/SqlMapConfig.xml");
			
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
			
			factory = ssfb.build(r);			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}// static{} end
	
	public static SqlSessionFactory getFactory() {
		return factory;
	}
	
	
}












