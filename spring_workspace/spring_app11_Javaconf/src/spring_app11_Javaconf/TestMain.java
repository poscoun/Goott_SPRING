package spring_app11_Javaconf;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");		Autowired 사용 시
		
		BeanFactory context = new AnnotationConfigApplicationContext(javaConf.class);
		
		Monitor mt = context.getBean("sm", Monitor.class);
		
		mt.showMonitor();
	}
}
