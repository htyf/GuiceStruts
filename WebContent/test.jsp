<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="zyf.entity.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% User user=(User)request.getAttribute("user"); %>
	姓名：<%=user.getName() %><br/>
	年龄：<%=user.getAge() %><br/>
	 密码：<%=user.getPwd() %> <br/>
	ID号：<%=user.getId() %><br/>
	  描述：<%=user.getDes() %><br/>
</body>
</html>