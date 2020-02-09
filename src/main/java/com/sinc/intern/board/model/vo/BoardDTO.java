package com.sinc.intern.board.model.vo;

public class BoardDTO {
	private String title;
	private String content;
	private String writer;
	
	public BoardDTO() {
		// TODO Auto-generated constructor stub
	}

	public BoardDTO(String title, String content, String writer) {
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
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

	@Override
	public String toString() {
		return "BoardDTO [title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
}
