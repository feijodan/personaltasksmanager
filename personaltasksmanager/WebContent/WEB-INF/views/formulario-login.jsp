<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link type="text/css" href="resources/css/tasks.css" rel="stylesheet" />
	<title>Personal Tasks Manager</title>
</head>
<body>
	<h2>Login</h2>
	<form action="makeLogin" method="post">
		Login: <input type="text" name="login" /> <br>
		Password: <input type="password" name="password" />
		<input type="submit" value="Login" />
	</form>
</body>
</html>