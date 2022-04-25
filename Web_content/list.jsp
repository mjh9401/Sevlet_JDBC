<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>직원검색결과</title>
</head>
<body>
	<h1>이동성공</h1>
	<c:forEach items="${membmers}" var="member">
		<div>
			번호 : ${member.idx}<br>
			이름 : ${member.name}<br>
			주소 : ${member.address}<br>
			이메일 : ${member.email}<br>
			전화번호 : ${member.tel}
		</div>
	</c:forEach>
</body>
</html>