package spring_aop06_aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("app.xml");
		
		CustomerService cs = ctx.getBean("cs", CustomerService.class);
		
		cs.printName();
		
	}
}
