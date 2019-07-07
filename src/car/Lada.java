package car;

public class Lada extends Car {
    String carClass;

    public Lada(int priceOfAuto, double fuelConsumption, double maxSpeed, String carClass) {
        super(priceOfAuto, fuelConsumption, maxSpeed);
        this.carClass = carClass;
    }

    @Override
    public String toString() {
        return "Lada, " + priceOfAuto + ", " +
                fuelConsumption + ", " + maxSpeed + ", " + carClass;
    }

}
