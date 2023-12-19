<%@page import="in.co.rays.bean.UserBean"%>
<body>
<%@include file="Header.jsp" %>
<% UserBean bean=(UserBean)request.getAttribute("userbean");
%>
<form action="UserAddCtl.do" method ="post">

		<%
			String msg = (String) request.getAttribute("msg");
		UserBean userbean=(UserBean) request.getAttribute("userbean");
		%>
		
				<%
					if (msg != null) {
				%>
				<%=msg%>
				<%
					}
				%>

		
		<table>
		<h2>Edit User</h2>
		<tr>
				
				<td><input type="hidden" name="id" value="<%=(bean!=null)? bean.getId():"" %>" ></td>
				

			</tr>
			<tr>
				<th>First Name:</th>
				<td><input type="text" name="firstName" value="<%=(bean!=null)?bean.getFirstName():""%>" ></td>
				

			</tr>
			<tr> 
				<th>Last Name:</th>
				<td><input type="text" name="lastName" value="<%=(bean!=null)?bean.getLastName():""%>"></td>

			</tr>
			<tr>
				<th>Login Id:</th>
				<td><input type="text" name="loginId" value="<%=(bean!=null)?bean.getLoginId():""%>"></td>

			</tr>
			<tr>
				<th>Password:</th>
				<td><input type="text" name="password" value="<%=(bean!=null)?bean.getPassword():""%>"></td>
			</tr>
			<tr>
			<th>Date</th>
			<td> <input type="date" name="dob" value="<%=(bean!=null)?bean.getDob():""%>"> </td>
			</tr>
			<tr>
				<th>Address:</th>
				<td><input type="text" name="address" value="<%=(bean!=null)?bean.getAddress():""%>"></td>
			</tr>
			<tr>
				<th></th>
				<td><input type="submit" name="operation" value="<%=(bean!=null)?"update":"save" %>"></td>
			</tr>
		</table>
		
		  
		<table>
		
			
	</form>
	
</body>