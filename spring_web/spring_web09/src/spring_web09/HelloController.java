package spring_web09;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	
	@RequestMapping(value = "/hello1.do")
	public ModelAndView hello(HttpServletRequest req) {
		String data = req.getParameter("mav");	// mav라는 이름으로 데이터를 보냄
		
		return new ModelAndView("hello1", "msg1", data);
	}
	
	// 모델2 방식
	@RequestMapping(value = "hello2.do")
	public String prt(HttpServletRequest req) {
		String data = req.getParameter("req");	// req라는 이름으로 데이터를 보냄
		
		req.setAttribute("msg2", data);
		
		return "hello2";		// hello2라는 뷰로 나감
	}
}
