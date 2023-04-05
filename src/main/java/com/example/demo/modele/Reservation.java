package com.example.demo.modele;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Entity
@Table(name="reservation")
@Data
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReservation;

    @ManyToOne
    @JoinColumn(name="numeroChambre",nullable = false)
    private Chambre chambre;


    @ManyToOne
    @JoinColumn (name = "idClient",nullable = false)
<<<<<<< HEAD
    private Clients client;
=======
    private Client client;
>>>>>>> origin/master

    public Integer getIdReservation() {
        return idReservation;
    }
}
