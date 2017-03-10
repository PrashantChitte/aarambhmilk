package com.milk.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="suplierDetails")
public class SuplierEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="supid")
	private int sID;
	@Column(name="supname")
	private String sName;
	@Column(name="supadd")
	private String sadd;
	
	
	
	
	public SuplierEntity() {
		super();
	}
	public int getsID() {
		return sID;
	}
	public void setsID(int sID) {
		this.sID = sID;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	
	
	
	
}
