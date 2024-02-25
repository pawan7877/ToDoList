<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/adminpanel.css">
</head>
<body>
<div class="admin-panel">
        <h2>Admin Panel</h2>
        <div class="button-container">
           <form action="TodoList" method="post"> <button class="get-all-todos">Get All Todos</button></form>
           <form action="userList" method="post"> <button class="get-all-users">Get All Users</button></form>
        </div>
    </div>

</body>
</html>