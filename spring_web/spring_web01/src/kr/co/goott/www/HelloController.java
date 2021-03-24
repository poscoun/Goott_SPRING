package kr.co.goott.www;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller{

   @Override
   public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
      // TODO Auto-generated method stub
      // ModelAndView : Model + View
      // Model : 전달할 데이터 
      // View : 찾아갈 주소(파일) 이름
      
      ModelAndView mav = new ModelAndView();
      
      //mav.addObject(속성이름(변수), 속성값(데이터))
      mav.addObject("msg", "Hello Spring WebMVC World");
      mav.setViewName("hello");
      
      return mav;
   }
   
}