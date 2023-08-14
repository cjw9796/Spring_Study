package com.myspring.kurly.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.kh.springmember.Member;

public class ManagerDAO {

	@Autowired
	DataSource dataSource; 
	
	// JDBC 연결
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	public void finallyClose() {
		try {
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public int checkManager(ManagerDTO manager) {
		int check = -1;

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			// sql 명령문 작성하고 id, pw넘기기
			conn = dataSource.getConnection();
			String sql = "SELECT COUNT(*) AS cnt FROM manager WHERE ID = ? AND PW = ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, manager.getId());
			pstmt.setString(2, manager.getPw());

			// executeQuery()
			rs = pstmt.executeQuery();

			if (rs.next()) {
				int count = rs.getInt("cnt");

				// 회원 정보가 일치하는 경우 (로그인 성공)
				if (count == 1) {
					check = 1;
				} else {
					// 회원 정보가 일치하지 않는 경우 (로그인 실패)
					check = 0;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			finallyClose();
		}

		return check;
	}
}
