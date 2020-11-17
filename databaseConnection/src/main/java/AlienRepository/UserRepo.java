package AlienRepository;

import java.util.List;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;



@Repository 
public interface UserRepo extends JpaRepositoryImplementation<User, Integer> {

	//Object findByEname(String ename);

	Object findByename(String ename);
	
	
}
