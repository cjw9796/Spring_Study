package com.kh.springweb;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//클라이언트로부터 서비스 요청이 들어왔을 때 컨트롤러로 진입하고 컨트롤러는 요청에 따른 작업을 실행한 후 뷰 페이지로 데이터를 전달한다. 
//컨트롤러 제작 순서 
//1. base-package로 지정된 패키지에 임의의 이름으로 클래스를 만들고
// @Controller 어노테이션을 붙여서 컨트롤러로 사용할 클래스임을 스프링에 알려준다. 
//2. @RequestMapping 어노테이션의 인수로 클라이언트에서 넘어오는 처리할 요청을 지정한다. 
//3. 요청을 처리할 임의의 이름으로 메서드를 만든다. 
// => 뷰 페이지 이름은 문자열이므로 메서드의 리턴타입은 항상 spring이다! 
// Data 타입에 맞게 변할 수 있다! 
//4. value 속성은 생략이 가능하다. 지정된 내용과 주소창에 요청된 내용이 같은 @RequestMapping 자동으로 실행된다. 
//5. method 설정이 잘 못되어있는 경우 405에러가 뜬다. 
//6. method를 생략한다. 그러면 get, post등 모든 요청을 구별하지 않고 다 받는다. 



/**
 * Handles requests for the application home page.
 */


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
