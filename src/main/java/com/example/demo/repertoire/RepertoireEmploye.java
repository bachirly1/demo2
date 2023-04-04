package com.example.demo.repertoire;

import com.example.demo.modele.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface RepertoireEmploye extends JpaRepository<Employe, Integer> {
    List<Employe> findAll();

}
