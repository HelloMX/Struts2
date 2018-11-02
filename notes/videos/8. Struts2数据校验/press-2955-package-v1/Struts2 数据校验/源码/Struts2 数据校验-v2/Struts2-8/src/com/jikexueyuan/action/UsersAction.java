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
			this.addFieldError("age", "���䲻��������淶��");
		}
		//��֤���䣡 123dsaw@163.com
		//ֻ����a-z A-Z 1-9 -_
		//������ʽ---ר�����ڸ����ַ��жϵļ���������Ӧ������������������
		Pattern p = Pattern.compile("^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(\\.([a-zA-Z0-9_-])+)+$");
		if (null==email || !p.matcher(email).matches()) {
			this.addFieldError("email", "������֤ʧ�ܣ�");
		}
		Pattern p1=Pattern.compile("^(((13[0-9])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8})|(0\\d{2}-\\d{7,8})|(0\\d{3}-\\d{7,8})$");
		if (null==phone || !p1.matcher(phone).matches()) {
			this.addFieldError("phone", "�绰��ʽ����ȷ!");
			this.addActionError("action�������");
			//��Щ������Ϣ��Ĭ�Ϸ���struts2Ĭ�ϵ�ջ���С�Map����errors
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
