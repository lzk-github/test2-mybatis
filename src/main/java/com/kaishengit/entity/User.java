package com.kaishengit.entity;

public class User {

	private Integer id;
	private String userName;
	private String password;
	private String address;
	private Integer deptId;
	private Dept dept;

	public User() {
	}

	public User(String userName, String password, String address, Integer deptId) {
		this.userName = userName;
		this.password = password;
		this.address = address;
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", address=" + address
				+ ", deptId=" + deptId + ", dept=" + dept + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}
}
