package com.example.demo.modele;
import lombok.Data;
<<<<<<< HEAD
import jakarta.persistence.*;
=======
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import org.springframework.data.relational.core.sql.In;
>>>>>>> origin/master

@Entity
@Table(name="hotel")
@Data

public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHotel;

    @Column(name = "nom")
    private String nom;

    @Column(name="nombreEtoile")
    private Short nombreEtoile;

    @Column(name="adresse")
    private String adresse;

    @Column(name="téléphone")
    private Integer téléphone;

    @JoinColumn(name="idEmploye",nullable = false)
    private Employe Employe;

    @JoinColumn(name="numeroChambre",nullable = false)
    private Chambre chambre;

    @JoinColumn(name ="idClient",nullable = false)
<<<<<<< HEAD
    private Clients client;
=======
    private Client client;
>>>>>>> origin/master


    public Integer getIdHotel() {
        return idHotel;
    }


}
