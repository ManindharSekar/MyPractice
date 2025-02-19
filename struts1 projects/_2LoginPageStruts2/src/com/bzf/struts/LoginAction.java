package com.bzf.struts;

public class LoginAction {
	
	private String userId;
	private String password;
	
	public String execute(){
		if(getUserId().equals("user")&&getPassword().equals("password")){
			return "success";
		}
			return "failure";
		
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
