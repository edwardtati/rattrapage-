package rattrapage.rattrapageSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rattrapage.rattrapageSpring.entities.Classe;
import rattrapage.rattrapageSpring.entities.Etudiant;

import java.util.List;

public interface ClasseRepository extends JpaRepository<Classe, Long> {

    List<Classe> getByEtudiant(Etudiant etudiant);
    Classe findByLibelle(String libelle);
}
