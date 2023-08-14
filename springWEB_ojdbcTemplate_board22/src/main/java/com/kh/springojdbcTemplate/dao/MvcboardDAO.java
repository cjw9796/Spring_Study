package com.kh.springojdbcTemplate.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.kh.springojdbcTemplate_board.Constant;
import com.kh.springojdbcTemplate_board.HomeController;
import com.kh.springojdbcTemplate_board.vo.MvcboardVO;

public class MvcboardDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(MvcboardDAO.class);

	//JdbcTemplate 설정 
	private JdbcTemplate template;
	
	// DAO 클래스의 bean이 기본 생성자로 생성되는 순간 servlet-context.xml
	// 파일에서 생성되서 컨트롤러가 전달받아 Constant 클래스의 JdbcTemplate 클래스 타입의 
	// static 객체에 저장한 bean 으로 초기화 시킨다. 
	
	public MvcboardDAO() {
		template = Constant.template;
	}
	
	// 밑에 있는 DBCP 방식을 사용하는 객체를 초기화하는 부분이므로 JdbcTemplate 으로 코드 변환이 완료되면 모두 주석처리 가능하다. 
	
	//insert, delete, update sql 명령을 실행하는 메서드의 인수로 넘어온 데이터가 중간에 변경되면 안되기 때문에 
	//JdbcTemplate에서는 insert,delete, update sql 명령을 실행하는 메서드의 인수를 선언할 때 final 을 붙여서 넘어온 데이터를 수정할 수 없도록 
	//선언해야 한다. 
	
	public void insert(final MvcboardVO mvcboardVO) {
		
		logger.info("insert()");
		
		String sql = "insert into mvcboard(idx,name,subject,content,gup,lev,seq)"+
		"values(mvcboard_idx_seq.nextval, ?,?,?, mvcboard_idx_seq.currval, 0,0) ";
		
		template.update(sql, new PreparedStatementSetter() {
			//PreparedStatementSetter 인터페이스 객체를 익명으로 구현하는 setValues() 추상메서드가 
			// 자동으로 override되고 여기서 "?"를 채운다.
			
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				ps.setString(1, mvcboardVO.getName());
				ps.setString(2, mvcboardVO.getSubject());
				ps.setString(3, mvcboardVO.getContent());
				
			}
		});
		
	}
	
	
	
}
