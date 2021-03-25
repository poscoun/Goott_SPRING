package jUnitEx01;

public class CalculatorTest {
   public static void main(String[] args) {
      Calculator c = new Calculator();
      
      double result = c.sum(10, 20);
      /*
          if(result !=30) {
         System.err.println("error : "+ result);
      }else {
         
      }
         */
      
      /*result = c.sum(1.1, 2);
      
      if(result != 3.1) {
         System.err.println("error : "+ result);
      }
      */
      result = c.sum(1.1, -2);
    /*
      if(result != 0.9) {
         System.err.println("error : "+ result);
      }
      */
      
      if(result >= -0.89 && result <= -0.9) {
    	  System.err.println("error : "+ result);
      }
   }

}