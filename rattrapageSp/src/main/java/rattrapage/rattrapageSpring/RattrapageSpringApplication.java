package rattrapage.rattrapageSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import rattrapage.rattrapageSpring.entities.Classe;
import rattrapage.rattrapageSpring.repositories.ClasseRepository;

@SpringBootApplication
public class RattrapageSpringApplication implements CommandLineRunner {

	@Autowired
	private ClasseRepository classeRepository;

	public static void main(String[] args) {
		SpringApplication.run(RattrapageSpringApplication.class, args);
	}



	@Override
	public void run(String... args) throws Exception {


	}
}
