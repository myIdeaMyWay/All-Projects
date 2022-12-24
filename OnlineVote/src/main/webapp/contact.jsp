<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>contact page</title>
<link rel="stylesheet" type="text/css" href="styles.css">
<!-- used to incluse any jsp file -->
<%@include file="navBar.jsp" %>
</head>
<body >
<div class="form-cont">
<form action="Contact" method="post">
<br>
<label for="uName">Name:<br><br>
<input name="uName" id="uName"type="text" placeholder="Enter your name"><br><br>
<label for="pNumber">Phone Number:<br><br>
<input name="pNumber" id="pNumber"type="number" placeholder="Enter your phone number"><br><br>
<label for="email">Email:<br><br>
<input name="email" id="email"type="email" placeholder="Enter your email"><br><br>
<label for="comment">Comment:<br><br>
<textarea name="comment" id="comment"type="text" placeholder="Enter your query"></textarea><br><br>
<button>Submit</button>

</div>
</body>
</html>