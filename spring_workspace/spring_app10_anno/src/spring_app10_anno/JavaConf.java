package spring_app10_anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConf {
	
	public PhoneOS phoneOs() {
		PhoneOS po = new PhoneOS();
		po.setName("아이폰12");
		po.setVersion("ios 14");
		return po;
	}
	
	@Bean(name = "p")
	public SmartPhone smartPhone() {
		SmartPhone sp = new SmartPhone();
		sp.setOs(phoneOs());
		return sp;
	}
}
