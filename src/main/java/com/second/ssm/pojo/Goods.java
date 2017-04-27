package com.second.ssm.pojo;

/**
 * 货物单实体类
 * 
 * @author luto
 *
 */
public class Goods {
	private Integer goodsid;

	private String goodsname;

	private String amount;

	private Float weight;

	private Float volume;

	private Integer fkCarriersid;

	private Integer isdelete;

	public Integer getGoodsid() {
		return goodsid;
	}

	public void setGoodsid(Integer goodsid) {
		this.goodsid = goodsid;
	}

	public String getGoodsname() {
		return goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname == null ? null : goodsname.trim();
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount == null ? null : amount.trim();
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public Float getVolume() {
		return volume;
	}

	public void setVolume(Float volume) {
		this.volume = volume;
	}

	public Integer getFkCarriersid() {
		return fkCarriersid;
	}

	public void setFkCarriersid(Integer fkCarriersid) {
		this.fkCarriersid = fkCarriersid;
	}

	public Integer getIsdelete() {
		return isdelete;
	}

	public void setIsdelete(Integer isdelete) {
		this.isdelete = isdelete;
	}
}