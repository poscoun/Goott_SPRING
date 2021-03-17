package spring_app04_maven_ex;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/app.xml"));
	
		Object obj = factory.getBean("b");
		Object obj2	= factory.getBean("b2");
		
		Beverage b = (Beverage)obj;
		Beverage b2 = (Beverage)obj2;
		b.drink("갑돌이");
		b2.drink("갑돌이");
	}
}
