<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>This is help page using Model and view</h1>
<% String name = (String)request.getAttribute("name"); 
	
%>
<h1>
name is : <%= name %>

</h1>
</body>
</html>