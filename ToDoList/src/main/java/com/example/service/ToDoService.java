package com.example.service;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.TodoListEntity;
import com.example.bean.TodoNote;

import com.example.repository.NoteRepo;
import com.example.repository.TodoRepository;
@Service
public class ToDoService {

	@Autowired
	TodoRepository repo;
	
	@Autowired
    NoteRepo nr;

// For save registration data in h2 database
	
	public boolean saveData(TodoListEntity todo) {
		
		
		boolean result=false;
	  Optional<TodoListEntity> User=repo.findById(todo.getEmail());
	  if(User.isPresent()) {
		  TodoListEntity user = User.get();
		  result =false;
		System.out.println("user name already exist");  
	  }else {
		repo.save(todo);
		result=true;
		System.out.println("user registered successfully");
		
		}
	  return result;
	  }
	  
  //  For login   
	public boolean login(String email, String password) {
		// TODO Auto-generated method stub
		boolean res=false;
		Optional<TodoListEntity> user =repo.findById(email);
		if(user.isPresent()) {
			TodoListEntity us1=user.get();
			if(password.equals(us1.getPassword())) {
				res=true;
			}else {
				res=false;
			}
		}
		
		return res;
	}
	
	
//for save Todo's data in h2 database	
	public void saveNote(TodoNote note) {
		
		  System.out.println("ser");
			nr.save(note);
			}
	
//for getdata on page in h2 database	
	public List<TodoNote> getNote() {
		
	List<TodoNote> li =new ArrayList<>();
	nr.findAll().forEach(li::add);
		return li;
	}
	
	
//for update data on same page and also in database	
	public void updateNote(TodoNote note) {
		nr.save(note);
	}
	
//for delete data on page and also in database
	public void deleteNote(TodoNote note) {
		nr.delete(note);
	}

//for getall Todo's data on a page
	public List<TodoNote> getAllTodo() {
		// TODO Auto-generated method stub
		
		List<TodoNote> li=new ArrayList<>();
		nr.findAll().forEach(li::add);
		return li;
	}

// for getAll data 
	public List<TodoListEntity> getAllUser() {
		List<TodoListEntity> li=new ArrayList<>();
		repo.findAll().forEach(li::add);
		return li;
	}
	
	
}
