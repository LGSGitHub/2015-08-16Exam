<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>显示链接</title>
</head>
<body>
	<center>

		首页<br />
		<br /> 这里显示所有链接:<br />
		<br /> <a href="<%=request.getContextPath()%>/getFilmServlet">查看电影信息</a><br />
		<br />

		<%
			String flag = "";
			Object obj = session.getAttribute("flag");
			if (obj != null) {
				flag = obj.toString();
			}
			if (flag.equals("login_success")) {
		%>
		<a href="<%=request.getContextPath()%>/LogoutServlet">退出登陆</a>
		<%
			} else {
		%>
		<a href="<%=request.getContextPath()%>/login.jsp">登录</a>
		<%
			}
		%>
	</center>
</body>
</html>