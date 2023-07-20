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
@Table(name = "iclock_terminal")
public class Device {

    @Id
    private Long id;

    @Column(name = "serial_no")
    private String serialNo;

    private String alias;

    @Column(name = "fw_ver")
    private String firmwareVersion;

    @Column(name = "push_ver")
    private String pushVersion;

    @Column(name = "terminal_name")
    private String terminalName;

    private String platform;

    @Column(name = "user_count")
    private Integer userCount;

    @Column(name = "total_transaction")
    private Integer totalTransaction;

    @Column(name = "fp_count")
    private Integer fingerprintCount;

    @Column(name = "face_count")
    private Integer faceCount;

    @Column(name = "area_assign_to_device")
    private String areaAssignToDevice;

    @Column(name = "last_activity")
    private LocalDateTime lastActivity;
    
    /// getter and setter 

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getFirmwareVersion() {
		return firmwareVersion;
	}

	public void setFirmwareVersion(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
	}

	public String getPushVersion() {
		return pushVersion;
	}

	public void setPushVersion(String pushVersion) {
		this.pushVersion = pushVersion;
	}

	public String getTerminalName() {
		return terminalName;
	}

	public void setTerminalName(String terminalName) {
		this.terminalName = terminalName;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public Integer getUserCount() {
		return userCount;
	}

	public void setUserCount(Integer userCount) {
		this.userCount = userCount;
	}

	public Integer getTotalTransaction() {
		return totalTransaction;
	}

	public void setTotalTransaction(Integer totalTransaction) {
		this.totalTransaction = totalTransaction;
	}

	public Integer getFingerprintCount() {
		return fingerprintCount;
	}

	public void setFingerprintCount(Integer fingerprintCount) {
		this.fingerprintCount = fingerprintCount;
	}

	public Integer getFaceCount() {
		return faceCount;
	}

	public void setFaceCount(Integer faceCount) {
		this.faceCount = faceCount;
	}

	public String getAreaAssignToDevice() {
		return areaAssignToDevice;
	}

	public void setAreaAssignToDevice(String areaAssignToDevice) {
		this.areaAssignToDevice = areaAssignToDevice;
	}

	public LocalDateTime getLastActivity() {
		return lastActivity;
	}

	public void setLastActivity(LocalDateTime lastActivity) {
		this.lastActivity = lastActivity;
	}

	public Device(Long id, String serialNo, String alias, String firmwareVersion, String pushVersion,
			String terminalName, String platform, Integer userCount, Integer totalTransaction, Integer fingerprintCount,
			Integer faceCount, String areaAssignToDevice, LocalDateTime lastActivity) {
		super();
		this.id = id;
		this.serialNo = serialNo;
		this.alias = alias;
		this.firmwareVersion = firmwareVersion;
		this.pushVersion = pushVersion;
		this.terminalName = terminalName;
		this.platform = platform;
		this.userCount = userCount;
		this.totalTransaction = totalTransaction;
		this.fingerprintCount = fingerprintCount;
		this.faceCount = faceCount;
		this.areaAssignToDevice = areaAssignToDevice;
		this.lastActivity = lastActivity;
	}

	@Override
	public String toString() {
		return "Device [id=" + id + ", serialNo=" + serialNo + ", alias=" + alias + ", firmwareVersion="
				+ firmwareVersion + ", pushVersion=" + pushVersion + ", terminalName=" + terminalName + ", platform="
				+ platform + ", userCount=" + userCount + ", totalTransaction=" + totalTransaction
				+ ", fingerprintCount=" + fingerprintCount + ", faceCount=" + faceCount + ", areaAssignToDevice="
				+ areaAssignToDevice + ", lastActivity=" + lastActivity + "]";
	}

	public Device() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
}