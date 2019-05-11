package com.test;

public class Student {
	
	private String firstName;
	private String lastName;
	private int age;
	private String className;
	
	public Student(String fname,String lname,int age,String className) {
		this.firstName = fname;
		this.lastName=lname;
		this.age = age;
		this.className=className;
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer();
		s.append(firstName+":"+lastName+":"+age+":"+className);
		return s.toString();
	}

}
