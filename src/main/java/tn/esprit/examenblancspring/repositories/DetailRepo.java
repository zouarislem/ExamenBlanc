package tn.esprit.examenblancspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examenblancspring.entities.DetailFormation;

public interface DetailRepo extends JpaRepository<DetailFormation, Integer> {
}
