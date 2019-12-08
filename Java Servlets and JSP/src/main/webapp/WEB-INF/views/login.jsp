<%@page import= “java.util.Date”%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Todos</title>

</head>

<body>
Hey, this is ${name}

<%
System.out.println("Hello");
System.out.println(request.getParameter("name"));

Date date = new Date();
%>

<div>Current Date is <%=date%> </div>
</body>

</html>