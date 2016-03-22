package hello;

public class Greeting {

    private final long id;
    private String greetingContent;
    private String name;

    public Greeting() {
        this.id = 0;
    }

    public Greeting(long id) {
        this.id = id;
    }

    public Greeting(long id, String greetingContent, String name) {
        this.id = id;
        this.greetingContent = greetingContent;
        this.name = name;
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

    @Override
    public String toString() {
        return String.format(
                "Greeting[id=%s, greetingContent='%s', name='%s']",
                id, greetingContent, name);
    }

}
