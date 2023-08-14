package com.myspring.books.manager;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManagerController {
	
	@Autowired
	ManagerDAO managerPro;
	
	
	@RequestMapping("/")
	public String index(HttpServletRequest request) {
		
		return "redirect:/managerMain.do";
		
		
	}
	
	@RequestMapping("/managerMain.do")
	public String managerMain(Model model) {
		
		model.addAttribute("type", new Integer(0));
		model.addAttribute("cont", "01_02_managerMain.jsp");
		
		
		return "00_index";
		
		
	}
	
	@RequestMapping("/managerLoginPro.do")
	public String managerLoginPro(Model model, HttpServletRequest request) {
		
		//넘어온 데이터 꺼내기
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		
		//DB랑 연동해서 사용자의 인증을 처리 
		int check = managerPro.userCheck(id,passwd);
		
		//해당 뷰(응답페이지)로 보낼 내용을 request속성에 지정
		request.setAttribute("check", new Integer(check));
		request.setAttribute("id", new Integer(id));
		
		model.addAttribute("cont", "01_03_managerLoginPro.jsp");
		
		
		return "00_index";
		
		
	}
	
	
	
	
	

}
