<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee Form</title>
<style type="text/css">
.demo {
	text-align: center;
	padding: 150px;
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
			<h3 style="color: blue">
				<i>employee id is mandatory for updating employee details</i>
			</h3>
			<br>
		</div>
		<div style="text-align: center;">
			<table class="center">
				<form:form action="updateEmployeeByRM" method="PUT"
					modelAttribute="updateattri">
					<tr>
						<td><form:label path="employeeId">
								<b><i>Employee Id: </i></b>
							</form:label></td>
						<td><form:input path="employeeId" /></td>
					</tr>
					<tr>
						<td><form:label path="employeeName">
								<b><i>Employee Name: </i></b>
							</form:label></td>
						<td><form:input path="employeeName" /></td>
					</tr>
					<!-- <br>
			<br> -->
					<tr>
						<td><form:label path="dateOfJoining">
								<b><i>Date Of Joining: </i></b>
							</form:label></td>
						<td><form:input path="dateOfJoining" /></td>
					</tr>
					<!-- <br>
			<br> -->
					<tr>
						<td><form:label path="totalExperience">
								<b><i>Total Experience: </i></b>
							</form:label></td>
						<td><form:input path="totalExperience" /></td>
					</tr>
					<!-- <br>
			<br> -->
					<tr>
						<td><form:label path="experienceInTechouts">
								<b><i>Experience In Techouts: </i></b>
							</form:label></td>
						<td><form:input path="experienceInTechouts" /></td>
					</tr>
					<!-- <br>
			<br> -->
					<tr>
						<td><form:label path="status">
								<b><i>Employee Status: </i></b>
							</form:label></td>
						<td><form:input path="status" /></td>
					</tr>
					<!-- <br>
			<br> -->
					<tr>
						<td><form:label path="projectName">
								<b><i>Project Name: </i></b>
							</form:label></td>
						<td><form:input path="projectName" /></td>
					</tr>
					<!-- <br>
			<br> -->
					<tr>
						<td><form:label path="leadName">
								<b><i>Lead Name: </i></b>
							</form:label></td>
						<td><form:input path="leadName" /></td>
					</tr>
					<!-- <br>
			<br> -->
					<tr>
						<td><form:label path="projectManager">
								<b><i>Project Manager: </i></b>
							</form:label></td>
						<td><form:input path="projectManager" /></td>
					</tr>
					<!-- <br>
			<br> -->
					<tr>
						<td><form:label path="resourceManager">
								<b><i>Resource Manager: </i></b>
							</form:label></td>
						<td><form:input path="resourceManager" /></td>
					</tr>
					<!-- <br>
			<br> -->
					<tr>
						<td><form:label path="billingStatus">
								<b><i>Billing Status: </i></b>
							</form:label></td>
						<td><form:input path="billingStatus" /></td>
					</tr>
					<!-- <br>
				<br> -->
					<tr>
						<td></td>
						<td></td>
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