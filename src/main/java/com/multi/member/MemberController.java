package com.multi.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class MemberController {
	
	@Autowired
	MemberServiceImpl service;

	@GetMapping("/")
	public String login() {
		return "login"; //WEB-INF/views/login.jsp
	}
	
	@GetMapping("/join")
	public String join() {
		return "join"; //WEB-INF/views/join.jsp
	}
	
	//회원가입버튼 눌렀을 때
	@PostMapping("/insert")
	public ModelAndView insertMember(@ModelAttribute(name ="dto") MemberDTO dto) {
		int result = service.insertMember(dto);
		
		//view result.jsp
		//result 데이터 전달
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("result",result);
		
		return mv;
	}
	
	//로그인 버튼 클릭 시
	@PostMapping("/login")
	public ModelAndView selectMember(@RequestParam(name = "memberId") String memberId, @RequestParam(name = "pw")String pw) {
		MemberDTO dto = service.selectMember(memberId, pw);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		mv.addObject("member",dto);
		
		return mv;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
