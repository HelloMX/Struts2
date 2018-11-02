package com.jikexueyuan.action;

import com.jikexueyuan.bean.Users;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	private Users user;
	
	
	@Override
	public String execute() throws Exception {
		
		return SUCCESS;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
	
}
