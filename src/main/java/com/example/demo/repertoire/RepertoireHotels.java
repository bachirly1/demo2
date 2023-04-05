package com.example.demo.repertoire;

import com.example.demo.modele.Employe;
import com.example.demo.modele.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepertoireHotels  extends JpaRepository  <Hotel,Integer>{
    List<Hotel> findAll();
}
