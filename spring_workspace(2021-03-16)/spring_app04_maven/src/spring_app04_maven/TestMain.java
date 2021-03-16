package spring_app04_maven;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/app.xml"));
	
		Message msg = factory.getBean("g", Message.class);
		
		msg.sayHello("쉬는시간입니다");
	}
}
