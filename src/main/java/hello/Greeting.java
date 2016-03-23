package hello;

import org.springframework.data.annotation.Id;


public class Greeting {

    @Id
    private String id;

    private String greetingContent;
    private String name;

    public Greeting() {
    }


    public Greeting(String greetingContent, String name) {
        this.greetingContent = greetingContent;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getGreetingContent() {
        return greetingContent;
    }

    public void setGreetingContent(String greetingContent) {
        this.greetingContent = greetingContent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(
                "Greeting[id=%s, greetingContent='%s', name='%s']",
                id, greetingContent, name);
    }

}
