package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bean.TodoNote;

@Repository
public interface NoteRepo extends JpaRepository<TodoNote, Integer>{

}
