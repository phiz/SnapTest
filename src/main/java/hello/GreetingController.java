package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class GreetingController {

	@Autowired
	private GreetingRepository repository;

    @RequestMapping("/greetings")
    public List<Greeting> greeting() {
        return repository.findAll();
    }

    @RequestMapping("/greetingbyid")
    public Greeting greetingById(@RequestParam(value="id") String id) {
        return repository.findById(id);
    }

    @RequestMapping("/greetingsbyname")
    public List<Greeting> greetingByName(@RequestParam(value="name") String name) {
        return repository.findByName(name);
    }

    @RequestMapping("/greetingsbygreeting")
    public List<Greeting> greetingByGreeting(@RequestParam(value="greeting") String greetingContent) {
        return repository.findByGreetingContent(greetingContent);
    }


}
