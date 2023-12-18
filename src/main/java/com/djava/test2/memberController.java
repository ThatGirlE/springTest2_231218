package com.djava.test2;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class memberController {
	
	@RequestMapping(value = "/login")
	public String login() {
		
		return "login";
	}
	@RequestMapping(value="/loginOk")
	public String loginOk(HttpServletRequest request, Model model) {//request가 자동완성 되지 않는 이유 : jsp가 아니고 java기 때문에 내장객체가 없음 선언을 해줘야됨(httpservletrequest)
		
//		try {
//			request.setCharacterEncoding("utf-8");
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}  
		
		String mid = request.getParameter("memberid");
		String mpw = request.getParameter("memberpw");
		
		model.addAttribute("memberId", mid);
		model.addAttribute("memberPw", mpw);
		
		
		
		return "loginSuccess";
	}
	
	@RequestMapping(value = "/loginOk2")
	public String loginOk2(@RequestParam("memberid") String mid, @RequestParam("memberpw") String mpw, Model model) { // 주로 하나일때 씀
		
		
		model.addAttribute("memberId", mid);
		model.addAttribute("memberPw", mpw);
		
		return "loginSuccess";
	}
	@RequestMapping(value="/join")
	public String join() {
			
		
		return "join";
	}
	@RequestMapping(value="/join2")
	public String join2() {
			
		
		return "join2";
	}
	@RequestMapping(value="/joinOk")  // 그릇을 4개 담아서 보낸다? 데이터객체
	//get
	public String joinOk(JoinMember joinMember) {
		
		//joinMember.get
		
		return "joinOk";
	}
	@RequestMapping(value="/joinOk2", method = RequestMethod.POST)  // 그릇을 4개 담아서 보낸다? 데이터객체 // 405 오류 때문에 post는 명시하는게 좋음
	//post
	public String joinOk2(@ModelAttribute("jmem") JoinMember joinMember) {  // 데이터 객체의 이름을 변경
		
		//joinMember.get
		
		return "joinOk2";
	}
	@RequestMapping(value="/memberNum/{memberNumber}")  
	public String memberNum(@PathVariable String memberNumber, Model model) {
		
		model.addAttribute("memberNumber", memberNumber);
		
		return "memberNumOk";
	}
	
}
