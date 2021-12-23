<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Access Management</title>
<style type="text/css">
.center {
	margin-left: auto;
	margin-right: auto;
}
</style>
</head>
<body>

	<div style="text-align: center;">
		<h2 style="color: blue">
			<i>Employee Register & View Form</i>
		</h2>
		<br>
	</div>
	<div style="text-align: center;">
		<table class="center">
			<form:form action="saveEmployee" method="post"
				modelAttribute="employee">
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

	<br>
	<br>
	<br>

	<div style="text-align: center;">

		<h2 style="color: blue">
			<b><i>View All the Employees: </i></b>
		</h2>
		<a href="getListOfEmployees"> Click here... </a>
		<%-- <form:form
			action="${pageContext.request.contextPath}/getListOfEmployees"
			method="GET" modelAttribute="listOfEmployees">

			<form:button>Click here..</form:button>

		</form:form> --%>
		<br> <br> <br>

		<%-- <table border="1">
			<tr style="font-size: 13">
				<td>Employee Id</td>
				<td>Employee Name</td>
				<td>Date Of Joining</td>
				<td>Total Experience</td>
				<td>Experience In Techouts</td>
				<td>Status</td>
				<td>Project Name</td>
				<td>Lead Name</td>
				<td>Project Manager</td>
				<td>Resource Manager</td>
				<td>Billing Status</td>
			</tr>
			<c:forEach var="iterate" items="${listOfEmployess}">
				<tr style="font-size: 10">
					<td>${iterate.getEmployeeId()}</td>
					<td>${iterate.getEmployeeName()}</td>
					<td>${iterate.getDateOfJoining()}</td>
					<td>${iterate.getTotalExperience()}</td>
					<td>${iterate.getExperienceInTechouts()}</td>
					<td>${iterate.getStatus()}</td>
					<td>${iterate.getProjectName()}</td>
					<td>${iterate.getLeadName()}</td>
					<td>${iterate.getProjectManager()}</td>
					<td>${iterate.getResourceManager()}</td>
					<td>${iterate.getBillingStatus()}</td>
				</tr>
			</c:forEach>
		</table> --%>
	</div>
	<br>
	<br>
	<br>
	<div style="text-align: center;">

		<h2 style="color: blue">
			<b><i>Update Employee Details: </i></b>
		</h2>
		<a href="updateById">Click here.. </a>

	</div>
	<br>
	<br>
	<br>
	<div style="text-align: center;">

		<h2 style="color: blue">
			<b><i>Delete Employee: </i></b>
		</h2>
		<a href="deleteForm">Click here.. </a>

	</div>
	<br>
	<br>
	<br>

</body>
</html>