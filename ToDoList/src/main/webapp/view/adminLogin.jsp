<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Login</title>
    <link rel="stylesheet" href="/resources/css/adminlogin.css">
</head>

<body>
    <div class="login-container">
        <h2>Admin Login</h2>
        <form action="adminLogin" method="post">
        <h3>${admin}</h3>
            <div class="form-group">
                <label for="login">Login:</label>
                <input type="text" id="login" name="email" required>
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required>
            </div>
            <div class="form-group">
                <button type="submit">Login</button>
            </div>
        </form>
    </div>
</body>

</html>
s