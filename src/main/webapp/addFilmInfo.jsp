<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>添加电影信息</title>
</head>
<body>

	<form action="<%=request.getContextPath() %>/DoAddFilmServlet" method="post">
		<center>
			<table>
				<tr>
					<td>title</td>
					<td><input type="text" name="title" /></td>
				</tr>
				<tr>
					<td>description</td>
					<td><input type="text" name="description" /></td>
				</tr>
				<tr>
					<td>language</td>
					<td><select name="language">
							<%
								List<String> list = new ArrayList<String>();
								list = (ArrayList) request.getAttribute("list");
								for (int i = 0; i < list.size(); i++) {
							%>
							<option><%=list.get(i)%></option>
							<%
								}
							%>
					</select></td>
				</tr>
				<tr>
					<td><input type="submit" name="submit" value="submit" /></td>
					<td><input type="reset" name="reset" value="reset" /></td>
				</tr>
			</table>

		</center>
	</form>

</body>
</html>