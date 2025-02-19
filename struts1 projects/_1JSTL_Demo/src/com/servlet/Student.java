package com.servlet;

public class Student {
	
	int rollNum;
	String name;
	Student(int rollNum,String name){
		this.rollNum=rollNum;
		this.name=name;
	}
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", name=" + name + "]";
	}
	

}
