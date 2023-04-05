package com.example.demo.repertoire;

import com.example.demo.modele.ChainesHoteliere;
import com.example.demo.modele.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepertoireChainesHoteliere extends JpaRepository<ChainesHoteliere,Integer> {
    List<ChainesHoteliere> findAll();
}
