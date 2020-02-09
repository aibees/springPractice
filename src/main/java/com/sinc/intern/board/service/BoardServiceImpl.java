package com.sinc.intern.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sinc.intern.board.model.sql.BoardDao;
import com.sinc.intern.board.model.vo.BoardVO;

@Service("boardS")
public class BoardServiceImpl implements BoardService {

	@Resource(name="boardD")
	private BoardDao dao;
	
	@Override
	public int registerBoard(Object obj) {
		return dao.registerRow(obj);
	}

	@Override
	public Object getData(int seq) {
		return dao.getDataRow(seq);
	}
	
	@Override
	public int removeData(int seq) {
		return dao.removeDataRow(seq);
	}

	@Override
	public int modifyData(Object obj) {
		return dao.updateDataRow(obj);
	}

	@Override
	public List<Object> getList() {
		// TODO Auto-generated method stub
		return dao.listRow();
	}

	@Override
	public List<Object> searchData(Object obj) {
		List<Object> tmp = dao.search(obj);
		System.out.println("search data");
		System.out.println(tmp);
		return tmp;
	}

}
