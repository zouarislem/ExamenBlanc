package tn.esprit.examenblancspring.services;

import org.springframework.stereotype.Service;
import tn.esprit.examenblancspring.entities.Apprenant;
import tn.esprit.examenblancspring.entities.Formateur;
import tn.esprit.examenblancspring.entities.Formation;


public interface IService  {
    public Formateur ajouterFormateur(Formateur formateur);
    public Apprenant ajouterApprenant (Apprenant apprenant);
    public Formateur updateTarifFormateur(int idFormateur, int tarif);
    public Integer getRevenuByFormation(Integer idFormation);
    public void affecterApprenantFormation (Integer idApprenant, Integer idFormation);
    public Formation affecterFormateurToFormation (Integer idFormateur, Integer IdFormation);
    public Formation ajouterFormation (Formation formation);



}
