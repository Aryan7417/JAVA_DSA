public class Abstaction {
    public static void main(String[] args) {
        Car c = new FuelCar();
        c.start();
        c.breaks();
        c.accelerat();

    }

}

abstract class Car {

    void start() {
        System.out.println("Car is starting");

    }

    
    abstract void accelerat();

    abstract void breaks();

}

class ElectricCar extends Car {
    @Override
    void accelerat() {
        System.out.println("ELECTRICcar is accelering in 10/hr");
    }

    void breaks() {
        System.out.println("ELECTRICcar is stoping");

    }
}

class FuelCar extends Car {
    void accelerat() {
        System.out.println("FUELCAR is accelering in 10/hr");
    }

    void breaks() {
        System.out.println("FUELCAR is stoping");

    }
}