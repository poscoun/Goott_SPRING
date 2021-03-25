<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>welcome.jsp</title>
</head>
<body>
	<h1>welcome.jsp</h1>
	<h3>가입해주셔서 감사합니다</h3>
	<h3>가입 정보 확인</h3>
	<ul>
		<li>ID : ${dto.id }</li>
		<li>PWD : ${dto.pwd }</li>
		<li>Confirm : ${dto.confirm }</li>
		<li>Email : ${dto.email }</li>
	</ul>
	
	<a href="../main"><span>[메인화면으로 이동]</span></a>
	
</body>
</html>