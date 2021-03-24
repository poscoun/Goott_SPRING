package spring_aop10_anno_hw;

public class WeaponImple implements Weapon{
   
   String type;   
   
   public void setType(String type) {
      this.type = type;
   }

   @Override
   public void fire() {
      // TODO Auto-generated method stub
      try {
         Thread.sleep(3000);
      } catch (InterruptedException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      System.out.println(type + " 발사");
   }

   @Override
   public void reload() {
      // TODO Auto-generated method stub
      System.out.println(type + " 재장전 완료");
   }

}