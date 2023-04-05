package com.example.demo.repertoire;

import com.example.demo.modele.Hotel;
import com.example.demo.modele.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepertoireReservation extends JpaRepository<Reservation,Integer>{
    List<Reservation> findAll();

}


