package com.dzkj.entity;

public class Person {
//	 p_id number primary key,
//     p_name varchar2(20),
//     p_sex varchar2(2),
//     p_age number,
//     p_address varchar2(200)
	
	private int pid;
	private String pname;
	private String psex;
	private int page;
	private String paddress;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPsex() {
		return psex;
	}
	public void setPsex(String psex) {
		this.psex = psex;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	public Person(int pid, String pname, String psex, int page, String paddress) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.psex = psex;
		this.page = page;
		this.paddress = paddress;
	}
	public Person() {
		super();
	}
	
	

}
