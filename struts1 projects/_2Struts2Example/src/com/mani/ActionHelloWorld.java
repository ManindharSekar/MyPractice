package com.mani;

public class ActionHelloWorld {
	private String name;
	
	public String execute(){
		System.out.println("inside execute");
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
