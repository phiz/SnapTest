package hello;

public class Greeting {

    private long id;
    private String greetingContent;
    private String name;

    public Greeting() {
    }

    public Greeting(long id) {
        this.id = id;
    }

    public Greeting(long id, String name, String greetingContent) {
        this.id = id;
        this.name = name;
        this.greetingContent = greetingContent;
    }

    public long getId() {
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

}
