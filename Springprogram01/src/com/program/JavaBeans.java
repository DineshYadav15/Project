package com.program;

public class JavaBeans
{
	private String name;
	private int rollno;
	private String email;
	public String getName() {
		return name;
	}
	public int getRollno() {
		return rollno;
	}
	public String getEmail() {
		return email;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display()
	{
		System.out.println("Name : " + name);
		System.out.println("Rollno : " + rollno);

		System.out.println("Email : " + email);

	}
}
