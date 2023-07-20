package com.easywdms.entity;
/**
 * 
 * author name:-Dattatray  Bharde
 *  
 */
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "personal_employee")
public class Employee {

    @Id
    private Long id;

    @Column(name = "emp_code")
    private Integer employeeCode;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "device_password")
    private String devicePassword;

    @Column(name = "card_no")
    private String cardNumber;

    @Column(name = "employee_department")
    private String employeeDepartment;

    @Column(name = "emp_position")
    private String employeePosition;

    @Column(name = "company_id")
    private String companyId;

    @Column(name = "self_password")
    private String selfPassword;
    
    // getter and setter method..

	public Employee(Long id, Integer employeeCode, String firstName, String lastName, String devicePassword,
			String cardNumber, String employeeDepartment, String employeePosition, String companyId,
			String selfPassword) {
		super();
		this.id = id;
		this.employeeCode = employeeCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.devicePassword = devicePassword;
		this.cardNumber = cardNumber;
		this.employeeDepartment = employeeDepartment;
		this.employeePosition = employeePosition;
		this.companyId = companyId;
		this.selfPassword = selfPassword;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(Integer employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDevicePassword() {
		return devicePassword;
	}

	public void setDevicePassword(String devicePassword) {
		this.devicePassword = devicePassword;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public String getEmployeePosition() {
		return employeePosition;
	}

	public void setEmployeePosition(String employeePosition) {
		this.employeePosition = employeePosition;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getSelfPassword() {
		return selfPassword;
	}

	public void setSelfPassword(String selfPassword) {
		this.selfPassword = selfPassword;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeCode=" + employeeCode + ", firstName=" + firstName + ", lastName="
				+ lastName + ", devicePassword=" + devicePassword + ", cardNumber=" + cardNumber
				+ ", employeeDepartment=" + employeeDepartment + ", employeePosition=" + employeePosition
				+ ", companyId=" + companyId + ", selfPassword=" + selfPassword + "]";
	}

    
    
}


