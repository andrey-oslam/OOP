package car;

public class BMW extends Lada {
    String color;

    public BMW(int priceOfAuto, double fuelConsumption, double maxSpeed, String carClass, String color) {
        super(priceOfAuto, fuelConsumption, maxSpeed, carClass);
        this.color = color;
    }

    @Override
    public String toString() {
        return "BMW, " + priceOfAuto +", " +
                + fuelConsumption + ", "  +
                maxSpeed + ", " + carClass + ", " +
                color;
    }
}
