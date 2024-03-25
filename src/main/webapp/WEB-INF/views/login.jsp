<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/styles.css">
</head>
<body>
<div class="login-container">
	<h2>로그인화면</h2>
	<form action="/login" method="post">
		<div>
			ID <input type="text" name="memberId" required>
		</div>
		<div>
			PW <input type="password" name="pw" required>
		</div>
		<button type="submit">로그인</button>
	</form>
	<a href="/join">회원가입</a>

</div>

</body>
</html>