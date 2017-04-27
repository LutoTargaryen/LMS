package com.second.ssm.pojo;

import java.util.Date;

/**
 * 系统日志实体类
 * 
 * @author luto
 *
 */
public class Syslog {
	private Integer logid;

	private String behavior;

	private Integer fkTypeid;

	private Integer fkUserid;

	private String parameters;

	private String procname;

	private String ip;

	private Date checkintime;

	private String exception;

	private Integer isexception;

	public Integer getLogid() {
		return logid;
	}

	public void setLogid(Integer logid) {
		this.logid = logid;
	}

	public String getBehavior() {
		return behavior;
	}

	public void setBehavior(String behavior) {
		this.behavior = behavior == null ? null : behavior.trim();
	}

	public Integer getFkTypeid() {
		return fkTypeid;
	}

	public void setFkTypeid(Integer fkTypeid) {
		this.fkTypeid = fkTypeid;
	}

	public Integer getFkUserid() {
		return fkUserid;
	}

	public void setFkUserid(Integer fkUserid) {
		this.fkUserid = fkUserid;
	}

	public String getParameters() {
		return parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters == null ? null : parameters.trim();
	}

	public String getProcname() {
		return procname;
	}

	public void setProcname(String procname) {
		this.procname = procname == null ? null : procname.trim();
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip == null ? null : ip.trim();
	}

	public Date getCheckintime() {
		return checkintime;
	}

	public void setCheckintime(Date checkintime) {
		this.checkintime = checkintime;
	}

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception == null ? null : exception.trim();
	}

	public Integer getIsexception() {
		return isexception;
	}

	public void setIsexception(Integer isexception) {
		this.isexception = isexception;
	}
}