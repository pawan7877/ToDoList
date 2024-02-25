<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Todo Application - Login</title>
    <link rel="stylesheet" href="/resources/css/login.css">
    <style>

    </style>
</head>

<body>
    <div class="header">
        <h1>Welcome to Todo Application</h1>
    </div>
    <div class="login-container">
        <h2>Todo List Login</h2>
        <form action="login" method="post">
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required>
            </div>
            <div class="form-group">
                <button type="submit">Login</button>
            </div>
            <div class="form-group">
                <button><a href="registration" class="register-link">Register here</a></button>
            </div>
            <div class="form-group">
                <button><a href="adminLogin" class="register-link">Admin Login</a></button>
            </div>
        </form>
    </div>
</body>

</html>
