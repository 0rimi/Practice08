package com.javaex.ex08;

public class Friend {
	
	private String name;
	private String ph;
	private String school;
	
	
	public Friend() {}
	public Friend(String name, String ph, String school) {
		super();
		this.name = name;
		this.ph = ph;
		this.school = school;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	
	
	public void showinfo() {
		System.out.println("이름 : "+name+"\t"
				+"핸드폰 : "+ph+"\t"
				+"학교 : "+school);
	}
	
	

}
