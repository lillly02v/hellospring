<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/hellospring/assets/css/guestbook.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="wrapper">
			<div id="content">
				<div id="guestbook">
					<form method="post" action="/hellospring/addGuestbook" >
						<table style="border-collapse:collapse">
							<tr>
								<td>이름</td><td><input type="text" name="name" /></td>
								<td>비밀번호</td><td><input type="password" name="password" /></td>
							</tr>
							<tr>
								<td colspan=4><textarea name="content" id="content" style="
    							width: 520px;"></textarea></td>
							</tr>
							<tr>
								<td colspan=4 align=right><input type="submit" VALUE=" 확인 " /></td>
							</tr>
						</table>
						
					</form>
				  
				  <table border=1 cellpadding=0 cellspacing=0>
				    <tr>
				      <th>no</th>
				      <th>name</th>
				      <th>content</th>
				      <th>reg_date</th>
				    </tr>
    
				    <c:forEach items="${guestbookList}" var="guestbook">
				    <tr>
				      <td>${guestbook.no}</td>
				      <td>${guestbook.name}</td>
				      <td>${guestbook.content}</td>
				      <td>${guestbook.regDate}</td>
				      <td><a href="/hellospring/deleteform?no=${guestbook.no}&pwd=${guestbook.password}">삭제</a></td>
				    </tr>
				    </c:forEach>
				      
				  </table>
			</div>
		</div>
	</div>
</body>
</html>