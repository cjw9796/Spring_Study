package com.kh.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

//컨트롤러 클래스에 	@RequestMapping 어노테이션을 붙여주면 컨트롤러에 붙여준 어노테이션과 메서드에 붙여준 합쳐서 
// 뷰 페이지를 호출해야된다. 

@RequestMapping("/board")
public class YourController {

	@RequestMapping("/contentView")
	public String model() {
		
		System.out.println("contentView 실행");
		
	
		
		return "board/contentView";
	}
	
	
	
}
