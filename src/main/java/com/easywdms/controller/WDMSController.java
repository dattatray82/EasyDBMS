package com.easywdms.controller;
/**
 * 
 * author name:-Dattatray Bharde
 *  
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.easywdms.entity.Device;
import com.easywdms.entity.Employee;
import com.easywdms.entity.Transaction;
import com.easywdms.repo.DeviceRepository;
import com.easywdms.repo.EmployeeRepository;
import com.easywdms.repo.TransactionRepository;

@RestController
@RequestMapping("/api/wdms")
public class WDMSController {

	@Autowired
    private final DeviceRepository deviceRepository;
	@Autowired
    private final TransactionRepository transactionRepository;
	@Autowired
    private final EmployeeRepository employeeRepository;

    public WDMSController(DeviceRepository deviceRepository, TransactionRepository transactionRepository,
                          EmployeeRepository employeeRepository) {
        this.deviceRepository = deviceRepository;
        this.transactionRepository = transactionRepository;
        this.employeeRepository = employeeRepository;
    }
    
    

    // Device Endpoints
    @GetMapping("/Alldevices")
    public List<Device> getAllDevices() {
        return deviceRepository.findAll();
    }

    @PostMapping("/savedevices")
    public Device createDevice(@RequestBody Device device) {
        return deviceRepository.save(device);
    }

    // Transaction Endpoints
    @GetMapping("/transactions")
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    @PostMapping("/savetransactions")
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    // Employee Endpoints
    @GetMapping("/saveemployees")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }
}
