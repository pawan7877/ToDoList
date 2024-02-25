<%@page import="com.example.bean.TodoListEntity"%>
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
<link rel="stylesheet" href="/resources/css/userlist.css">

</head>
<body>
<%List<TodoListEntity> li=(ArrayList)request.getAttribute("userList"); %>
<%if(li!=null){ %>
<table>
<tr>
<td>firstName</td>
<td>lastName</td>
<td>email</td>
<td>password</td>
<td>dob</td>
<td>gender</td>

</tr>

<%for(TodoListEntity data:li){ %>
<tr>
<td><%=data.getFirstName() %></td>
<td><%=data.getLastName() %></td>
<td><%=data.getEmail()%></td>
<td><%=data.getPassword()%></td>
<td><%=data.getDob()%></td>
<td><%=data.getGender()%></td>

</tr>
<%}} %>

</table>
</body>
</html>