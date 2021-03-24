package spring_web03;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class NowController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdd - HH:mm:ss");
		
		String time = sdf.format(d);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("time", time);
		mav.setViewName("now");
		
		return mav;
	}

}
