package com.myspring.kurly.buy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

public class BuyDAO {
	
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

}
