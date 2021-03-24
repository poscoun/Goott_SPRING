package spring_aop05_around;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("app.xml");
		
		CustomerService cs = ctx.getBean("proxyBean", CustomerService.class);
		
		cs.printName();
		cs.printEmail();
	}
}
