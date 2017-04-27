package com.second.ssm.pojo;

/**
 * 驾驶员车辆绑定信息实体类
 * 
 * @author luto
 *
 */
public class Contact {
	private Integer contactid;

	private Integer fkTruckid;

	private Integer fkDriverid;

	public Integer getContactid() {
		return contactid;
	}

	public void setContactid(Integer contactid) {
		this.contactid = contactid;
	}

	public Integer getFkTruckid() {
		return fkTruckid;
	}

	public void setFkTruckid(Integer fkTruckid) {
		this.fkTruckid = fkTruckid;
	}

	public Integer getFkDriverid() {
		return fkDriverid;
	}

	public void setFkDriverid(Integer fkDriverid) {
		this.fkDriverid = fkDriverid;
	}
}