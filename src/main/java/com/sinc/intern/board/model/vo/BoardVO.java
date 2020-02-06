package com.sinc.intern.board.model.vo;

public class BoardVO {
	private int seq;
	private int viewcnt;
	private String title;
	private String content;
	private String writer;
	private String regdate;
	
	public BoardVO() {
		// TODO Auto-generated constructor stub
	}

	public BoardVO(int seq, int viewcnt, String title, String content, String writer, String regdate) {
		super();
		this.seq = seq;
		this.viewcnt = viewcnt;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regdate = regdate;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public int getViewcnt() {
		return viewcnt;
	}

	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "BoardVO [seq=" + seq + ", viewcnt=" + viewcnt + ", title=" + title + ", content=" + content
				+ ", writer=" + writer + ", regdate=" + regdate + "]";
	}
}
