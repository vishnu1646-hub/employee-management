<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Employees</title>
<style type="text/css">
.center {
	margin-left: auto;
	margin-right: auto;
}
</style>
</head>
<body>

	<div style="text-align: center;">

		<table class="center" border="1">
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
			<c:forEach var="iterate" items="${listOfEmployees}">
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
		</table>

	</div>

</body>
</html>