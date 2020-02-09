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
	
	public int upCnt(int seq) {
		return session.update(PREFIX + ".upCnt", seq);
	}
	
	@Override
	public List<Object> listRow() {
		System.out.println("board dao");
		List<Object> result = session.selectList(PREFIX + ".list");
		return result;
	}

	@Override
	public int registerRow(Object obj) {
		return session.insert(PREFIX + ".register", obj);
	}

	@Override
	public Object getDataRow(int seq) {
		int upCntFlag = upCnt(seq);
		return session.selectOne(PREFIX + ".detail", seq);
	}

	@Override
	public int removeDataRow(int seq) {
		return session.delete(PREFIX + ".remove", seq);
	}

	@Override
	public int updateDataRow(Object obj) {
		return session.update(PREFIX + ".modify", obj);
	}

	@Override
	public List<Object> search(Object obj) {
		System.out.println("search dao");
		List<Object> t = session.selectList(PREFIX + ".search", obj);
		System.out.println(t);
		return t;
	}
}
