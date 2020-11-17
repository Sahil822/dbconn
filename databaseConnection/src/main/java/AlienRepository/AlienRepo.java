package AlienRepository;

import java.util.List;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;



@Repository 
public interface AlienRepo extends JpaRepositoryImplementation<Alien, Integer> {

	List<Alien> findByAname(String name);

}
