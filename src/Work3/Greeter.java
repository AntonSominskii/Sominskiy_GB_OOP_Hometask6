package Work3;

public class Greeter {
    private GreetingStrategy greetingStrategy = new DefaultGreeting(); // Используем стратегию по умолчанию

    public void setGreetingStrategy(GreetingStrategy greetingStrategy) {
        this.greetingStrategy = greetingStrategy;
    }

    public String greet() {
        return greetingStrategy.greet();
    }
}