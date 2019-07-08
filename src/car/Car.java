package car;
public class Car  {
    int priceOfAuto;
    double fuelConsumption;
    double maxSpeed;

    public Car(int priceOfAuto, double fuelConsumption, double maxSpeed) {
        this.priceOfAuto = priceOfAuto;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }

    public int getPriceOfAuto() {
        return priceOfAuto;
    }

    public void setPriceOfAuto(int priceOfAuto) {
        this.priceOfAuto = priceOfAuto;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car, " + priceOfAuto + ", " + fuelConsumption +
                ", " + maxSpeed + ";";
    }
}
