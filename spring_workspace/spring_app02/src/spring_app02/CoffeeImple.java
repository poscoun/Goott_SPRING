package spring_app02;

public class CoffeeImple implements Beverage {

   String product;
   
   public CoffeeImple() {
	      this.product = "냉수";
	   }
	   
	   public CoffeeImple (String product){
	      this.product = product;
	   }
	   
   @Override
   public void drink(String name) {
      // TODO Auto-generated method stub
      System.out.println(name+"님이 "+product+"을/를 홀짝홀짝 마십니다.");
   }

}