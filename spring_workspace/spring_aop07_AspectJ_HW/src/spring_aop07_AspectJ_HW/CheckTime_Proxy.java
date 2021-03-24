package spring_aop07_AspectJ_HW;

import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.apache.bcel.classfile.Field;
import org.springframework.util.StopWatch;

public class CheckTime_Proxy implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd - hh:mm:ss");
		
		String usedTime = sdf.format(d);
		
		String pathName = "C:\\Users\\goott\\Downloads\\log\\weapon1.txt";
		
		StopWatch sw = new StopWatch();
		
		sw.start();
		
		Object obj = invocation.proceed();
		
		sw.stop();
		
		double actingTime = sw.getTotalTimeSeconds();
		
		File f = new File(pathName);
		
		if(!f.exists()) {
			f.createNewFile();
		}
		
		PrintWriter pw = new PrintWriter(f);
		pw.println("무기 사용 시각 : " + usedTime);
		pw.println("무기 수행 시간 : " + actingTime);
		pw.flush();
		pw.close();

		return obj;
	}

}

