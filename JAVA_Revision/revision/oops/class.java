package JAVA_Revision.revision.oops;

public class Class {

    class Car {
        String color;
        int speed;

        void drive() {
            System.out.println("car is driving");
        }

    }

    public static void main(String[] args) {
        Class obj = new Class();
        Car car = obj.new Car();

        car.color   = "red";
        car.speed   = 100;

        System.out.println(car.color);
        System.out.println(car.speed);
    }

    
}
