<%@page import="java.util.ArrayList"%>
<%@page import="com.example.bean.TodoNote"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Notes App</title>
       <link rel="stylesheet" href="/resources/css/todopage.css">
   </head>
<body>
    <div class="note-container">
        <h2>WRITE TODO NOTES</h2>
        ${msg}
        <form  action="noteData" method="post">
        <input type="hidden" name="email" value=${msg}> 
            <div class="form-group">
                <label for="note">Note:</label>
                <textarea id="note" name="title" required></textarea>
            </div>
            <div class="form-group">
                <button type="submit">Add Note</button>
            </div>
        </form>
    </div>
     <div class="line-divider"></div>
    <div class="note-container">
    
    <table>
    <%List<TodoNote> li=(ArrayList)request.getAttribute("list");
    if(li!=null){
    	
    
    
    
    %>
    <tr>
    <td>SNo</td>
    <td>Email</td>
    <td>Note</td>
    
    
    
    </tr>
    <%for(TodoNote l1:li){
    	
    
    	%>
    	<form action="updatedel" method="post">
    <tr>
    
    <td ><input type="hidden" name="sno" value=<%=l1.getSno() %>><%=l1.getSno() %></td>
    <td ><input type="hidden" name="email" value=<%=l1.getEmail() %>><%=l1.getEmail() %></td>
    <td >
    <textarea name="title">
    <%=l1.getTitle() %></textarea></td>
   <td> <button name="action" value="update" type="submit">Update</button></td>
   <td> <button name="action" value="delete" type="submit">Delete</button></td>
    
    </tr>
    </form>
    <%}} %>
    
    </table>
    </div>
</body>
</html>
