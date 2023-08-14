package com.myspring.kurly.cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.kh.springmember.Member;

public class CartDAO {
	
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
	
	public ArrayList<CartDTO cart> getorderList() {

		ArrayList<cart_number> CartList = new ArrayList<cart_number>();

		// 명령문 쓰고 데이터 가지고 오는 sql 구문을 작성
		// 하나씩 ArrayList에 add();

		try {
			// sql 명령문 작성하고 id, pw넘기기
			conn = dataSource.getConnection();
			String sql = "SELECT * FROM item order by item_number asc";

			pstmt = conn.prepareStatement(sql);

			// executeQuery()
			rs = pstmt.executeQuery();

			while (rs.next()) {
				
				CartDTO cart = new cart();
				cart.setNum(rs.getInt(1));
				cart.setBuyer(rs.getString(2));
				cart.setItem_name(rs.getString(3));
				cart.setBuy_price(rs.getInt(4));
				cart.setBuy_count(rs.getInt(5));
				
				
				
				
				
				
				Member member = new Member();

				member.setNum(rs.getInt(1));
				member.setId(rs.getString(2));
				member.setPw(rs.getString(3));
				member.setEmail(rs.getString(4));

				memberList.add(member);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			finallyClose();
		}

		return memberList;
	}
	
	
	
	
	
	
	
	

}
