<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%String fName=request.getParameter("firstName"); %>
 <%String lName=request.getParameter("lastName"); %>
 <%String login=request.getParameter("login"); %>
 <%String pass=request.getParameter("password"); %>
  <%String dob=request.getParameter("dob"); %>
   <%String address=request.getParameter("address"); %>
 
 <%=fName %><br>
 <%=lName %><br>
 <%=login %><br>
 <%=pass %><br>
 <%=dob %><br>
 <%=address %><br>
</body>
</html>