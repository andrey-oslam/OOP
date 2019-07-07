package utils;

import car.Car;

import java.util.*;

public class TaxiStation {

    private Car[] cars;
    private List<Car> carsL;

    public TaxiStation(Car[] cars) {
        this.cars = cars;
    }

    public int calculateCost() {
        int cost = 0;

        for (Car car : cars) {
            cost += car.getPriceOfAuto();
        }

        return cost;
    }

    public void sortCarsByFuelConsumption() {
        for (int i = 0; i < cars.length; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[j].getFuelConsumption() < cars[i].getFuelConsumption()) {
                    Car temp = cars[j];
                    cars[j] = cars[i];
                    cars[i] = temp;
                }
            }
        }
    }

    public Car[] findCarsBySpeedRange(int minSpeed, int maxSpeed) {
        Car[] res = {};

        for (Car car : getCars()) {
            if (car.getMaxSpeed() >= minSpeed && car.getMaxSpeed() <= maxSpeed) {
                res = extendCarsArrayByNewCar(car, res);
            }
        }

        return res;
    }

    private Car[] extendCarsArrayByNewCar(Car carToAdd, Car[] cars) {
        if (cars.length == 0) {
            return new Car[] { carToAdd };
        } else {
            Car[] newCarsArr = new Car[cars.length + 1];

            for (int i = 0; i < cars.length; i++) {
                newCarsArr[i] = cars[i];
            }

            newCarsArr[cars.length] = carToAdd;
            return newCarsArr;
        }
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        String result = "";

        for (Car car : cars) {
            result += (car.toString() + "\n");
        }

        return result;
    }

}
