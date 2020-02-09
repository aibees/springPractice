package com.sinc.intern.board.service;

import java.util.List;

import com.sinc.intern.board.model.vo.BoardVO;

public interface BoardService {
	public List<Object> getList();
	
	public int registerBoard(Object obj);
	
	public Object getData(int seq);
	
	public int removeData(int seq);
	
	public int modifyData(Object obj);
	
	public List<Object> searchData(Object obj);
}
