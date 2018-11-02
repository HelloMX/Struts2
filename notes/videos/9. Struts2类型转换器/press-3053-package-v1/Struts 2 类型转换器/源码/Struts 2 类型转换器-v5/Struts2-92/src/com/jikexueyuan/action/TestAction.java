package com.jikexueyuan.action;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.jikexueyuan.bean.Position;
import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport{
	Position po;
	@Override
	public String execute() throws Exception {
		
		System.out.println("x坐标为:"+po.getX()+"y坐标为："+po.getY());
		ServletActionContext.getRequest().setAttribute("po", po);
		
		return SUCCESS;
	}
	public Position getPo() {
		return po;
	}
	public void setPo(Position po) {
		this.po = po;
	}
	
	
}
