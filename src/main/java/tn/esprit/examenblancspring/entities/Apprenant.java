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
public class Apprenant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idApprenant;
    public String nom;
    public String prenom;
    public int telephone;
    public String email;

    @ManyToMany(mappedBy = "apprenants")
    public List<Formation> foramtions;

}
