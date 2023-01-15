import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;

import java.sql.SQLXML;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

            DriverB driverB = new DriverB("Иван", true, 5);
            PassengerCars cars = new PassengerCars("Tayota" , " Mark II", 2.5, 300,
                    280, " Механика ", "Седан", driverB);
            printInfo(cars);
            System.out.println(cars);
            cars.start();
            cars.getPitStop();
            cars.stop();
            cars.getBestLapTime();
            cars.getMaximumSpeed();
            System.out.println();


            DriverD driverD = new DriverD("Фёдор", true, 7);
            Autobuses bus = new Autobuses("Mercedes-Benz", "Travego M OM 457 LA", 8.0,
                    12.82,3.7, 1000, 12, driverD);
            printInfo(bus);
           System.out.println(bus);
           bus.start();
           bus.getPitStop();
           bus.stop();
           bus.getBestLapTime();
           bus.getMaximumSpeed();
           System.out.println();



            DriverC driverC = new DriverC("Анатолий", true, 3);
            Trucks trucks = new Trucks("Volvo" , "Wild Viking", 12.6, 158,
                    "1600-силовой турбодизель", "Дикий викинг", "Двух местный", driverC);
        printInfo(trucks);
        System.out.println(trucks);
        trucks.start();
        trucks.getPitStop();
        trucks.stop();
        trucks.getBestLapTime();
        trucks.getMaximumSpeed();

        }

    private static void printInfo(Transport<?> transport){
        System.out.println("Водитель " + transport.getDriver().getFio() + " управляет автомобилем " +
                transport.getStamp() + " " + transport.getModel() + " и будет участвовать в заезде");
    }
}