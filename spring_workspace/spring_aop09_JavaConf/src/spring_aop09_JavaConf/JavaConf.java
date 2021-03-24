package spring_aop09_JavaConf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

// 스프링 컨테이너에 bean 등록을 하기 위한 방법을 xml 대신 자바 객체가 그 역할을 수행

@Configuration
@EnableAspectJAutoProxy
public class JavaConf {
	
	@Bean(name = "cs")
	public CustomerServiceImple cs() {
		CustomerServiceImple csi = new CustomerServiceImple();
		csi.setName("윤동주");
		csi.setEmail("poscoun@naver.com");
		
		return csi;
	}
	
	@Bean
	public CheckTime ct() {
		CheckTime ckt = new CheckTime();
		ckt.publicPointcut();
		
		return ckt;
	}
	
}
