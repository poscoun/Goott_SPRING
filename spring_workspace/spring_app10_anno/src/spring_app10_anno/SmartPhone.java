package spring_app10_anno;

public class SmartPhone implements Phone{
   
   PhoneOS os;
   
   

   public void setOs(PhoneOS os) {
      this.os = os;
   }

   @Override
   public void call(String callNumber) {
      // TODO Auto-generated method stub
      System.out.println(callNumber + "전화거는중");
      
   }

   @Override
   public void sendMsg(String msg) {
      // TODO Auto-generated method stub
      System.out.println(msg+"....전송중");      
   }
   public void playGame(String title) {
      System.out.println(title + "게임하기");
   }
   public void watchingNetflix(String title) {
      System.out.println(title + "감상하기");
   }
   
   public void showInfo() {
      os.printOs();
      os.printVersion();
   }

}