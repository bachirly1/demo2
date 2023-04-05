package com.example.demo.repertoire;

import com.example.demo.modele.Chambre;
import com.example.demo.modele.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepertoireChambre extends JpaRepository<Chambre,Integer> {
    List<Chambre> findAll();
}
