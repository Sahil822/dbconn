package AlienRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class RestControllerrrrrr {

	@Autowired
	AlienRepo repo;
	
	
	@GetMapping("/call")
	public String call()
	{
		return "hello RestController";
	}
	
	@GetMapping("/jspPage")
	public String jspPage1()
	{
		return "home1";
	}
	
	@GetMapping("/jpa/users")
	public List<Alien> retrieveAllUsers() {
		return repo.findAll();
	}
	
	@PostMapping("/jpa/users")
	public Alien createUser(@RequestBody Alien user) {
		return repo.save(user);	
	}
	
	@PutMapping("/jpa/users/{id}")
	public Alien updateUser(@PathVariable int id,@RequestBody Alien user) {
		return repo.save(user);
	}
	
	@DeleteMapping("/jpa/users/{id}")
	public void deleteUser(@PathVariable int id) {
		repo.deleteById(id);
	}
	
	@GetMapping("/jpa/users/{id}")
	public Optional<Alien> retrieveUser(@PathVariable int id) {
		return repo.findById(id);
	}
	
	@GetMapping("/jpa/users/{name}")
	public List<Alien> retrieveUserByName(@PathVariable String name) {
		return repo.findByAname(name);
	}
	
}
