package com.tse.domain;

import java.util.Date;
//import javax.persistence.AttributeOverride;
//import javax.persistence.AttributeOverrides;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;

//@Entity(name = "HISTORY")
public class History {
	private Date date;
	private String comment;
	private User user;
	
	//@Column(name = "date")
	//@Temporal(TemporalType.TIMESTAMP)
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	//@Column(name = "comment", length = 4000)
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	//@ManyToOne
	//@JoinColumn(name = "user_id")
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
}
