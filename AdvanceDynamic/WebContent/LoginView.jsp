<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="Header.jsp"%>
</head>
<body>

<form action="LoginCtl" method ="post">



		<table>
		<%
			String msg = (String) request.getAttribute("msg");
		String uri=(String)request.getAttribute("uri");
		%>
		
				<%
					if (msg != null) {
				%>
				<%=msg%>
				<%
					}
				%>			
		
		<h2>User Login</h2>
		
			
			<tr>
				<th>Login Id:</th>
				<td><input type="text" name="loginId"></td>

			</tr>
			<tr>
				<th>Password:</th>
				<td><input type="text" name="password"></td>
			</tr>
			
		
			<tr>
				<th></th>
				<td><input type = "submit" ></td>
			</tr>
			
		</table>
		<input type="hidden" name="uri" value="<%=uri%>">
		
		
	</form>

</body>
</html>