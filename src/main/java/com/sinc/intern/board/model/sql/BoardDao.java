package com.sinc.intern.board.model.sql;

import java.util.List;

public interface BoardDao {

	public List<Object> search(Object obj);
	public List<Object> listRow();
	public int registerRow(Object obj);
	public Object getDataRow(int seq);
	public int removeDataRow(int seq);
	public int updateDataRow(Object obj);
}
