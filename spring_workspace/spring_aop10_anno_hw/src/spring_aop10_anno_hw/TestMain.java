package spring_aop10_anno_hw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class TestMain {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("app.xml");
		
		Weapon w = ctx.getBean("w", Weapon.class);
		
		w.fire();
	}
}
