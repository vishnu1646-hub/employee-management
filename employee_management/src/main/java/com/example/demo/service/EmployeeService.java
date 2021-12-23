package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.EmployeeDetails;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Transactional
	public EmployeeDetails saveEmployeeDetails(EmployeeDetails employeeDetails) {
		employeeRepository.save(new EmployeeDetails(employeeDetails.getEmployeeName(),
				employeeDetails.getDateOfJoining(), employeeDetails.getTotalExperience(),
				employeeDetails.getExperienceInTechouts(), employeeDetails.getStatus(),
				employeeDetails.getProjectName(), employeeDetails.getLeadName(), employeeDetails.getProjectManager(),
				employeeDetails.getResourceManager(), employeeDetails.getBillingStatus()));
		System.out.println("Employee Details are successfully saved !!!");
		return employeeDetails;
	}

	@Transactional
	public void deleteEmployeeDetails(Integer id) {
		employeeRepository.deleteById(id);
		System.out.println("Employee Deleted....");
	}

	@Transactional
	public List<EmployeeDetails> getListOfEmployee() {
		List<EmployeeDetails> list = new ArrayList<EmployeeDetails>();
		employeeRepository.findAll().forEach(employeeData -> list.add(employeeData));
		return list;
	}

	@Transactional
	public void updateEmployeeDetails(Integer id, String billingStatus) {
		EmployeeDetails details = employeeRepository.findById(id).get();
		if (billingStatus != null && billingStatus != "")
			details.setBillingStatus(billingStatus);
		employeeRepository.save(details);
	}

	@Transactional
	public void updateEmployeeDetailsByRmAndHr(Integer id, String empName, String doj, Integer totExp, Integer expInTec,
			String status, String projName, String leadName, String projManager, String resMan, String billStat) {
		EmployeeDetails employeeDetails = employeeRepository.findById(id).get();
		if (empName != null)
			employeeDetails.setEmployeeName(empName);
		if (doj != null)
			employeeDetails.setDateOfJoining(doj);
		if (totExp != null)
			employeeDetails.setTotalExperience(totExp);
		if (expInTec != null)
			employeeDetails.setExperienceInTechouts(expInTec);
		if (status != null)
			employeeDetails.setStatus(status);
		if (projName != null)
			employeeDetails.setProjectName(projName);
		if (leadName != null)
			employeeDetails.setLeadName(leadName);
		if (projManager != null)
			employeeDetails.setProjectManager(projManager);
		if (resMan != null)
			employeeDetails.setResourceManager(resMan);
		if (billStat != null)
			employeeDetails.setBillingStatus(billStat);

		System.out.println(employeeDetails.toString());

		employeeRepository.save(employeeDetails);
	}

	@Transactional
	public void updateEmployeeDetailsByProjectManager(Integer id, String projectName, String leads,
			String billingStatus) {
		EmployeeDetails employeeDetails = employeeRepository.findById(id).get();
		if (projectName != null && projectName != "")
			employeeDetails.setProjectName(projectName);
		if (leads != null && leads != "")
			employeeDetails.setLeadName(leads);
		if (billingStatus != null && billingStatus != "")
			employeeDetails.setBillingStatus(billingStatus);
		employeeRepository.save(employeeDetails);
	}

	@Transactional
	public EmployeeDetails updateEmployeeById(Integer id) {
		EmployeeDetails employeeDetails = employeeRepository.findById(id).get();
		employeeDetails.setEmployeeName(employeeDetails.getEmployeeName());
		employeeDetails.setDateOfJoining(employeeDetails.getDateOfJoining());
		employeeDetails.setTotalExperience(employeeDetails.getTotalExperience());
		employeeDetails.setExperienceInTechouts(employeeDetails.getExperienceInTechouts());
		employeeDetails.setStatus(employeeDetails.getStatus());
		employeeDetails.setProjectName(employeeDetails.getProjectName());
		employeeDetails.setLeadName(employeeDetails.getLeadName());
		employeeDetails.setProjectManager(employeeDetails.getProjectManager());
		employeeDetails.setResourceManager(employeeDetails.getResourceManager());
		employeeDetails.setBillingStatus(employeeDetails.getBillingStatus());
		return employeeDetails;
	}

}
