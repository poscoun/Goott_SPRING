package spring_aop03_before_after;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MethodBefore_Advice implements MethodBeforeAdvice{
   
   @Override
   public void before(Method method, Object[] args, Object target) throws Throwable {
      // TODO Auto-generated method stub
      System.out.println("----------------------------------------");
      System.out.println("메인 업무 메소드 실행 전에 호출된 공통 관심사 출력 부분");
      System.out.println("----------------------------------------");
   }

}