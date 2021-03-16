package spring_app01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
   public static void main(String[] args) {
//      HelloKr hk = new HelloKr();
//      hk.sayHello("홍길동");
      
      //위 자바코드처럼 구동되도록 xml 설정 파일을 읽어들이기 
      
      BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/app.xml"));
      
      Object obj =  factory.getBean("hc"); //xml bean의 id로 찾아옴
      Hello h = (Hello)obj;
      
      h.sayHello("홍길동");
   }

}