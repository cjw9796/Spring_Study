package com.kh.springojdbcTemplate.service;

import org.springframework.ui.Model;

import com.kh.springojdbcTemplate_board.vo.MvcboardVO;

public interface MvcboardService {
	
		public abstract void execute(MvcboardVO mvcboardvo);
		public abstract void execute(Model model);

}
