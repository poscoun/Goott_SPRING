package spring_app10_anno;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
   public static void main(String[] args) {
//      Phone phone = new SmartPhone();
//      phone.call("010-1111-2222");
//      phone.sendMsg("안녕");
//      
//      System.out.println("---------------");
//      
//      SmartPhone sphone = new SmartPhone();
//      sphone.watchingNetflix("킹덤");
//      
//      PhoneOS os = new PhoneOS();
//      os.setName("안드로이드");
//      os.setVersion("Android 11");
//      
//      
//      sphone.setOs(os);
//      
//      sphone.showInfo();
      
      System.out.println("----------------------------");
//      BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/app.xml"));

//      SmartPhone sPhone = factory.getBean("sp", SmartPhone.class);
//      sPhone.showInfo();
//      sPhone.call("010-2222-3333");
      
      System.out.println("----------------------------");
      // autowired 사용
//      ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
//      
//      SmartPhone sPhone = context.getBean("sp", SmartPhone.class);
//      sPhone.showInfo();
//      sPhone.call("010-2222-3333");
      
      System.out.println("----------------------------");
      // JavaConf 사용
      ApplicationContext context = new AnnotationConfigApplicationContext(JavaConf.class);
      SmartPhone sPhone = context.getBean("p", SmartPhone.class);
      sPhone.showInfo();
      sPhone.call("010-3333-4444");
   }
}