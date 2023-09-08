package tn.esprit.examenblancspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examenblancspring.entities.Apprenant;

public interface ApprenantRepo extends JpaRepository<Apprenant,Integer>{
}
