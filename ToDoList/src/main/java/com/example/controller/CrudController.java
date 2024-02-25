package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties.Request;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.bean.TodoListEntity;
import com.example.bean.TodoNote;
import com.example.service.ToDoService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
@Controller
public class CrudController {

	@Autowired
	ToDoService ser;

//For admin login
	
	@RequestMapping(path = "/adminLogin" ,method = RequestMethod.POST)
	public String adminLogin(@RequestParam("email")String email,@RequestParam("password")String password,Model model) {
		
		String target="";
		if(email.equals("7877pawan@gmail.com")&&password.equals("12345")) {
		target="AdminPannel";
			model.addAttribute("admin","Welcome");
		}else {
			target="adminLogin";
			model.addAttribute("admin","wrong detials");
			
		}
		return target;
	}
	
//For Registration	
	@RequestMapping(path = "/register",method = RequestMethod.POST)
	public String reg(@ModelAttribute("todo")TodoListEntity todo,Model model ,HttpServletRequest request) {
		boolean data=ser.saveData(todo);
		String target="";
		
		if(data) {
			HttpSession session = request.getSession();
			session.setAttribute("msg",todo.getEmail() );
			target="Todopage";
		}else{
			target="registration";
			model.addAttribute("msg", "Please fill correct details");
		}
		System.out.println(data);
		return target;
	}
	
//For Login 
	@RequestMapping(path = "/login",method = RequestMethod.POST)
	public String login(@RequestParam("email")String email,@RequestParam("password")String password,HttpServletRequest request ){
		boolean res=ser.login(email,password);
		String target="";
	
		if(res) {
			HttpSession session = request.getSession();
			session.setAttribute("msg",email);
			List<TodoNote> list=ser.getNote();
			request.setAttribute("list", list);
			
			target="Todopage";

		}
		else {
			target="login";
		}
		return target;
		
	}
	
//For add data in ToDo	
	@RequestMapping(path = "/noteData",method = RequestMethod.POST)
	public String save(@ModelAttribute("nnote")TodoNote nnote,HttpServletRequest request){

		System.out.println("crud");
		ser.saveNote(nnote);
		List<TodoNote> list=ser.getNote();
		request.setAttribute("list", list);
		return "Todopage";
		
	}
	
// For update and delete Todo's data
	@RequestMapping(path = "/updatedel",method = RequestMethod.POST)
	public String noteUpdate(@ModelAttribute("note")TodoNote note,@RequestParam("action")String action,HttpServletRequest request) {
		
		
		if(action.equals("update")) {
			
			ser.updateNote(note);
			List<TodoNote> list=ser.getNote();
			request.setAttribute("list", list);
		}else if(action.equals("delete")) {
			
			ser.deleteNote(note);
			List<TodoNote> list=ser.getNote();
			request.setAttribute("list", list);
			
		}
		
		
		return"Todopage";
	}
	
	
// For admin getAll Todo's
	
	@PostMapping("/TodoList")
	public String getAllTodo(HttpServletRequest request) {
		
		List<TodoNote> li=ser.getAllTodo();
		request.setAttribute("todoList", li);
		return "TodoList";
	}
	
// For admin getAll User Detials
	
		@PostMapping("/userList")
		public String getAllUser(HttpServletRequest request) {
			
			List<TodoListEntity> li=ser.getAllUser();
			request.setAttribute("userList", li);
			return "UserList";
		}
	
}
