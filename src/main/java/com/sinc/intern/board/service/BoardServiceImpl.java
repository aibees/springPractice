package com.sinc.intern.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sinc.intern.board.model.sql.BoardDao;

@Service("boardS")
public class BoardServiceImpl implements BoardService {

	@Resource(name="boardD")
	private BoardDao dao;
	
	@Override
	public List<Object> getList() {
		System.out.println("board service");
		return dao.listRow();
	}

}
