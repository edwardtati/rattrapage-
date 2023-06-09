package rattrapage.rattrapageSpring.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rattrapage.rattrapageSpring.api.dto.EtudiantClasseDto;
import rattrapage.rattrapageSpring.api.dto.EtudiantDto;
import rattrapage.rattrapageSpring.entities.Classe;
import rattrapage.rattrapageSpring.entities.Etudiant;
import rattrapage.rattrapageSpring.repositories.ClasseRepository;
import rattrapage.rattrapageSpring.repositories.EtudiantRepository;

import java.util.List;

@Service
public class EtudiantServiceImpl implements EtudiantService {

    @Autowired
    EtudiantRepository etudiantRepository;
    @Autowired
    ClasseRepository classeRepository;

    @Override
    public EtudiantDto saveEtudiant(EtudiantDto etudiant) {
        Etudiant etudiants=etudiant.toEntity();
        etudiantRepository.save(etudiants);
        etudiant.setId(etudiants.getId());
        return etudiant;
    }

    @Override
    public EtudiantClasseDto getEtudiantByClasse(String libelle) {
        Classe classe=classeRepository.findByLibelle(libelle);
        if (classe != null){
            //List<EtudiantDto> etudiantDtoList=etudiantRepository.getByClasse(classe.getLibelle()).stream().toList();
        }
        return null;
    }
}
