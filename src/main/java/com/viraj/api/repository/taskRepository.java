package com.viraj.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.viraj.api.model.Task;

public interface taskRepository extends CrudRepository<Task, Integer> {

	//public List<Task> findAll();

}
