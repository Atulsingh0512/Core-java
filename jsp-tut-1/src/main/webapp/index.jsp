<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="java.util.*" %>
	<%@page session="false" %>
	<%@page isELIgnored="false" %>
	<%@page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: white">
	<h1>hello world</h1>
	
	 <h1>DECLARTION TAG</h1>
	<%!int a = 10;
	String name = "atul";%>
	<h1>
		Expression tag:
		<%=a%>
		<%=name%>
	</h1>
	<%
	int sum = 20 + 30;
	out.println("sum="  +sum);
	%> 
	
	<%-- comment  --%>
	<%@include file="header.jsp" %>
	<h1>Time: <%=new Date().toString() %></h1>
	

</body>
</html>