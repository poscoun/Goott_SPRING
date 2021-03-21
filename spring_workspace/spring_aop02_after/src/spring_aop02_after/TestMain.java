package spring_aop02_after;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("app.xml");
		
		CustomerService cs = context.getBean("proxyBean", CustomerService.class);
		
		cs.printEmail();
		cs.printName();
	}

}
