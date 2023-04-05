package com.example.demo.repertoire;

import com.example.demo.modele.Employe;
import com.example.demo.modele.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepertoireLocation extends JpaRepository<Location,Integer> {
    List<Location> findAll();
}
