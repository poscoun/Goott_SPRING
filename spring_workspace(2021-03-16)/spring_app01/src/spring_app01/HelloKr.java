package spring_app01;

public class HelloKr implements Hello {

   @Override
   public void sayHello(String name) {
      // TODO Auto-generated method stub
      System.out.println(name + "안녕하세요");
   }
   
}