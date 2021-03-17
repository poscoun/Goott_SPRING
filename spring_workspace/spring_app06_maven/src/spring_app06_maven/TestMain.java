package spring_app06_maven;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		
//		Gun g1 = new Gun();		
//		Police p1 = new Police(g1, 120);
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		
		Character ch1 = factory.getBean("sniper", Character.class);
		
		ch1.walk();
		ch1.eat(" 도넛 ");
		ch1.attack(" 도둑 ");
		
	}
}
