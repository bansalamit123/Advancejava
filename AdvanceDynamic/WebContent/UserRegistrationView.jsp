<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="UserRegistrationCtl" method="post">
	
		<table>
		<%
			String msg = (String) request.getAttribute("msg");
		%>
		
				<%
					if (msg != null) {
				%>
				<%=msg%>
				<%
					}
				%>
			<tr>
				<th>First Name</th>
				<td><input type="text" name="firstName"></td>
			</tr>
			<tr>
				<th>Last Name</th>
				<td><input type="text" name="lastName"></td>
			</tr>
			<tr>
				<th> Login Id</th>
				<td><input type="text" name="login"></td>
			</tr>
			<tr>
				<th>Password</th>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<th>Date</th>
				<td><input type="date" name="dob"></td>
			</tr>
			<tr>
				<th>Address</th>
				<td><input type="text" name="address"></td>
			</tr>
			<tr>
				<td>
					<button>submit</button>
					</td>
			</tr>
		</table>

	</form>
</body>
</html>