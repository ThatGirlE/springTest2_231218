<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입정보</title>
</head>
<body>
	<h2>회원가입 정보 출력</h2>
	<hr>
	아이디 : ${joinMember.joinId }<br><br> <!-- 4개전달해서 joinMember. 작성해야된다?  -->
	비밀번호 : ${joinMember.joinPw }<br><br> <!-- 4개전달해서  -->
	이름 : ${joinMember.joinName }<br><br> <!-- 4개전달해서  -->
	이메일 : ${joinMember.joinEmail }<br><br> <!-- 4개전달해서  -->
</body>
</html>