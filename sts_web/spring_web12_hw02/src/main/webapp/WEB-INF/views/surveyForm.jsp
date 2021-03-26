<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>surveyForm.jsp</title>
</head>
<body>
	
	<h2>surveyForm.jsp</h2>
	<h2>좋아하는 사진은?</h2>
	<form action="./survey.ok" name="frm">
		<div>
			<input type="checkbox" name="ck" id="" value="simbo1" />
			<img src="<c:url value='/resources/simbo1.jpg' />" alt="설거지 심보" />
		</div>
		<div>
			<input type="checkbox" name="ck" id="" value="simbo2" />
			<img src="<c:url value='/resources/simbo2.jpg' />" alt="안마하는 심보" />
		</div>
		
		<br />
		<input type="submit" value="선택" id="btn" />
	
	</form>

</body>
</html>











