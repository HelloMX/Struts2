package com.jikexueyuan.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {
	
	private Date times;
	
	@Override
	public String execute() throws Exception {
		System.out.println(times.toLocaleString());
		return "success";
	}

	public Date getTimes() {
		return times;
	}

	public void setTimes(Date times) {
		this.times = times;
	}
	
	
	
}
