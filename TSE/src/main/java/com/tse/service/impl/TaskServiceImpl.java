package com.tse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.tse.dao.TaskDao;
import com.tse.domain.Task;
import com.tse.service.TaskService;

public class TaskServiceImpl implements TaskService{
	@Autowired TaskDao taskDao;

	@Override
	public Task getById(String taskId) {
		return null;
		//return taskDao.getById();
	}

}
