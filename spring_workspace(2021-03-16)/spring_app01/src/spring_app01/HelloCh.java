package spring_app01;

public class HelloCh implements Hello {

   @Override
   public void sayHello(String name) {
      System.out.println(name + "你好");
   }
   

}