<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>OUT  IMPLICIT OBJECT </h1>
	<%
	out.print("Today is:" + java.util.Calendar.getInstance().getTime());
	%>
</body>
</html>