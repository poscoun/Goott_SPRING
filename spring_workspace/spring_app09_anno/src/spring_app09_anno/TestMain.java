package spring_app09_anno;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		
//		Gun g1 = new Gun();		
//		Police p1 = new Police(g1, 120);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
 		
		Character ch1 = context.getBean("p1", Character.class);
		
		
		
		ch1.walk();
		ch1.eat(" 도넛 ");
		ch1.attack(" 도둑 ");
		
	}
}
