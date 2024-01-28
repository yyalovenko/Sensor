package app;

public class Substance {

    String color;
    int weight;
    int temperature;

    public Substance() {
        this.color = Constants.WHITE;
        this.weight = Constants.DEFAULT_WEIGHT;
        this.temperature = Constants.ZERO_TEMPERATURE;
    }

    public String getColor () {
        return this.color;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void changeTemperature(int degree) {
        this.temperature += degree;
        this.handleState();
    }

    public void handleState() {
        if (this.temperature > Constants.ZERO_TEMPERATURE) {
            this.setColor(Constants.BLACK);
            setWeight(this.temperature * 2 + Constants.DEFAULT_WEIGHT);
        }

        this.setColor(Constants.WHITE);
        this.setWeight(Constants.DEFAULT_WEIGHT);
    }

    public String toString() {
        return "Color: " + this.getColor() + ", Temperature: " + this.getTemperature() +
                ", Weight: " + this.getWeight();
    }
}
