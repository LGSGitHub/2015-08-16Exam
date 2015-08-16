<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>更新电影信息</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/DoUpdateFilmServlet"
		method="post">
		<center>
			<table>
				<%
					List<String> flist = new ArrayList<String>();
					flist = (ArrayList) request.getAttribute("filmList");
					for (int i = 0; i < flist.size(); i++) {
				%>
				<tr>

					<td>title</td>
					<td><input type="text" name="title" value="<%=flist.get(0)%>" /></td>
				</tr>
				<tr>
					<td>description</td>
					<td><input type="text" name="description"
						value="<%=flist.get(1)%>" /></td>
				</tr>
				<%
					}
				%>
				<tr>
					<td>language</td>
					<td><select name="language">
							<%
								List<String> llist = new ArrayList<String>();
								llist = (ArrayList) request.getAttribute("languageList");
								for (int i = 0; i < llist.size(); i++) {
							%>
							<option><%=llist.get(i)%></option>
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