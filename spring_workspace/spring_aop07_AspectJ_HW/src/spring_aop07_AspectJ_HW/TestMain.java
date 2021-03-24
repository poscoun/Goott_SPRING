package spring_aop07_AspectJ_HW;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
            + spring_aop07_AspectJ_HW
-----------------------------------------------------------
1. CheckTime_Proxy advice : 출력 : 무기 사용 시각, 무기 수행 시간
2. CheckTime_AspectJ advice : 출력 : 무기 사용 시각, 무기 수행 시간
3. 출력 위치 : C:\Users\goott7\Downloads\log\weapon1.txt
			 C:\Users\goott7\Downloads\log\weapon2.txt
*/

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("app.xml");
		
		// Proxy advice
		/* Weapon w = ctx.getBean("proxyBean", Weapon.class); */
		
		// AspectJ advice
		Weapon w = ctx.getBean("biz", Weapon.class);
		
		w.fire();
	}
}
