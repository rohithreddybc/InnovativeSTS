package com.rohith.student.dal.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "studenttab")
public class student {
	
	@Id
	private long id;
	@Column(name="sname")
	private String name;
	@Column(name="scourse")
	private String course;
	@Column(name="sfee")
	private double fee;

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", course=" + course + ", fee=" + fee + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

}
