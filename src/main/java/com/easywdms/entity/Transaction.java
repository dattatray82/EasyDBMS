package com.easywdms.entity;
/**
 * 
 * author name:-Dattatray  Bharde
 *  
 */
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "iclock_transaction")
public class Transaction {

    @Id
    private Long id;

    @Column(name = "emp_id_in_device")
    private Integer employeeIdInDevice;

    @Column(name = "actual_punch_on_device")
    private LocalDateTime actualPunchOnDevice;

    @Column(name = "punch_state_on_device")
    private String punchStateOnDevice;

    @Column(name = "verification_done_on_device")
    private String verificationDoneOnDevice;

    @Column(name = "device_sn")
    private String deviceSerialNumber;

    @Column(name = "device_name")
    private String deviceName;

    @Column(name = "area_name")
    private String areaName;

    @Column(name = "punch_uploaded_on_software")
    private LocalDateTime punchUploadedOnSoftware;

    @Column(name = "emp_id_from_personal_table")
    private Long employeeIdFromPersonalTable;

    private String terminal;

    @Column(name = "company_id")
    private String companyId;

    @Column(name = "detection_with_mark")
    private Boolean detectionWithMark;

    @Column(name = "temperature_value")
    private Double temperatureValue;
    
    // getter and setter method.

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getEmployeeIdInDevice() {
		return employeeIdInDevice;
	}

	public void setEmployeeIdInDevice(Integer employeeIdInDevice) {
		this.employeeIdInDevice = employeeIdInDevice;
	}

	public LocalDateTime getActualPunchOnDevice() {
		return actualPunchOnDevice;
	}

	public void setActualPunchOnDevice(LocalDateTime actualPunchOnDevice) {
		this.actualPunchOnDevice = actualPunchOnDevice;
	}

	public String getPunchStateOnDevice() {
		return punchStateOnDevice;
	}

	public void setPunchStateOnDevice(String punchStateOnDevice) {
		this.punchStateOnDevice = punchStateOnDevice;
	}

	public String getVerificationDoneOnDevice() {
		return verificationDoneOnDevice;
	}

	public void setVerificationDoneOnDevice(String verificationDoneOnDevice) {
		this.verificationDoneOnDevice = verificationDoneOnDevice;
	}

	public String getDeviceSerialNumber() {
		return deviceSerialNumber;
	}

	public void setDeviceSerialNumber(String deviceSerialNumber) {
		this.deviceSerialNumber = deviceSerialNumber;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public LocalDateTime getPunchUploadedOnSoftware() {
		return punchUploadedOnSoftware;
	}

	public void setPunchUploadedOnSoftware(LocalDateTime punchUploadedOnSoftware) {
		this.punchUploadedOnSoftware = punchUploadedOnSoftware;
	}

	public Long getEmployeeIdFromPersonalTable() {
		return employeeIdFromPersonalTable;
	}

	public void setEmployeeIdFromPersonalTable(Long employeeIdFromPersonalTable) {
		this.employeeIdFromPersonalTable = employeeIdFromPersonalTable;
	}

	public String getTerminal() {
		return terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public Boolean getDetectionWithMark() {
		return detectionWithMark;
	}

	public void setDetectionWithMark(Boolean detectionWithMark) {
		this.detectionWithMark = detectionWithMark;
	}

	public Double getTemperatureValue() {
		return temperatureValue;
	}

	public void setTemperatureValue(Double temperatureValue) {
		this.temperatureValue = temperatureValue;
	}

	public Transaction(Long id, Integer employeeIdInDevice, LocalDateTime actualPunchOnDevice,
			String punchStateOnDevice, String verificationDoneOnDevice, String deviceSerialNumber, String deviceName,
			String areaName, LocalDateTime punchUploadedOnSoftware, Long employeeIdFromPersonalTable, String terminal,
			String companyId, Boolean detectionWithMark, Double temperatureValue) {
		super();
		this.id = id;
		this.employeeIdInDevice = employeeIdInDevice;
		this.actualPunchOnDevice = actualPunchOnDevice;
		this.punchStateOnDevice = punchStateOnDevice;
		this.verificationDoneOnDevice = verificationDoneOnDevice;
		this.deviceSerialNumber = deviceSerialNumber;
		this.deviceName = deviceName;
		this.areaName = areaName;
		this.punchUploadedOnSoftware = punchUploadedOnSoftware;
		this.employeeIdFromPersonalTable = employeeIdFromPersonalTable;
		this.terminal = terminal;
		this.companyId = companyId;
		this.detectionWithMark = detectionWithMark;
		this.temperatureValue = temperatureValue;
	}

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", employeeIdInDevice=" + employeeIdInDevice + ", actualPunchOnDevice="
				+ actualPunchOnDevice + ", punchStateOnDevice=" + punchStateOnDevice + ", verificationDoneOnDevice="
				+ verificationDoneOnDevice + ", deviceSerialNumber=" + deviceSerialNumber + ", deviceName=" + deviceName
				+ ", areaName=" + areaName + ", punchUploadedOnSoftware=" + punchUploadedOnSoftware
				+ ", employeeIdFromPersonalTable=" + employeeIdFromPersonalTable + ", terminal=" + terminal
				+ ", companyId=" + companyId + ", detectionWithMark=" + detectionWithMark + ", temperatureValue="
				+ temperatureValue + "]";
	}
    
    
    
}