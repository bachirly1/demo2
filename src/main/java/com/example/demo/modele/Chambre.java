package com.example.demo.modele;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="chambres")
@Data
@NoArgsConstructor
public class Chambre {
    @Id
    private Integer numeroChambre;

    @Column(name="prix")
    private Integer prix;

    @Column(name="commodité")
    private String commodité;

    @Column(name="capacité")
    private Integer capacité;

    @Column(name="typeVue")
    private String typeVue;

    @Column(name = "typeExtension")
    private String typeExtension;

    @Column(name = "etat")
    private String etat;

    public Integer getIdChambre() {
        return numeroChambre;
    }
}
