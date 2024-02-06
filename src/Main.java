import Work3.FormalGreeting;
import Work3.Greeter;
import work1.Rectangle;
import work1.Square;

public class Main {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.setGreetingStrategy(new FormalGreeting());
        System.out.println(greeter.greet());

        Square square = new Square();
        square.setSide(5);
        System.out.println("Square area: " + square.getArea());

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(10);
        System.out.println("Rectangle area: " + rectangle.getArea());
    }
}