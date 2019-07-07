package Storage;

import car.BMW;
import car.Car;
import car.Lada;
import car.Lexus;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.StringJoiner;

import static java.lang.Integer.*;

public class FileCarsStorage implements CarsStorage {
    private String inputFileName;
    private String outputFileName;

    public FileCarsStorage(String inputFileName, String outputFileName) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
    }

    public FileCarsStorage(String fileName) {
        this.inputFileName = fileName;
        this.outputFileName = fileName;
    }

    public Car[] readCars() {

        try (FileInputStream reader = new FileInputStream(inputFileName)) {
            String fileString = CreateString(reader);

            String[] carStrings = fileString.split(";" + System.lineSeparator());

            Car[] cars = new Car[carStrings.length];

            for (int i = 0; i < carStrings.length; i++) {
                String[] carProperties = carStrings[i].split(",");
                switch (carProperties[0]) {
                    case "Lada":
                        cars[i] = new Lada(Integer.parseInt(carProperties[1].trim()), Double.parseDouble(carProperties[2].trim()),
                                Double.parseDouble(carProperties[3].trim()), carProperties[4].trim());
                        break;
                    case "BMW":
                        cars[i] = new BMW(Integer.parseInt(carProperties[1].trim()), Double.parseDouble(carProperties[2].trim()),
                                Double.parseDouble(carProperties[3].trim()), carProperties[4].trim(),
                                carProperties[5].trim());
                        break;
                    case "Lexus":
                        cars[i] = new Lexus(Integer.parseInt(carProperties[1].trim()), Double.parseDouble(carProperties[2].trim()),
                                Double.parseDouble(carProperties[3].trim()), carProperties[4].trim(), carProperties[5].trim(),
                                carProperties[6].trim());
                   break;
                }
            }
            return cars;
        }catch (IOException e){
            e.printStackTrace();
        }
        return new Car[0];
    }

    private String CreateString(FileInputStream reader) throws IOException {
        byte[] fileBytes = new byte[reader.available()];
        reader.read(fileBytes);
        return new String(fileBytes);
    }

    public void writeCars(Car[] cars){
        try(FileOutputStream writer = new FileOutputStream(outputFileName)){
            StringJoiner sj = new StringJoiner(";" + System.lineSeparator());
            for (Car car : cars){
                sj.add(car.toString());
            }
            writer.write(sj.toString().getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}


