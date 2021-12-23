package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.EmployeeDetails;
import com.example.demo.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/updateById", method = RequestMethod.GET)
	private String showUpdatedFormById(Model model) {
		model.addAttribute("byId", new EmployeeDetails());
		return "updated-form-by-id";
	}

	@RequestMapping(value = "/updatedEmployeeFormId", method = RequestMethod.GET)
	private String getIdForUpdate(@ModelAttribute("byId") EmployeeDetails employeeDetails, BindingResult bindingResult,
			Model model) {
		EmployeeDetails details = employeeService.updateEmployeeById(employeeDetails.getEmployeeId());
		model.addAttribute("updated", details);
		return "update-form";
	}

	@RequestMapping("/deleteForm")
	private String getDeleteForm(Model model) {
		model.addAttribute("deleteattri", new EmployeeDetails());
		return "delete-employee-form";
	}

	/*
	 * @RequestMapping("/updateForm") private String getUpdateForm(Model model) {
	 * model.addAttribute("updateattri", new EmployeeDetails(null, null, null, null,
	 * null, null, null, null, null, null)); return "update-form"; }
	 */

	@GetMapping("/designation")
	private String getDesignationDetails(Model model, HttpServletRequest httpServletRequest) {

		System.out.println("get mapping method called!!!!!!!");
		String designstion = httpServletRequest.getParameter("designatedValue");
		model.addAttribute("employee", new EmployeeDetails());
		System.out.println(designstion);
		if (designstion.equalsIgnoreCase("hr") || designstion.equalsIgnoreCase("resource manager")) {
			return "employee-details-editing-form";
		} else if (designstion.equalsIgnoreCase("lead")) {
			return "lead-management";
		} else if (designstion.equalsIgnoreCase("project manager")) {
			return "projectmanager-management";
		} else {
			return "error-form";
		}
	}

	// @RequestBody EmployeeDetails employeeDetails,

	@PostMapping("/saveEmployee")
	private String saveEmployee(@ModelAttribute("employee") EmployeeDetails employeeDetails) {
		employeeService.saveEmployeeDetails(employeeDetails);
		return "saved-successfully";
	}

	@DeleteMapping("/deleteEmployee")
	private String deleteTheEmployee(@ModelAttribute("deleteattri") EmployeeDetails emDetails,
			BindingResult bindingResult, Model model) {
		employeeService.deleteEmployeeDetails(emDetails.getEmployeeId());
		return "delete-success";

	}

	@GetMapping("/getListOfEmployees")
	private String getAllEmployeeDetails(Model model) {

		List<EmployeeDetails> employeeDetails = employeeService.getListOfEmployee();
		model.addAttribute("listOfEmployees", employeeDetails);
		return "all-employees";
		// return employeeService.getListOfEmployee();
	}

	@PutMapping("/updateEmployee")
	private String updateEmployeeDetails(@ModelAttribute("employee") EmployeeDetails employeeDetails,
			BindingResult bindingResult) {
		employeeService.updateEmployeeDetails(employeeDetails.getEmployeeId(), employeeDetails.getBillingStatus());
		System.out.println("after updation.........");
		return "update-success";
	}

	@PutMapping("/updateEmployeeByRM")
	private String accessUpdateForResourceManager(@ModelAttribute("updateattri") EmployeeDetails employeeDetails,
			BindingResult bindingResult) {
		employeeService.updateEmployeeDetailsByRmAndHr(employeeDetails.getEmployeeId(),
				employeeDetails.getEmployeeName(), employeeDetails.getDateOfJoining(),
				employeeDetails.getTotalExperience(), employeeDetails.getExperienceInTechouts(),
				employeeDetails.getStatus(), employeeDetails.getProjectName(), employeeDetails.getLeadName(),
				employeeDetails.getProjectManager(), employeeDetails.getResourceManager(),
				employeeDetails.getBillingStatus());
		return "update-success";
	}

	@RequestMapping(value = "/updateEmployeeByPM", method = RequestMethod.PUT)
	private String accessUpdateForProjectManager(@ModelAttribute("employee") EmployeeDetails employeeDetails,
			BindingResult bindingResult) {
		System.out.println("in project manager");
		employeeService.updateEmployeeDetailsByProjectManager(employeeDetails.getEmployeeId(),
				employeeDetails.getProjectName(), employeeDetails.getLeadName(), employeeDetails.getBillingStatus());
		return "update-success";
	}

	/*
	 * @PutMapping("/updateEmployeeByRM/{employeeId}") private void
	 * accessUpdateForResourceManager(@PathVariable("employeeId") Integer
	 * modifyInteger,
	 * 
	 * @RequestBody EmployeeDetails employeeDetails) {
	 * employeeService.updateEmployeeDetailsByRmAndHr(modifyInteger,
	 * employeeDetails.getEmployeeName(), employeeDetails.getDateOfJoining(),
	 * employeeDetails.getTotalExperience(),
	 * employeeDetails.getExperienceInTechouts(), employeeDetails.getStatus(),
	 * employeeDetails.getProjectName(), employeeDetails.getLeadName(),
	 * employeeDetails.getProjectManager(), employeeDetails.getResourceManager(),
	 * employeeDetails.getBillingStatus()); }
	 */
	/*
	 * @PutMapping("/updateEmployeeByPM/{employeeId}") private void
	 * accessUpdateForProjectManager(@PathVariable("employeeId") Integer
	 * modifyInteger,
	 * 
	 * @RequestBody EmployeeDetails employeeDetails) {
	 * employeeService.updateEmployeeDetailsByProjectManager(modifyInteger,
	 * employeeDetails.getProjectName(), employeeDetails.getLeadName(),
	 * employeeDetails.getBillingStatus()); }
	 */

	/*
	 * @PutMapping("/updateEmployee/{employeeId}") private void
	 * updateEmployeeDetails(@PathVariable("employeeId") Integer modifyInteger,
	 * 
	 * @RequestBody EmployeeDetails employeeDetails) {
	 * employeeService.updateEmployeeDetails(modifyInteger,
	 * employeeDetails.getBillingStatus()); }
	 */

	/*
	 * @DeleteMapping("/deleteEmployee/{employeeId}") private void
	 * deleteTheEmployee(@PathVariable("employeeId") Integer emInteger) {
	 * employeeService.deleteEmployeeDetails(emInteger); }
	 */

	/*
	 * @PutMapping("/updateEmployeeByRM") private void
	 * accessUpdateForResourceManager(@ModelAttribute("updateattri") EmployeeDetails
	 * employeeDetails, BindingResult bindingResult) {
	 * employeeService.updateEmployeeDetailsByRmAndHr(employeeDetails.getEmployeeId(
	 * ), employeeDetails.getEmployeeName(), employeeDetails.getDateOfJoining(),
	 * employeeDetails.getTotalExperience(),
	 * employeeDetails.getExperienceInTechouts(), employeeDetails.getStatus(),
	 * employeeDetails.getProjectName(), employeeDetails.getLeadName(),
	 * employeeDetails.getProjectManager(), employeeDetails.getResourceManager(),
	 * employeeDetails.getBillingStatus()); }
	 */

}
