package runner;
import car.Car;
import Storage.CarsStorage;
import Storage.FileCarsStorage;

class Runner {
    public static void main(String[] args) {
        CarsStorage carsStorage = new FileCarsStorage("src/resources/input.txt",
                "src/resources/output.txt");

        Car[] cars = carsStorage.readCars();

        carsStorage.writeCars(cars);

        }
    }
