package spring_aop08_anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("app.xml");
		
		CustomerService cs = ctx.getBean("cs", CustomerService.class);
		
		cs.printName();
		System.out.println("-------------------------");
		cs.printEmail();
		
		
	}
}
