package com.tse.domain;

import com.tse.enums.TaskStatus;

//@Entity(name = "TASK")
public class Task {
	private String title;
	private TaskStatus status;
	private String points;
	private String extraPoints;
	private String remark;
	private String argument;
	private User user;
	
	
	//@Column(name = "title", length = 256)
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	//@Column(name = "status", length =30)
	//@Enumerated(EnumType.STRING)
	public TaskStatus getStatus() {
		return status;
	}
	public void setStatus(TaskStatus status) {
		this.status = status;
	}
	
	//@Column(name = "points", length = 4)
	public String getPoints() {
		return points;
	}
	
	public void setPoints(String points) {
		this.points = points;
	}
	
	//@Column(name = "extra_points", length = 4)
	public String getExtraPoints() {
		return extraPoints;
	}
	
	public void setExtraPoints(String extraPoints) {
		this.extraPoints = extraPoints;
	}
	
	//@Column(name = "remark", length = 4000)
	public String getRemark() {
		return remark;
	}
	
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	//@Column(name = "argument", length = 4000)
	public String getArgument() {
		return argument;
	}
	
	public void setArgument(String argument) {
		this.argument = argument;
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
