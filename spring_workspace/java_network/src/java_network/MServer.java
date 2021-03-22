package java_network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class MServer extends Thread{
   Socket clinet;
   
   
   public MServer(Socket clinet) {      
      this.clinet = clinet;
   }
   
   @Override
   public void run() {
      //모든 클라이언트와의 통신을 담당하는 코드 
      
      
      //4.client ip 얻어오기
      InetAddress inet = clinet.getInetAddress();
      String ip = inet.getHostAddress();
      System.out.println(ip + " 님 입장");
      System.out.println("------------------");
      
      //5.통신을 위한 IO 처리
      
      try {
//         InputStream is = clinet.getInputStream();
//         InputStreamReader isr = new InputStreamReader(is);
//         BufferedReader br =new BufferedReader(isr);
//         
         //수신부
         BufferedReader br = new BufferedReader(new InputStreamReader(clinet.getInputStream()));
         
         //발신부
         PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(clinet.getOutputStream())));

         
         //6. 반복해서 메시지 읽어오고 콘솔에 출력
         String msg = null;
         while((msg=br.readLine())!=null) {
            System.out.println(ip + " : " + msg);
   
            pw.println("서버에서 리턴한 메시지 : " + msg);
            
            pw.flush();
         }

      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
   
   }
}