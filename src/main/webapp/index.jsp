<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
say hello to me
<table border="1">
	<c:forEach items="${list }" var="user">
		<tr>
			<td>${user.id }</td>		
			<td>${user.name }</td>		
			<td>${user.password }</td>		
		</tr>
	</c:forEach>
</table>

</body>
</html>