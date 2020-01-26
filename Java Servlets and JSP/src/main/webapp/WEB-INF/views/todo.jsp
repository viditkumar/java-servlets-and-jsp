<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Welcome</title>

</head>
<p>Welcome ${name}</p>
<body>
<p>List of To-Do:</p>
<ol>
	<c:forEach items="${todos}" var="todo">
		<li>${todo.name}<a href="/deletetodo.do?todo=${todo.name}">Delete</a></li>
	</c:forEach>
</ol>
<form method="POST" action="/todo.do">
	New Todo : <input name="todo" type="text" /> <input name="add" type="submit" />
</form>
</body>

</html>