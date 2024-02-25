package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bean.TodoListEntity;

@Repository
public interface TodoRepository extends JpaRepository<TodoListEntity, String>{

	
}
