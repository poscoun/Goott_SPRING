package java_network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//Server
public class NetServer {
   public static void main(String[] args) {
      //ServerSocket : 클라이언트보다 먼저 실행되어 클라이언트의 접속 요청을 기다리는 객체
      //             : 클라이언트가 접속하면 양방향 통신을 할 수 있는 Socket 객체를 생성
      
      try {
         ServerSocket ss = new ServerSocket(5000);
         System.out.println("접속을 기다리는중 .......");
         
         //소켓(client)접속 정보 받기
         Socket client = ss.accept();
         
         InetAddress inet = client.getInetAddress();
         
         System.out.println("현제 접속한 pc의 ip : "+ inet.getHostAddress());
         
         
         //IO
         //수신부
         
         InputStream is = client.getInputStream();
         
         //발신부
         OutputStream os = client.getOutputStream();
         
         
         //서버 수신qn bridge
         InputStreamReader isr = new InputStreamReader(is);
         BufferedReader br = new BufferedReader(isr);
         
         //서버 발신부 bridge
         OutputStreamWriter osr = new OutputStreamWriter(os);
         BufferedWriter bw = new BufferedWriter(osr);
         
         PrintWriter pw = new PrintWriter(bw);
         
         String m = null;
         while((m=br.readLine())!=null){
            System.out.println(inet.getHostAddress() + " : " + m);
            
            pw.println("서버가 리턴한 메시지 :" + m);
            pw.flush();
            
         }
         
         
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

}