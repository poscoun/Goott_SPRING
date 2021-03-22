package spring_aop04_after_throw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("app.xml");
		
		Message m = ctx.getBean("proxyBean", Message.class);
		
		m.prtMsg();
		
		try {
			m.printThrowMessage();
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			System.out.println("catch");
		}
	}
}
