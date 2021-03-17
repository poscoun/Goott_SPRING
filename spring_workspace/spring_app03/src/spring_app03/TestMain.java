package spring_app03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/printer.xml"));
		
		Printer p = factory.getBean("dp", Printer.class); // 형변환
		p.printing("내일은 수요일");
		
		System.out.println("-------------------------------");
		// DotPrinter로 출력
		// 출력
		// DotPrinter 예열 중 .........
		// msg : 내일은 수요일
		
		
	}
}
