<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>User Welcome Page</title>
<link rel="stylesheet" type="text/css" href="styles.css">
<%@include file="navBar.jsp" %>
</head>
<body>

<form class="form-container">
<br><br>
<label for="voterNumber">Enter your voter card number<br><br>
<input name="voterNumber" id="voterNumber"type="text" placeholder="Enter your card number"><br><br>
<label> Choose your party </label><br>
<select>
<option value = "BJP"> BJP 
</option>
<option value = "AAP"> AAP 
</option>
<option value = "BSP"> BSP
</option>
<option value = "TMC"> TMC
</option>
<option value = "Congress"> Congress
</option>
</select><br><br>

<input type="submit" name="submit"></input><br>
</form>
</body>
</html>