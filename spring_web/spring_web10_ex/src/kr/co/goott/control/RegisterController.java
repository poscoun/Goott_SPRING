package kr.co.goott.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.goott.dto.MemberDTO;

@Controller
public class RegisterController {

	@RequestMapping(value = "/register/step1.do")
	public String processStep1() {
		return "step1";
	}
	
	@RequestMapping(value = "/register/step2.do")
	// 동의를 받아서 넘겨야 함
	public String processStep2(HttpServletRequest req) {
		
		// 파라미터 값은 name 값
		String ck = req.getParameter("ck");
	
		if(ck==null) { 
			return "step1"; 
		}else { 
			return "step2"; 
		}
		 
//		return "step2";
	}
/*	
	@RequestMapping(value = "/register/step3.do")
	public String processStep3(
			
			// 기존 방식 (Annotation @RequestParam으로 간단하게 변경 가능)
			//String id = req.getParameter("id");
			//String pwd = req.getParameter("pwd");
			//String confirm = req.getParameter("confirm");
			//String email = req.getParameter("email");
			
			// 유효성 검사 가능
			//@RequestParam(value = "no", defaultValue = 0)int no,  // 형변환을 쉽게 해줌
			@RequestParam(value = "id", defaultValue = "aaa", required = true)String id, 
			@RequestParam(value = "pwd")String pwd, 
			@RequestParam(value = "confirm")String confirm, 
			@RequestParam(value = "email")String email,
			// 받은 데이터 전달 가능
			Model model) {
		
			MemberDTO dto = new MemberDTO();
			dto.setId(id);
			dto.setPwd(pwd);
			dto.setConfirm(confirm);
			dto.setEmail(email);
	
		// 사용자가 입력한 정보를 db에 등록
		// MysqlDAO dao = new MysqlDAO();
		// dao.insertOne(dto);
			
		model.addAttribute("dto", dto);
		
		return "welcome";
	}
*/
	
	// 위 코드를 간단하게 쓴 것
	@RequestMapping(value = "register/step3.do")
	public String processStep3(@ModelAttribute() MemberDTO dto, Model model) {
		
		model.addAttribute("dto", dto);
		
		return "welcome";
	}
	
	@RequestMapping(value = "/main")
	public String processStep4() {
		return "main";
	}
}
