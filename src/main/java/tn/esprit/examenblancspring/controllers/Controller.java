package tn.esprit.examenblancspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examenblancspring.entities.Apprenant;
import tn.esprit.examenblancspring.entities.Formateur;
import tn.esprit.examenblancspring.entities.Formation;
import tn.esprit.examenblancspring.services.IService;

@RestController
@RequestMapping("/for")
public class Controller {

    @Autowired
    IService iService;

    @PostMapping("/AddFormateur")
    public Formateur addFormateur(@RequestBody Formateur formateur){
        return iService.ajouterFormateur(formateur);

    }


    @PostMapping("/AddApprenant")
    public Apprenant addApprenant(@RequestBody Apprenant apprenant){
        return iService.ajouterApprenant(apprenant);
    }

@PutMapping("/Tarif/{idFormateur}/{tarif}")
public Formateur UpdateTarif(@PathVariable ("idFormateur") int idFormateur, @PathVariable("tarif") int tarif){
    return iService.updateTarifFormateur(idFormateur,tarif);}


    @PostMapping("/formateurToformation/{idFormateur}/{IdFormation}")
public Formation affecterFormateurToFormation(@PathVariable("idFormateur") int a, @PathVariable("IdFormation") int b){
        return iService.affecterFormateurToFormation(a, b);
    }

/*

@PostMapping("/ApprForm/{idApprenant}/{idFormation}")
public void affecterApprenantFormation(@PathVariable("idApprenant") Integer idApprenant,@PathVariable("idFormation") Integer idFormation){
        iService.affecterApprenantFormation(idApprenant , idFormation);
}


@GetMapping("/revenu/idFormation")
    public Integer getRevenuByFormation(@PathVariable("idFormation") Integer idFormation){
        return iService.getRevenuByFormation(idFormation);
}
*/

    }

