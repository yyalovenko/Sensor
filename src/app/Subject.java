package app;

public class Subject {

    Observer observer;
    Substance substance;

    public Subject(Substance substance) {
        this.substance = substance;
        this.attach();
    }

    public void attach() {
        this.observer = new Observer();
    }

    public void getState() {
        System.out.println(this.substance + "\n");
    }

    public void setState (int degree) {
        this.substance.changeTemperature(degree);
        notifyObserver(degree);
    }

    public void notifyObserver(int degree) {
        this.observer.update(this.substance, degree);
    }

}
