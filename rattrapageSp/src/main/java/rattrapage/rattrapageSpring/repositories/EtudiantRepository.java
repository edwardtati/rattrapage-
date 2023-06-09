package rattrapage.rattrapageSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rattrapage.rattrapageSpring.entities.Classe;
import rattrapage.rattrapageSpring.entities.Etudiant;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

    List<Etudiant> getByClasse(Classe classe);
}
