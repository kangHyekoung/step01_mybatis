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
	<form action="/insert" method="post">
		<div>
			ID <input type="text" name="memberId" required>
		</div>
		<div>
			PW <input type="password" name="pw" required>
		</div>
		<div>
			이름 <input type="text" name="name" required>
		</div>
		<div>
			핸드폰 <input type="text" name="phone" required>
		</div>
		<div>
			이메일 <input type="email" name="email" required>
		</div>
		<button type="submit">회원가입</button>
	</form>
</div>

</body>
</html>