package com.second.ssm.pojo;

/**
 * 日志字典实体类
 * 
 * @author luto
 *
 */
public class Logdic {
	private Integer typeid;

	private String typename;

	public Integer getTypeid() {
		return typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename == null ? null : typename.trim();
	}
}