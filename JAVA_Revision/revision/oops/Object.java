package JAVA_Revision.revision.oops;

public class Object {
     class Car {
        String color;
        int speed;

        void drive() {
            System.out.println("car is driving");
        }

    }
    public static void main(String[] args) {
        Class obj = new Class(); // this is a Object
        Car car = obj.new Car();

        car.color   = "red";
        car.speed   = 100;

        System.out.println(car.color);
        System.out.println(car.speed);
    }
    


    
}
