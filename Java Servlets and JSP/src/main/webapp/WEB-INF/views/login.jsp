<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Todos</title>

</head>

<body>

<form action="/login.do" method="post">
<p>${errorMessage}</p>
Enter your name: 
Name: <input type= "text" name="name"/>
Password: <input type= "password" name="password"/>
<input type="submit" value="Login"/>
</form>
Hey, this is ${name}

<%
System.out.println("Hello");
System.out.println(request.getParameter("name"));

java.util.Date date = new java.util.Date();
%>

<div>Current Date is <%=date%> </div>
</body>

</html>