package com.rn.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Alien")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Alien implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	private int aid;
	private String aname;
	private String address;

	public Alien() {
		System.out.println("Alien :: 0 param constructor");
	}

	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", address=" + address + "]";
	}

	

}
