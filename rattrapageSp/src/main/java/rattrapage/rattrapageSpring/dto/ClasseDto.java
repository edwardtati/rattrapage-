package rattrapage.rattrapageSpring.dto;

import lombok.*;
import rattrapage.rattrapageSpring.entities.Classe;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClasseDto {

    private Long idClasse;
    private String libelle;
    private String filiere;
    private String niveau;

}
