package spring_app07_anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
   public static void main(String[] args) {
//      GreetingImple gi = new GreetingImple("test");
      
      //스프링 컨테이너를 통한 메시지 출력
      
      ApplicationContext context =  new ClassPathXmlApplicationContext("app.xml");
      GreetingImple gi = context.getBean("gi", GreetingImple.class);
      
      gi.printMsg();
      
   }

}