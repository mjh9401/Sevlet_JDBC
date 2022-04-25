package com.sevlet.dto;

public class Member {
	private int idx;
	private String name;
	private String address;
	private String email;
	private String tel;
	
	public Member(int idx,String name,String address,String email,String tel) {
		this.idx = idx;
		this.name = name;
		this.address = address;
		this.email = email;
		this.tel = tel;
	}
	
	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	
}
