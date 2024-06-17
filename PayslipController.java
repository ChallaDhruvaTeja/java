package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.Service.PayslipService;
import com.example.entity.Payslip;

import java.util.List;

@RestController
@RequestMapping("/payslips")
public class PayslipController {

    @Autowired
    private PayslipService payslipService;

    @GetMapping
    public List<Payslip> getAllPayslips() {
        return payslipService.getAllPayslips();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Payslip> getPayslipById(@PathVariable Long id) {
        return payslipService.getPayslipById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/employee/{employeeId}")
    public List<Payslip> getPayslipsByEmployeeId(@PathVariable Long employeeId) {
        return payslipService.getPayslipsByEmployeeId(employeeId);
    }

    @PostMapping
    public ResponseEntity<Payslip> createPayslip(@RequestBody Payslip payslip) {
        return payslipService.savePayslip(payslip)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.badRequest().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Payslip> updatePayslip(@PathVariable Long id, @RequestBody Payslip payslipDetails) {
        return payslipService.updatePayslip(id, payslipDetails)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePayslip(@PathVariable Long id) {
        return payslipService.deletePayslip(id)
                ? ResponseEntity.ok().build()
                : ResponseEntity.notFound().build();
    }
}
