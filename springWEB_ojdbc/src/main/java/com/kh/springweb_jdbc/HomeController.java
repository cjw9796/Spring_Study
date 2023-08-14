package com.kh.springweb_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired //
	DataSource dataSource;

	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		try {
			conn = dataSource.getConnection();

			// 본인이름 5등입니다.

			String sql = "select count(*) from MVCBOARD";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				System.out.println(rs.getInt(1));
			}

			if (conn != null) {
				System.out.println("연결 성공");
			}

		} catch (Exception e) {
			System.out.println("연결에러!");
			// System.out.println(e.printStackTrace());

			e.printStackTrace();
		}

		return "home";
	}

}
