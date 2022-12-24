<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Online Voting System</title>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<!-- used to incluse any jsp file -->
<%@include file="navBar.jsp" %>

<div class="form-container">
<form action="VoterLogin" method="post">
<h4>Enter your voter card number</h4> <br>
<label for="voterNumber">Voter ID<br><br>
<input name="voterNumber" id="voterNumber"type="text" placeholder="Enter your card number"><br><br>
<button typr="submit">Login</button><br>
<a href="adminLogin.jsp">Admin Login</a>
<!-- used to incluse any jsp file 
<a href="userWelcome.jsp">Admin</a>-->

</form>
</div>
</body>
</html>