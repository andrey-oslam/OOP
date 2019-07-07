package car;
public class Lexus extends BMW {
    //Водитель (женщина/мужщина)
    String driver;

    public Lexus(int priceOfAuto, double fuelConsumption, double maxSpeed, String carClass, String color, String driver) {
        super(priceOfAuto, fuelConsumption, maxSpeed, carClass, color);
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Lexus, " + priceOfAuto + ", " + fuelConsumption  +
                ", " + maxSpeed + ", " + carClass + ", " + color +
                ", " + driver;
    }
}
