package com.easywdms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easywdms.entity.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {
  
}