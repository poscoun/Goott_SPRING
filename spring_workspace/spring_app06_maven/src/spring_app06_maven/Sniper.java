package spring_app06_maven;

public class Sniper implements Character {
   
   Weapon w;
   Gun g;
   StunGun s;
   
   int hp;
   
   public Sniper() {
      // TODO Auto-generated constructor stub
      this.hp = 100;
   }
   
   public Sniper(Weapon w, int hp) {
      this.w =w;
      this.hp = hp;
   }
     
   public Weapon getW() {
      return w;
   }

   public void setW(Weapon w) {
      this.w = w;
   }

   public int getHp() {
      return hp;
   }

   public void setHp(int hp) {
      this.hp = hp;
   }

   @Override
   public void walk() {
      // TODO Auto-generated method stub
      System.out.println(" 조심조심 위치로 이동");

   }

   @Override
   public void eat(String it) {
      // TODO Auto-generated method stub
      System.out.println(" 전투식량을 먹어요");

   }

   @Override
   public void attack(Object obj) {
      // TODO Auto-generated method stub
      System.out.println( obj+" 을 조준하고 호흡을 멈추고 쏜다");

   }

   @Override
   public void get(Object obj) {
      // TODO Auto-generated method stub
      System.out.println( obj+" 얻었음");

   }

}
