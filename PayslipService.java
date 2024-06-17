package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.EmployeeRepository;
import com.example.Repository.PayslipRepository;
import com.example.entity.Payslip;

import java.util.List;
import java.util.Optional;

@Service
public class PayslipService {

    @Autowired
    private PayslipRepository payslipRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Payslip> getAllPayslips() {
        return payslipRepository.findAll();
    }

    public Optional<Payslip> getPayslipById(Long id) {
        return payslipRepository.findById(id);
    }

    public List<Payslip> getPayslipsByEmployeeId(Long employeeId) {
        return payslipRepository.findAll();
//                .filter(payslip -> payslip.getEmployee().getId().equals(employeeId))
//                .toList();
    }

    public Optional<Payslip> savePayslip(Payslip payslip) {
        return employeeRepository.findById(payslip.getEmployee().getId()).map(employee -> {
            payslip.setEmployee(employee);
            return payslipRepository.save(payslip);
        });
    }

    public Optional<Payslip> updatePayslip(Long id, Payslip payslipDetails) {
        return payslipRepository.findById(id).map(payslip -> {
            payslip.setDate(payslipDetails.getDate());
            payslip.setAmount(payslipDetails.getAmount());
            return payslipRepository.save(payslip);
        });
    }

    public boolean deletePayslip(Long id) {
        return payslipRepository.findById(id).map(payslip -> {
            payslipRepository.delete(payslip);
            return true;
        }).orElse(false);
    }
}

