package com.example.demo.repertoire;

import com.example.demo.modele.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepertoireClients extends JpaRepository<Clients , Integer> {
      List<Clients> findAll();
}
