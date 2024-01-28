package app;

public class Observer {

    public void update(Substance substance, int degree) {
        System.out.println("Temperature has been updated by " + degree + ". New substance data: ");
        System.out.println(substance + "\n");
    }
}
