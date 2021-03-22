package spring_aop03_before_after;

import java.io.File;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.aop.AfterReturningAdvice;

public class MethodAfter_Advice implements AfterReturningAdvice {

   @Override
   public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
      // OS에 파일로 이체 결과를 저장해두기
      // C:\Users\goott7\Downloads\log\오늘날짜.txt
      
      Date d = new Date();
      
      SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMddhh24mmss");
      String fileName = sdf.format(d);
      
      // 디렉토리 생성
      String dir = "C:\\Users\\goott\\Downloads\\log";
      
      File f = new File(dir);
      
      // 파일, 디렉토리가 존재하지 않는다면 생성
      if(!f.exists()) {
         f.mkdir();
      }
      
      // 파일 객체 생성
      // new File(지정주소+파일이름+확장자)
      File f2 = new File(dir+ "\\" + fileName + ".txt");
      
      if(!f2.exists()) {
         f2.createNewFile();
      }
      
      // 추가로 파일에 내용 저장해서 생성되도록 처리
      // '파일이름' 저장되었습니다.
      // '350000' 이체되었습니다.
      
      PrintWriter pw = new PrintWriter(f2);
      pw.println(fileName + " 저장 되었습니다.");
      pw.println(args[0] + " 이체 되었습니다.");
      pw.flush();
      pw.close();
      
      // 이런식으로 여러정보를 생성해서 입력해두는 것이 로그 기록의 일종 ==> 감사자료...
      
//      System.out.println("returnValue : " + returnValue);
//      System.out.println("method : " + method.getName());
//      System.out.println("args : " + args[0]);
//      System.out.println("target : " + target.getClass().getName());
      
   }

}
