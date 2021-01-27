<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
	<div id="container">
<button type="button" onclick="window.location.href='saveCustomerDetail';return false;" value="Add Customer">Add Customer</button>
		<div id="container">
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email Name</th>
				</tr>
				<c:forEach var="student" items="${list}">
				<tr>
				<td>${student.firstName}</td>
					<td>${student.lastName}</td>
						<td>${student.email}</td>
				</tr>
				</c:forEach>

			</table>

		</div>
	</div>
</body>
</html>