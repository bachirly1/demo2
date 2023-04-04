package com.example.demo.service;

import com.example.demo.modele.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repertoire.RepertoireEmploye;

import java.util.List;

@Service
public class EmployeService {

    @Autowired
    private RepertoireEmploye employeeRepository;

    public List<Employe> getAllEmployees() {
        return employeeRepository.findAll();
    }


    public Employe saveEmploye(Employe employee) {
        return employeeRepository.save(employee);


    }
}