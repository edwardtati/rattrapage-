package rattrapage.rattrapageSpring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "etudiants")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    @Column(nullable = false)
    private String nomComplet;
    @Column(nullable = false)
    private String matricule;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String tuteur;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classe_id")
    private Classe classe;
}
