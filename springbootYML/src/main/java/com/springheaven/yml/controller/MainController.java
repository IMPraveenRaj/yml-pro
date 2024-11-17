package com.springheaven.yml.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springheaven.yml.dto.EmployeeContainerDTO;
import com.springheaven.yml.dto.EmployeeListContainerDTO;
import com.springheaven.yml.dto.PersonContainerDTO;
import com.springheaven.yml.dto.model.Address;
import com.springheaven.yml.dto.model.Employee;
import com.springheaven.yml.dto.model.Person;

@RestController
@RequestMapping("/api")
public class MainController {

	@GetMapping(value = "/getPerson")
	public ResponseEntity<PersonContainerDTO> getPersonResponse() {
		// PersonContainerDTO personContainerDTO= new PersonContainerDTO();

		Address billingAddrss = new Address();
		billingAddrss.setLane1("33 blassbalg straat");
		billingAddrss.setLane2("Bruul Street east");
		billingAddrss.setState("Mechelen");
		billingAddrss.setCountry("belgium");
		billingAddrss.setCity("Brussels");

		Person person = new Person();
		person.setBillingAddress(billingAddrss);
		person.setLivingAddress(billingAddrss);
		List<Person> personList = new ArrayList();
		personList.add(person);

		PersonContainerDTO personContainer = new PersonContainerDTO();
		personContainer.setPerson(personList);

		return ResponseEntity.ok(personContainer);
	}

	@GetMapping(value = "/getPersonnew")
	public PersonContainerDTO getPersonnew() {
		return new PersonContainerDTO();
	}

	@GetMapping(value = "/getEmployee")
	public EmployeeContainerDTO getEmployee() {
		List<Employee> employees = new ArrayList<Employee>();
		// Stream<EmployeeContainerDTO> map =
		// employees.stream().map(employee->MaptoEmployeeContainerDto(employee));
		// List<EmployeeContainerDTO> collect = map.collect(Collectors.toList());
		Employee employee = new Employee();
		employee.setFirstName("praveenraj");
		employee.setId(1);
		employee.setName("mohanraj");

		return MaptoEmployeeContainerDto(employee);

	}

	@GetMapping(value = "/getEmployees")
	public ResponseEntity<EmployeeListContainerDTO> getEmployees() {
		
		Employee employee = new Employee();
		employee.setFirstName("praveenraj");
		employee.setId(1);
		employee.setName("mohanraj");		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		return ResponseEntity.ok(MaptoEmployeeListContainerDto(employees));

	}

	private EmployeeContainerDTO MaptoEmployeeContainerDto(Employee employee) {

		EmployeeContainerDTO employeeContainerDTO = new EmployeeContainerDTO();
		employeeContainerDTO.setEmployee(employee);

		return employeeContainerDTO;

	}
	
	
	private EmployeeListContainerDTO MaptoEmployeeListContainerDto(List<Employee> employee) {

		EmployeeListContainerDTO employeeListContainerDTO = new EmployeeListContainerDTO();
		employeeListContainerDTO.setEmployees(employee);

		return employeeListContainerDTO;

	}
	

	@GetMapping(value = "/validate")
	public String validate() {
		return "server is up and running";
	}

}
