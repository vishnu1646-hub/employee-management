package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_details")
public class EmployeeDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_Id")
	private Integer employeeId;

	private String employeeName;

	private String dateOfJoining;

	private Integer totalExperience;

	private Integer experienceInTechouts;

	private String status;

	private String projectName;

	private String leadName;

	private String projectManager;

	private String resourceManager;

	private String billingStatus;

	public EmployeeDetails() {

	}

	public EmployeeDetails(String employeeName, String dateOfJoining, Integer totalExperience,
			Integer experienceInTechouts, String status, String projectName, String leadName, String projectManager,
			String resourceManager, String billingStatus) {
		super();
		this.employeeName = employeeName;
		this.dateOfJoining = dateOfJoining;
		this.totalExperience = totalExperience;
		this.experienceInTechouts = experienceInTechouts;
		this.status = status;
		this.projectName = projectName;
		this.leadName = leadName;
		this.projectManager = projectManager;
		this.resourceManager = resourceManager;
		this.billingStatus = billingStatus;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Integer getTotalExperience() {
		return totalExperience;
	}

	public void setTotalExperience(Integer totalExperience) {
		this.totalExperience = totalExperience;
	}

	public Integer getExperienceInTechouts() {
		return experienceInTechouts;
	}

	public void setExperienceInTechouts(Integer experienceInTechouts) {
		this.experienceInTechouts = experienceInTechouts;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getLeadName() {
		return leadName;
	}

	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}

	public String getProjectManager() {
		return projectManager;
	}

	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}

	public String getResourceManager() {
		return resourceManager;
	}

	public void setResourceManager(String resourceManager) {
		this.resourceManager = resourceManager;
	}

	public String getBillingStatus() {
		return billingStatus;
	}

	public void setBillingStatus(String billingStatus) {
		this.billingStatus = billingStatus;
	}

}
