package com.example.demo.modele;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Entity
@Table(name="location")
@Data
@NoArgsConstructor
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLocation;

    @JoinColumn(name = "idClient",nullable = false)
<<<<<<< HEAD
    private Clients client;
=======
    private Client client;
>>>>>>> origin/master

    @JoinColumn(name="numeroChambre",nullable = false)
    private Chambre chambre;

    public Integer getIdLocation() {
        return idLocation;
    }
}
