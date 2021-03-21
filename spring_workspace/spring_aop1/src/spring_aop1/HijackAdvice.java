package spring_aop1;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

// 이 객체를 현재 업무 호출 전에 실행
public class HijackAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		
		//advice : 끼어들어서 작업하는 것
		System.out.println("공통된 관신 업무를 지정");
		System.out.println("메인업무가 실행되기 전에 가로채기");
		
	}
	

}
