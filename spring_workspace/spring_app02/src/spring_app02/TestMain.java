package spring_app02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		
		// DI(Depedency Injection) : 의존관계에 있어서 xml 에 있는 정보를 스프링 프레임워크가 run time 시 호출해서 동작
		Object obj = factory.getBean("b"); 
		Object obj2	= factory.getBean("b");
		
		// ref 주소가 같음 : 스프링은 bean 관리를 singleTone으로 관리하고 있음을 알 수 있음!
		System.out.println("obj : "+ obj);
		System.out.println("obj2 : "+ obj2);
		
		System.out.println("----------------------------");
//		CoffeeImple ci = new CoffeeImple();
//		CoffeeImple ci2 = new CoffeeImple();
//		
//		System.out.println("ci : "+ ci);
//		System.out.println("ci2 : "+ ci2);
		
		Beverage b = (Beverage)obj;	
		b.drink("갑돌이");
		
	}
}
