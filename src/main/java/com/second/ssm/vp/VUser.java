package com.second.ssm.vp;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class VUser {
	private Integer userid;

    private String username;

    private String sex;

    private String account;

    private String password;

    private String phone;

    private String email;

    private String roleName;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date checkintime;

    private Integer isdelete;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date altertime;

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Date getCheckintime() {
		return checkintime;
	}

	public void setCheckintime(Date checkintime) {
		this.checkintime = checkintime;
	}

	public Integer getIsdelete() {
		return isdelete;
	}

	public void setIsdelete(Integer isdelete) {
		this.isdelete = isdelete;
	}

	public Date getAltertime() {
		return altertime;
	}

	public void setAltertime(Date altertime) {
		this.altertime = altertime;
	}
    
}
