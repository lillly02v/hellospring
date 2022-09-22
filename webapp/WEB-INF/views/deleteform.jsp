<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<link href="/mysite/assets/css/guestbook.css" rel="stylesheet" type="text/css">
<title>guestbook</title>
</head>
<body>
	<div id="container">
		
		
		
		<div id="wrapper">
			<div id="content">
				<div id="guestbook" class="delete-form">
					
					<form method="post" action="/hellospring/deleteGb">
						<input type="hidden" name="no" value="${param.no }">
						<label>비밀번호</label>
						<input type="password" name="password">
						<input type="hidden" name="pwd" value="${param.pwd}">
						<input type="submit" value="확인">
					</form>
					<a href="/hellospring/getGuestbookList">방명록 리스트</a>
					
				</div>
			</div><%-- /content --%>
		</div><%-- /wrapper --%>
		
	
		
	</div><%-- /container --%>
</body>
</html>		
		
