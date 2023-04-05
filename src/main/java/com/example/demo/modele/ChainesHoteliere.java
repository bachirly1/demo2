package com.example.demo.modele;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Entity
@Table(name="chaines_hotelieres")
@Data
@NoArgsConstructor
public class ChainesHoteliere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idChaine;

    @Column(name="adresseBureaux")
    private String adresseBureaux;

    @Column(name ="adresseMail")
    private  String adresseMail;

    @Column(name="telephone")
    private Integer telephone;

    @Column(name="nom")
    private String nom;

    @JoinColumn (name="idHotel",nullable = false)
    private Hotel hotel;

    @Column(name = "nombreHotel")
    private Integer nombreHotel;

    public Integer getIdChaine() {
        return idChaine;
    }
}
