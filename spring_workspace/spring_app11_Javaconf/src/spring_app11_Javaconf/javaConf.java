package spring_app11_Javaconf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// xml을 이용해서 설정할 수 도 있지만 자바 객체로 spring bean에 대한 설정을 할 수 있다.

@Configuration
public class javaConf {

/*<bean id="sender" class="spring_app11_Javaconf.Sender"></bean>*/
		
	@Bean
	public Sender sender() {
		return new Sender();
	}
	   
	   
//<bean id="sm" class="spring_app11_Javaconf.SystemMonitor">
//  	<property name="sender" ref="sender" />
//</bean>
	
	@Bean(name = "sm")
	public SystemMonitor systemMonitor() {
		SystemMonitor sm = new SystemMonitor();
		sm.setSender(sender());
		return sm;	
	}

}
