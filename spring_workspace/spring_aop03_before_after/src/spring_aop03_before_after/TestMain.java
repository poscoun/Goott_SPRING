package spring_aop03_before_after;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
   public static void main(String[] args) {
      ApplicationContext context = new GenericXmlApplicationContext("app.xml");
      
      Bank b = context.getBean("proxyBean", Bank.class);
      
      b.transfer(350000);
   }
}