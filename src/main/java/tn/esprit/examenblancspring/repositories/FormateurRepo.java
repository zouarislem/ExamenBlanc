package tn.esprit.examenblancspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examenblancspring.entities.Formateur;

public interface FormateurRepo extends JpaRepository<Formateur, Integer> {
}
