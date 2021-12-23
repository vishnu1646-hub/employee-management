<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isErrorPage="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee By Id</title>
<style type="text/css">
.demo {
	text-align: center;
	padding: 200px;
}

.center {
	margin-left: auto;
	margin-right: auto;
}
</style>
</head>
<body>
	<div class="demo">
		<div style="text-align: center;">
			<h2 style="color: blue">
				<i>Update Employee Form</i>
			</h2>
			<br>
		</div>
		<div style="text-align: center;">
			<table class="center">
				<form:form action="updatedEmployeeFormId" method="GET"
					modelAttribute="byId">
					<tr>
						<td><form:label path="employeeId">
								<b><i>Employee Id: </i></b>
							</form:label></td>
						<td><form:input path="employeeId" /></td>
					</tr>
					<tr>
						<td></td>
						<td><form:button>
								<b><i>submit</i></b>
							</form:button></td>
					</tr>
				</form:form>
			</table>
		</div>
	</div>
</body>
</html>