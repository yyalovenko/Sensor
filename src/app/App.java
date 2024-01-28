package app;

public class App {
    public static void main(String[] args) {

        Subject subject = new Subject(new Substance());
        System.out.println("Initial substance data: ");
        subject.getState();
        subject.setState(3);
        subject.setState(-3);
        subject.setState(-4);
    }
}
