package spring_app12_conn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		//new OracleDAO();
		//System.out.println(new OracleDAO().selectCount());
		
		
		System.out.println("--------------------------------------------------------");
//		ApplicationContext context = new ClassPathXmlApplicationContext("conn.xml");
//		
//		OracleDAO dao = context.getBean("oracle", OracleDAO.class);
//		System.out.println("Dept 테이블의 총 row 수 : " + dao.selectCount());
		
		System.out.println("--------------------------------------------------------");
		
		ApplicationContext context = new GenericXmlApplicationContext("conn.xml");
		
		MysqlDAO dao = context.getBean("mysql", MysqlDAO.class);
		
		System.out.println("Dept 테이블의 총 row 수 : "+ dao.selectCount());
		
		((AbstractApplicationContext)context).registerShutdownHook();
		// registerShutdownHook() : destroy 명시적 호출
		
	}
}	
