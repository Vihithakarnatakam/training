package com.ibm.entity;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="pass")
public class Passenger {
	
	@Id
	private int id;
	
	@Column(name="passname", length=20)
	private String name;
	private int age;
	
	@ManyToOne
	@JoinColumn(name="tkt")
	private Ticket tkt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Ticket getTkt() {
		return tkt;
	}

	public void setTkt(Ticket tkt) {
		this.tkt = tkt;
	}
		

}
