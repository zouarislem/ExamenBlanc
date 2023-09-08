package tn.esprit.examenblancspring.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Formateur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idFormateur;
    public String nom;
    public int tarifHoraire;
    public String mail;

    @OneToMany(mappedBy = "formateur")
    public List<Formation> formations;

}
