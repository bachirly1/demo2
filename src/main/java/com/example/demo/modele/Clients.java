package com.example.demo.modele;

import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Entity
@Table(name="clients")
@Data
@NoArgsConstructor
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClient;

    @Column(name = "nom")
    private String nom;

    @Column(name="adresse")
    private  String adresse;

    @Column(name ="NAS")
    private Integer nas;

    public Integer getIdClient() {
        return idClient;
    }
}
