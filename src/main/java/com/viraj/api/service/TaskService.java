package com.viraj.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.viraj.api.model.Task;
import com.viraj.api.repository.taskRepository;

@Service
@Transactional
public class TaskService {

	@Autowired
	private taskRepository repository;

	public List<Task> findAll() {
		Iterable<Task> tasks = new ArrayList<>();
		tasks = repository.findAll();
		return (List<Task>) tasks;
	}

	public Task findOne(int taskId) {
		return repository.findOne(taskId);
	}

	public void delete(int taskId) {
		repository.delete(taskId);
	}

	public Task save(Task task) {
		return repository.save(task);
	}

	
	
}
