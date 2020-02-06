package com.sinc.intern.user.model.vo;

public class UserVO {
	private String id;
	private String pwd;
	private String name;
	private int point;
	private String dept;
	private String imgSrc;
	
	public UserVO() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getImgSrc() {
		return imgSrc;
	}

	public void setImgSrc(String imgsrc) {
		this.imgSrc = imgsrc;
	}
	
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", point=" + point + ", dept=" + dept
				+ ", imgSrc=" + imgSrc + "]";
	}

	public UserVO(String id, String pwd, String name, int point, String dept, String imgsrc) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.point = point;
		this.dept = dept;
		this.imgSrc = imgsrc;
	}
	
}
