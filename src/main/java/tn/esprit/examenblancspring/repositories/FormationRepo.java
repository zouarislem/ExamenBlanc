package tn.esprit.examenblancspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examenblancspring.entities.Formation;

public interface FormationRepo extends JpaRepository<Formation, Integer> {
}
