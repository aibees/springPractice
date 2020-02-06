package com.sinc.intern.user.ctrl;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sinc.intern.user.model.vo.UserDTO;
import com.sinc.intern.user.service.UserService;

@Controller
public class UserCtrl {
	
	@Resource(name="userS")
	private UserService service;
	
	@RequestMapping("/loginForm.do")
	public String loginForm() {
		System.out.println("loginForm");
		return "/user/login";
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(UserDTO dto, HttpSession session) {
		System.out.println("login post");
		Object user = service.login(dto);
		session.setAttribute("loginUser", user);
		return "redirect:/main.do"; 
	}
	
	@RequestMapping("/user/logout.do")
	public String logout(HttpSession session)
	{
		session.removeAttribute("loginUser");
		return "/user/login";
	}
//
//	@RequestMapping("/login.do")
//	public String login(UserDTO dto) {
//		System.out.println("ctrl login");
//		System.out.println("USER DTO : " + dto);
//		return "home";
//	}
//
//	// ctrl에서 void로 return 하는 경우 내부적으로 사용자가 치고 들어온 url(여기서는 logout)을 이름으로 생각하고 이에 대응하는 jsp(logout.jsp)를 찾는다.
//	@RequestMapping("/logout.do")
//	public void logout() {
//		return;
//		
//	}
//
//	// 객체와 view를 한번에 (정확히는 view에 데이터를 심어서) 보내는 방법으로는 ModelAndView 객체를 return값으로 하는 방법이 있다.
//	@RequestMapping("/join.do")	
//	public ModelAndView join(ModelAndView mv) {
//		mv.addObject("msg", "hi");
//		mv.setViewName("home");;
//		return mv;
//		
//	}
//
//	// 위에 세 가짖 방식 외에 다른 리턴 방식 -> async(ajax)통신을 하겠다는 의도.
//	// 가장 추천하는 방식
//	@RequestMapping("/search.do")	
//	public String search(Model model) {
//		System.out.println("ctrl search");
//		
//		model.addAttribute("msg", "just model 한글깨지는거 확인");
//		return "home";
//		
//	}
//	
//	@RequestMapping("ajax.do")
//	@ResponseBody
//	public UserVO ajax() {
//		System.out.println("ajax ctrl");
//		return new UserVO("aibees", "qkrqwe12", "pjs", 1000.0, "BS");
//	}
}
