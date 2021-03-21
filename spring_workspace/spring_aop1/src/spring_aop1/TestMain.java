package spring_aop1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("app.xml");
		
		CustomerService cs = context.getBean("execute", CustomerService.class);
		cs.printName();
		cs.printEmail();
	}

}
