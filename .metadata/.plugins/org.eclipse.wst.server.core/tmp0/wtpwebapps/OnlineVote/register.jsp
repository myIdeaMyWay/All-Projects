<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Register</title>
<link rel="stylesheet" type="text/css" href="styles.css">
<!-- used to incluse any jsp file -->
<%@include file="adminNavbar.jsp" %>
</head>
<body>
<form class="form-cont"  action="RegisterSer" method="post">
<br>
<label for="vName">Name:<br>
<input name="vName" id="vName"type="text" placeholder="Enter your name"><br><br>
<label for="pNumber">Phone Number:<br><br>
<input name="pNumber" id="pNumber"type="number" placeholder="Enter your phone number"><br><br>
<label for="eMail">Email:<br><br>
<input name="eMail" id="eMail"type="email" placeholder="Enter your email"><br><br>
<label for="vcNumber">Voter Card Number:<br><br>
<input name="vcNumber" id="vcNumber"type="number" placeholder="Enter your voter card number"><br><br>
<label for="vAddress">Address:<br><br>
<input name="vAddress" id="vAddress"type="text" placeholder="Enter your address"><br><br>

<button>Register</button>

</form>
</body>
</html>