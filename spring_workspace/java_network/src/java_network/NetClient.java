package java_network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

// client
public class NetClient {
   public static void main(String[] args) {
      // Socket : 다른 소켓과 데이터 송수신을 하는 객체
      
      try {
         Socket s = new Socket("172.16.7.50", 5000);
         
         // IO class
         InputStream is=s.getInputStream();
         OutputStream os=s.getOutputStream();
         
//         os.write(65);    // ASCII => A
         
         // byte stream   ----   bridge       ----   char stream
         //               InputStreamReader
         //               OutputStreamWriter
         
         // ------------------------------------------------------
         
         // 서버가 리턴한 메시지를 받기 위한 객체
         InputStreamReader isr1=new InputStreamReader(is);
         BufferedReader br = new BufferedReader(isr1);
         
         // 서버로 보낼 객체
         OutputStreamWriter osw = new OutputStreamWriter(os);
         BufferedWriter bw = new BufferedWriter(osw);
         
         PrintWriter pw = new PrintWriter(bw);
         
         // 클라이언트가 키보드에 작성한 데이터를 읽어들이는 객체
         System.out.println("입력하세요 : ");
         InputStreamReader isr2 = new InputStreamReader(System.in);
         BufferedReader keyboard = new BufferedReader(isr2);
         
         // ---------------------------------------------------------- /
         
         String msg = null;
         String message = null;
         
         while((msg=keyboard.readLine())!=null) {
        	 System.out.println("내가 입력한 내용 : "+ msg);
        	 
        	 pw.println("클라이언트가 입력한 메시지 : "+ msg);
        	 pw.flush();
        	 
         }
         
      } catch (UnknownHostException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      
   }
}