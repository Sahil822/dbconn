package AlienRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {
	
	@Autowired
	UserRepo repo;
	
//	@RequestMapping("/sahil1/{aid}")
//	@ResponseBody
//	public String Hello2(@PathVariable int aid)
//	{
//	  return repo.findById(aid).toString();
//	}
	
	@RequestMapping("/hello")
	@ResponseBody
	public String helloWorld()
	{
		return "Hello World";
	}
	
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	
	@PostMapping("/add")
	public String add(@ModelAttribute("a1") User user)
	{
		repo.save(user);
		return "add";
	}
	
	@RequestMapping("/id")
	public String fetchbyid(@RequestParam("id") int id,Model m)
	{
		m.addAttribute("result",repo.findById(id));
		return "show";
	}
	
	@RequestMapping("/name")
	public String fetchbyname(@RequestParam("ename") String ename,Model m)
	{
		m.addAttribute("result",repo.findByename(ename));
		return "show";
	}
	
	@RequestMapping("/dlid")
	public String deletebyid(@RequestParam("id") int id,Model m)
	{
		repo.deleteById(id);
		return "delete";
	}

	
	@RequestMapping("/update")
	public String update(@ModelAttribute("a1") User a)
	{
	    repo.save(a);  
		return "update";
	}
	
	@RequestMapping("/find")
	public String findAll(Model m)
	{
		m.addAttribute("result",repo.findAll());
		return "show";
	}
	
}
