package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Employee;
import com.example.entity.Payslip;

public interface PayslipRepository extends JpaRepository<Payslip, Long> {
	
}
