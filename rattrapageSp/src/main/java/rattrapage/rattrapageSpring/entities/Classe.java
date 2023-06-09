package rattrapage.rattrapageSpring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "classes")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Classe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    @Column(nullable = false, unique = true)
    private String libelle;
    @Column(nullable = false)
    private String filiere;
    @Column(nullable = false)
    private String niveau;

    @OneToMany(mappedBy = "classe", fetch = FetchType.LAZY)
    private List<Etudiant> etudiant;

    public Classe(Long id) {
        this.id = id;
    }

    public Classe(String libelle) {
        this.libelle = libelle;
    }
}
