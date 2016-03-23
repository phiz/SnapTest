package hello;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface GreetingRepository extends MongoRepository<Greeting, String> {

    public List<Greeting> findByGreetingContent(String greetingContent);
    public List<Greeting> findByName(String name);
    public Greeting findById(String id);

}