package spring_web08_db;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DaoController {
	
	@RequestMapping(value = "list.do")
	public ModelAndView show() {
		// db model
		
		return new ModelAndView("list", "list", "db에서 넘어온 전체 조회 수행 객체"	);
	}
	
	@RequestMapping(value = "view.do")
	public String view(HttpServletRequest req) {
		String no = req.getParameter("no");
//		int deptno = Integer.parseInt(no);
		
		// dao 호출 - dao.select(deptno); = dto로 리턴
		req.setAttribute("dataOne", "no");
		
		return "view";
	}
	
	@RequestMapping(value = "insert.do")
	public String insert() {
		// dto 호출
		// dto set
		
		return "insertData";
	}
}
