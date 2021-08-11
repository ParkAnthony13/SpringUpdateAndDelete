<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
		<link rel="stylesheet" type="text/css" href="css/style.css">
		<title>Insert title here</title>
	</head>
	<body>
		<div class="container">
			<h1>New Book</h1>
			<form:form action="/books" method="post" modelAttribute="book">
			    <p>
			        <form:label path="title">Title</form:label>
			        <form:errors path="title"/>
			        <form:input path="title"/>
			    </p>
			    <p>
			        <form:label path="description">Description</form:label>
			        <form:errors path="description"/>
			        <form:textarea path="description"/>
			    </p>
			    <p>
			        <form:label path="language">Language</form:label>
			        <form:errors path="language"/>
			        <form:input path="language"/>
			    </p>
			    <p>
			        <form:label path="numberOfPages">Pages</form:label>
			        <form:errors path="numberOfPages"/>     
			        <form:input type="number" path="numberOfPages"/>
			    </p>    
			    <input type="submit" value="Submit"/>
			</form:form> 
		</div>
		
		<script src="/webjars/jquery/jquery.min.js"></script>
		<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="js/app.js"></script>
	</body>
</html>