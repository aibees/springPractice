package com.sinc.intern.board.model.sql;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository("boardD")
public class BoardDaoImpl implements BoardDao {
	public static final String PREFIX = "com.sinc.intern.board";

	@Resource(name="sqlSession")
	private SqlSession session;
	
	@Override
	public List<Object> listRow() {
		
		System.out.println("board dao");
		List<Object> result = session.selectList(PREFIX + ".list");
		return result;
	}
}
