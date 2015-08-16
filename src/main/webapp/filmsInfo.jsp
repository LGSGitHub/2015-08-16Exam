<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
td {
	border: 2px solid blue;
}
</style>
</head>
<body>
	<center>
		<h2>这里显示电影信息</h2>
		<h2><a href="<%=request.getContextPath() %>/AddFilmServlet">添加电影信息</a></h2>
		<table style="">
			<tr>
				<td>film_id</td>
				<td>title</td>
				<td>desctiption</td>
				<td>language</td>
			</tr>
			<%
				List<String> list = new ArrayList<String>();
				list = (ArrayList) request.getAttribute("list");
				for (int i = 0; i < list.size(); i += 4) {
			%>
			<tr>
				<td><%=list.get(i)%></td>
				<td><%=list.get(i + 1)%></td>
				<td><%=list.get(i + 2)%></td>
				<td><%=list.get(i + 3)%></td>
				<td><a href="<%=request.getContextPath() %>/UpdateFilmServlet?film_id=<%=list.get(i)%>">编辑</a></td>
				<td><a href="<%=request.getContextPath() %>/DeleteFilmServlet?film_id=<%=list.get(i)%>">删除</a></td>
			<tr />
			<%
				}
			%>
		</table>
	</center>
</body>
</html>