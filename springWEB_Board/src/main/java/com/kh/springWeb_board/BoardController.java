package com.kh.springWeb_board;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {

	@Autowired
	BoardDAO dao;

	@ModelAttribute("cp")
	public String getContextPath(HttpServletRequest request) {

		return request.getContextPath(); // springWEB_Board

	}

	@RequestMapping(value="/board/boardList")
	public String boardList(HttpServletRequest request, Model model) {
		System.out.println("=====boardList()=====");
		
		int currentPage = 1; 
		int pageSize = 3;
		
		
		if(request.getParameter("pageNum") != null) {
			currentPage = Integer.parseInt(request.getParameter(""));
		}
		
		//게시글의 개수를 가지고 오는 DB 연결
		
		int count = dao.getAllCount();
		
		//글의 시작 번호를 알려줘야된다. 
		int startRow = (currentPage -1) * pageSize;
		
		// 오라클은 끝나는 번호를 넘겨주고 
		// mysql 페이지의 사이즈 
		ArrayList<Board> boardList = dao.getAllBoard(startRow, pageSize);
			
			int number = 0;
			int clickablePageCount = 5;
			int pageCount = count / pageSize + (count % pageSize == 0? 0:1); //총 페이지 수를 계산하는 명령문 60 / 5 = 12페이지
			int startPage = 0;
			int endPage = 0; 
			
			
			
			
			model.addAttribute("boardList", boardList);
			model.addAttribute("currentPage", currentPage);
			model.addAttribute("pageSize", pageSize);
			model.addAttribute("startPage", startPage);
			model.addAttribute("endPage", endPage);
			model.addAttribute("pageCount", pageCount);
			
			
			
			
		}

	return"board/boardList"; // 뷰 페이지 연결

	}

	@RequestMapping(value="/board/boardInfo")
	public String boardInfo(HttpServletRequest request, Board board) {
		System.out.println("=====boardInfo()=====");
		
		return "board/boardInfo"; //뷰 페이지 연결 
	}

	@RequestMapping(value="/board/boardWriteForm")
	public String boardWriteForm() {
		
		//글쓰기로 넘어가는 뷰로 연결만 해주면 된다.
		System.out.println("=====boardWriteForm()=====");
		return "board/boardWriteForm"; //뷰 페이지 연결 
	}

	@RequestMapping(value = "/board/boardWritePro", method = RequestMethod.POST)
	public String boardWritePro(HttpServletRequest request, Board board) {

		// 스프링이 자동으로 매핑을 시켜준다. 필드명하고 board클래스의 필드명이 꼭 맞아야 실행된다.
		dao.insertBoard(board);
		model.addAttribute("board", board);

		return "redirect:/board/boardList";

		// 글쓰기로 넘어가는 뷰로 연결만 해주면 된다.
		System.out.println("=====boardWriteForm()=====");
		return "board/boardWriteForm"; // 뷰 페이지 연결
	}

	@RequestMapping(value = "/board/reWriteForm")
	public String reWriteForm(HttpServletRequest request, Board board) {
		System.out.println("=====reWriteForm()=====");

		// 글번호. 답글 다는 글 번호를 꺼내온다.
		int num = Integer.parseInt(request.getParameter("num"));

		// 글의 정보를 가지고 와서 그 글의 번호 (그룹 , 댓글, 대댓글 구별하는 변수들)
		// ref 글 그룹번호 , step 댓글번호, level 들여쓰기
		Board board = dao.getOneBoard(num);

		model.addAttribute("ref", board.getRef());
		model.addAttribute("re_step", board.getRe_step());
		model.addAttribute("re_level", board.getRe_level);

		return "board/reWriteForm"; // 뷰 페이지 연결
	}

}
