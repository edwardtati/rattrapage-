package rattrapage.rattrapageSpring.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rattrapage.rattrapageSpring.api.dto.EtudiantClasseDto;
import rattrapage.rattrapageSpring.api.dto.EtudiantDto;
import rattrapage.rattrapageSpring.api.service.EtudiantServiceImpl;
import rattrapage.rattrapageSpring.repositories.EtudiantRepository;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/inscription")
public class EtudiantRestController {

    @Autowired
    EtudiantRepository etudiantRepository;
    @Autowired
    EtudiantServiceImpl etudiantService;

    @GetMapping("")
    @ResponseBody
    public ResponseEntity<List<EtudiantDto>> getAllEtudiant(){

        List<EtudiantDto> etudiants=etudiantRepository.findAll()
                .stream()
                .map(etudiant -> new EtudiantDto(etudiant))
                .collect(Collectors.toList());
        return  new ResponseEntity<>(etudiants, HttpStatus.OK);
    }

    @GetMapping("/classe/{libelle}")
    @ResponseBody
    public ResponseEntity<EtudiantClasseDto> getEtudiantByClasse(@PathVariable("libelle")String libelle){
        EtudiantClasseDto etudiantClasse= etudiantService.getEtudiantByClasse(libelle);
        return new ResponseEntity<>(etudiantClasse, HttpStatus.OK);
    }
}
