package spring_app01;

public class HelloJp implements Hello{
   
   @Override
   public void sayHello(String name) {
      System.out.println(name + "歓迎致します");
   }

}