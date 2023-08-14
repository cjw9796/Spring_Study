package com.myspring.kurly.item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;


public class ItemDAO {
	
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
	
	public void insertItem(ItemDTO item) {
		// 데이터베이스 연결 getConnect()
		try {

			conn = dataSource.getConnection();

			String sql = "INSERT INTO item (item_category,item_name,item_price,item_stock,item_info,discount_rate,reg_date,sold) VALUES(?,?,?,?,?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, item.getItem_category());
			pstmt.setString(2, item.getItem_name());
			pstmt.setString(3, item.getItem_price());
			pstmt.setString(4, item.getItem_stock());
			pstmt.setString(5, item.getItem_info());
			pstmt.setString(6, item.getDiscount_rate());
			pstmt.setString(7, item.getReg_date());
			pstmt.setString(8, item.getSold());
				
			pstmt.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			finallyClose();
		}

	}
	
	public void updateItem(ItemDTO item) {
		
		try {
			// sql 명령문 작성하고 id, pw넘기기
			conn = dataSource.getConnection();
			String sql = "UPDATE MEMBER SET getItem_category=?, getItem_name=?, getItem_price=?, getItem_stock=?, getItem_info=?, getDiscount_rate=?, getReg_date=?, getSold=?  WHERE item_number=?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, item.getItem_category());
			pstmt.setString(2, item.getItem_name());
			pstmt.setString(3, item.getItem_price());
			pstmt.setString(4, item.getItem_stock());
			pstmt.setString(5, item.getItem_info());
			pstmt.setString(6, item.getDiscount_rate());
			pstmt.setString(7, item.getReg_date());
			pstmt.setString(8, item.getSold());
				
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			finallyClose();
		}

		return member;
	}
		
		
	}
	
	
	

}
