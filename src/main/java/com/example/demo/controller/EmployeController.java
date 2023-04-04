package com.example.demo.controller;

import com.example.demo.modele.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.EmployeService;

import java.util.List;

@RestController
@RequestMapping("/employe")

public class EmployeController {

    @Autowired
    private EmployeService employeeService;

    @GetMapping("/list")
    public List<Employe> getAllEmployees() {
        System.out.println("maye seu pape");
        return employeeService.getAllEmployees();
    }

    @PostMapping("/ajouter")
    public Employe createEmployee(@RequestBody Employe employee) {
        return employeeService.saveEmploye(employee);
    }
}