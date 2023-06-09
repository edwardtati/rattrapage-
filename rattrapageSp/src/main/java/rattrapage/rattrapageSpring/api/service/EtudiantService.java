package rattrapage.rattrapageSpring.api.service;

import rattrapage.rattrapageSpring.api.dto.EtudiantClasseDto;
import rattrapage.rattrapageSpring.api.dto.EtudiantDto;

public interface EtudiantService {

    EtudiantDto saveEtudiant(EtudiantDto etudiant);
    EtudiantClasseDto getEtudiantByClasse(String libelle);
}
