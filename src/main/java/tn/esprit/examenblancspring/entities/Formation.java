package tn.esprit.examenblancspring.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Formation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int  idFormation;
    public String titre;
    @Enumerated(EnumType.STRING)
    public Niveau niveau;

    @Temporal(TemporalType.DATE)
    public Date dateDebut;
    @Temporal(TemporalType.DATE)
    public Date dateFin;
    public int nbrrHeures;
    public int nbrMaxParticipant;
    public int frais;

    @ManyToOne
    public Formateur formateur;

    @OneToOne
    public DetailFormation detailFormation;

     @ManyToMany
    public List<Apprenant> apprenants;

}
