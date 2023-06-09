package rattrapage.rattrapageSpring.api.dto;

import lombok.*;
import rattrapage.rattrapageSpring.entities.Classe;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClasseDto {

    private Long id;
    private String wording;
    private String branch;
    private String level;

    public ClasseDto(Classe classe){
        id= classe.getId();
        wording= classe.getLibelle();
        branch= classe.getFiliere();
        level= classe.getNiveau();
    }
}
