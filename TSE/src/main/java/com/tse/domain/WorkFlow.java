package com.tse.domain;

import java.util.Date;

import com.tse.enums.WorkFlowType;

//@Entity(name = "WORKFLOW")
public class WorkFlow {
	private WorkFlowType type;
	private Date startDate;
	private Date endDate;
	private Task task;
	
	//@Column(name = "type", length = 30)
	//@Enumerated(EnumType.STRING)
	public WorkFlowType getType() {
		return type;
	}
	
	public void setType(WorkFlowType type) {
		this.type = type;
	}
	
	//@Column(name = "start_date")
	//@Temporal(TemporalType.TIMESTAMP)
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	//@Column(name = "end_date")
	//@Temporal(TemporalType.TIMESTAMP)
	public Date getEndDate() {
		return endDate;
	}
	
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	//@ManyToOne
	//@JoinColumn(name = "task_id")
	public Task getTask() {
		return task;
	}
	
	public void setTask(Task task) {
		this.task = task;
	}
}
