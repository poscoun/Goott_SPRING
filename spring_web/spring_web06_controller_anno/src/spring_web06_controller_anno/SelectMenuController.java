package spring_web06_controller_anno;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// Controller 인터페이스를 상속받은 이전의 방식은 한 클래스에서 한가지 일(한 페이지 지정) 밖에 못하고 있음
// 그러므로 프로젝트가 커지면 Controller가 많이 ㅣㄹ요해지는 단점이 생김

// 이러한 단점을 보완하기 위해 annotation을 사용하고 있음

@Controller
public class SelectMenuController {
	
	@RequestMapping(value = "selectMenu.do")
	public ModelAndView aaa() {
		return new ModelAndView("menu", "test", "아무거나");
	}
	
	@RequestMapping(value = "data.do")
	public ModelAndView bbb() {
		return new ModelAndView("menu", "test2", "이것저것");
	}
	
}
