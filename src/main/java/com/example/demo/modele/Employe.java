package com.example.demo.modele;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Entity
@Table(name="employe")
@Data
@NoArgsConstructor
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEmploye;
    @Column(name="nom")
    private String nom;
    @Column(name="NAS")
    private Integer nas;
    @Column(name="poste")
    private String poste;
    @Column(name="adresse")
    private char adresse;


    public Integer getIdEmploye() {
        return idEmploye;
    }
}
