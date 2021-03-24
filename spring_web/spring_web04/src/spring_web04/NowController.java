package spring_web04;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class NowController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdd - HH:mm:ss");
		
		return new ModelAndView("hello", "time", sdf.format(d));
	}

}
