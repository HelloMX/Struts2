package com.jikexueyuan.action;

import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionSupport;

public class UsersAction extends ActionSupport {
	
	private String username;
	private String password;
	private String repassword;
	private String email;
	private String phone;
	private int age;
	
	
	
	@Override
	public String execute() throws Exception {
		
		return SUCCESS;
	}
	
	public void validateExecute(){
		
		if (null==username || username.length()<6 ||username.length()>10) {
			this.addFieldError("username", "username has error");
		}
		if (null==password || password.length()<6||password.length()>10) {
			this.addFieldError("password", "password has error");
		}else if (null==repassword || repassword.length()<6||repassword.length()>10) {
			this.addFieldError("repassword", "repassword has error");
		}else if(!password.equals(repassword)){
			this.addFieldError("password", "tow password is not be same");
		}
		
		if (age<=0 ||age>150) {
			this.addFieldError("age", "年龄不符合人类规范！");
		}
		//验证邮箱！ 123dsaw@163.com
		//只允许a-z A-Z 1-9 -_
		//正则表达式---专门用于复杂字符判断的技术。可以应用于所有软件编程语言
		Pattern p = Pattern.compile("^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(\\.([a-zA-Z0-9_-])+)+$");
		if (null==email || !p.matcher(email).matches()) {
			this.addFieldError("email", "邮箱验证失败！");
		}
		Pattern p1=Pattern.compile("^(((13[0-9])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8})|(0\\d{2}-\\d{7,8})|(0\\d{3}-\\d{7,8})$");
		if (null==phone || !p1.matcher(phone).matches()) {
			this.addFieldError("phone", "电话格式不正确!");
			this.addActionError("action级别错误！");
			//这些错误信息被默认放入struts2默认的栈队中。Map集合errors
		}
	}


	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getRepassword() {
		return repassword;
	}



	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}
	
}
