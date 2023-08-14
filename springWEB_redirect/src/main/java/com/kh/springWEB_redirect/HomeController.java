package com.kh.springWEB_redirect;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	

	@RequestMapping("/confirm")
	public String confirm(HttpServletRequest request,Model model) {
		
		logger.info("confirm()");
		String id = request.getParameter("id");
		
		logger.info("id :{}",id);
		model.addAttribute("id",id);
		
		// id가 "abc"면 idOK.jsp를 브라우저에 표시하고 "abc"가 아니면 idNG.jsp를 
		// 브라우저에 표시한다.
		if(id.trim().equals("abc")) {
			
			// 컨트롤러에 새로운 요청을 해서 연결하는 것! 
			// redirect: 를 붙여서 "/WEB-INF/views" 폴더의 confirmOK.jsp를 
			// 호출하는 것이 아니라 컨트롤러의 @RequestMapping("/confirmOK")
			// 어노테이션이 붙어있는 메서드를 호출한다. 
			return "redirect:confirmOK";			
		}else {
		
			return "idNG";
		}
	}	
	
	
	@RequestMapping("/confirmOK")
	public String confirmOK(HttpServletRequest request,Model model) {
		
		logger.info("confirmOK()");
		String id = request.getParameter("id");
		
		logger.info("id :{}",id);
		model.addAttribute("id",id);
		
		return "idOK";				
	}	
}