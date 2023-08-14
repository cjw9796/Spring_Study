package com.jw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// @WebSerlvet("/hello")
@Controller
public class HomeController {
	// 어떤 서블릿 즉 어떤 컨트롤러로 이동을 해야되는지 
	// request 요청을 하면 url : ""   method = get/post/put/...
	@RequestMapping("/hello")	
	public String hello() {
		System.out.println("hello 요청 ");
		
		//결과가 나오면 실행할 페이지의 명을 넘겨준다. 
		//실제 데이터가 넘어갈 수도 있다. 
		return "/WEB-INF/hello.jsp";
	}
	@RequestMapping("/hello2")	
	public void hello2() {
		System.out.println("hello2 요청 ");
	}
	@RequestMapping("/hello3")	
	public void hello3() {
		System.out.println("hello3 요청 ");
	}
	// url요청을 받아서 구별을 했으면 실제 서블릿들의 객체르 생성해서 실행 
	// web-inf -> spring -> root-context.xml 파일이 실행을 해준다.
	//                       이안에 설정을 해야된다. 객체를 실행하는 Bean
	
	// 위에 있는 내용까지만 설정을 하면 404페이지 오류가 뜬다 
	// 보여지는 뷰 페이지가 없기때문에 에러가 난다. 
	// 뷰가 가지고 있는 jsp파일명을 넘겨줘야된다.
	
	
	//만약 서블릿을 실행하고 나서 결과값을 저장하는 내용을 써야될 때 
	
	
	@RequestMapping("/hello5")
	public String hello5(Model model) {
		// 실제 데이터의 결과값들이 model 에서 넘어온다. 
		// model이라는 객체를 만들어서 실제 저장 
		// 예는 request.setAttr() 저장을 해서 뷰로 포워드 시켜준다. 
		model.addAttribute("name","홍길동");
		
		
		
		
		return;
	}
	
	
}