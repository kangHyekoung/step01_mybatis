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
<div>
	<h1>
	<c:if test="${result == 1}">가입 성공</c:if>
	</h1>
	<a href="/">로그인 화면 이동</a>
</div>
</body>
</html>