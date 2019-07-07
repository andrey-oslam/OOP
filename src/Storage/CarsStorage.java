package Storage;

import car.Car;

public interface CarsStorage {
    Car[] readCars();

    void writeCars(Car[] cars);
}
