package rattrapage.rattrapageSpring.api.dto;

import lombok.*;
import rattrapage.rattrapageSpring.entities.Classe;
import rattrapage.rattrapageSpring.entities.Etudiant;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EtudiantDto {

    private Long id;
    private String fullName;
    private String number;
    private String email;
    private String tutor;
    private ClasseDto classe;

    public EtudiantDto(Etudiant etudiant){
        id=etudiant.getId();
        fullName=etudiant.getNomComplet();
        number= etudiant.getMatricule();
        email=etudiant.getEmail();
        tutor=etudiant.getTuteur();
    }

    public Etudiant toEntity(){
        return new Etudiant(null,
                            fullName,
                            number,
                            email,
                            tutor,
                            new Classe(classe.getId()));
    }

}
