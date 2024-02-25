<%@page import="java.util.ArrayList"%>
<%@page import="com.example.bean.TodoNote"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <link rel="stylesheet" href="/resources/css/todolist.css">
</head>
<body>
<%List<TodoNote> li=(ArrayList)request.getAttribute("todoList"); %>
<%if(li!=null){ %>
<table>
<tr>
<td>SNo</td>
<td>EmailId</td>
<td>Note</td>

</tr>

<%for(TodoNote data:li){ %>
<tr>
<td><%=data.getSno() %></td>
<td><%=data.getEmail() %></td>
<td><%=data.getTitle() %></td>


</tr>
<%}} %>





</table>
</body>
</html>