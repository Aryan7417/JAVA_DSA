public class interfacess {

    public static void main(String[] args) {

        Car ca = new FuleCar();

        ca.start();
        ca.accelerate();
        ca.breaks();
    }
}

interface Car {
    void start();

    void accelerate();

    void breaks();
}

class FuleCar implements Car {

    @Override
    public void start() {
        System.out.println("Fule car has started");
    }

    @Override
    public void accelerate() {
        System.out.println("Fule car has Accelerated 12/hr");
    }

    @Override
    public void breaks() {
        System.out.println("Fule car has stoped");
    }
}

class ElectricCar implements Car {

    @Override
    public void start() {
        System.out.println("ElectricFule car has started");
    }

    @Override
    public void accelerate() {
        System.out.println("ElectricFule car has Accelerated 12/hr");
    }

    @Override
    public void breaks() {
        System.out.println("ElectricFule car has stoped");
    }
}
