package com.rn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alien")
public class Alien {

	@Id
	@Column(name = "aid")
	private int id;
	
	@Column(name = "aname")
	private String name;
	

	public Alien() {
		System.out.println("Aliean - 0Param constructor");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Alien [name=" + name + ", id=" + id + "]";
	}

}
