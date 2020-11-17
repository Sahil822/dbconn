package AlienRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@ComponentScan(basePackages="restController")
//@EnableJpaRepositories(basePackageClasses=AlienRepo.class)
public class Springbootapp {

	public static void main(String[] args) {
      SpringApplication.run(Springbootapp.class, args);
		
	}

}
