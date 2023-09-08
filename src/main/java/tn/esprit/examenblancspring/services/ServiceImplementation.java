package tn.esprit.examenblancspring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.examenblancspring.entities.Apprenant;
import tn.esprit.examenblancspring.entities.DetailFormation;
import tn.esprit.examenblancspring.entities.Formateur;
import tn.esprit.examenblancspring.entities.Formation;
import tn.esprit.examenblancspring.repositories.ApprenantRepo;
import tn.esprit.examenblancspring.repositories.DetailRepo;
import tn.esprit.examenblancspring.repositories.FormateurRepo;
import tn.esprit.examenblancspring.repositories.FormationRepo;

@Service
public class ServiceImplementation implements IService{

    @Autowired
    FormateurRepo formateurRepo;

    @Autowired
    ApprenantRepo apprenantRepo;

    FormationRepo formationRepo;
    DetailRepo detailRepo;



    @Override
    public Formateur ajouterFormateur(Formateur formateur) {
        return formateurRepo.save(formateur);
    }

    @Override
    public Apprenant ajouterApprenant(Apprenant apprenant) {
        return apprenantRepo.save(apprenant);
    }

    @Override
    public Formateur updateTarifFormateur(int idFormateur, int tarif) {
        Formateur formateur = formateurRepo.findById(idFormateur).orElse(null);
        formateur.setTarifHoraire(tarif);
        return formateur;
    }

    @Override
    public Integer getRevenuByFormation(Integer idFormation) {
       Formation formation = formationRepo.findById(idFormation).orElse(null);


        return  (formation.getApprenants().size())*(formation.frais);
    }

    @Override
    public void affecterApprenantFormation(Integer idApprenant, Integer idFormation) {
        Formation formation = formationRepo.findById(idFormation).orElse(null);
        Apprenant apprenant = apprenantRepo.findById(idApprenant).orElse(null);

        if(formation.getNbrMaxParticipant() > formation.getApprenants().size()) {
            formation.getApprenants().add(apprenant);
            formationRepo.save(formation);
        }
    }

    @Override
    public Formation affecterFormateurToFormation(Integer idFormateur, Integer IdFormation) {
       Formateur formateur = formateurRepo.findById(idFormateur).orElse(null);
       Formation formation = formationRepo.findById(IdFormation).orElse(null);
       formation.setFormateur(formateur);
       return formationRepo.save(formation);

    }

    @Override
    public Formation ajouterFormation(Formation formation) {
         return formationRepo.save(formation);

    }
}
