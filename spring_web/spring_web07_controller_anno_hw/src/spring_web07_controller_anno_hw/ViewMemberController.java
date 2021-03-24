package spring_web07_controller_anno_hw;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewMemberController {

   @RequestMapping(value="viewData.do")
   public ModelAndView show(HttpServletRequest req) {
      return new ModelAndView("view", "message1", req.getParameter("message"));
   }
   
   @RequestMapping(value="viewData2.do")
   public String show2(HttpServletRequest req) {
      req.setAttribute("message2", req.getParameter("message"));
      return "view";
   }
}