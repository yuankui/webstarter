package com.yuankui.web.repository;

import com.yuankui.web.entity.Task;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface TaskRepository extends CrudRepository<Task, Long> {
  List<Task> queryByName(String name);
}
