public class Demo {
    public static void main(String[] args) {
        Stdendt sc = new Stdendt();
        sc.marksAttendance();
        
    }
}


class Stdendt {
    String name;
    int age;

    void marksAttendance(){
        System.out.println("Attandance marked");
    }
}

class EngineeringStudent extends Stduent {
    void attendLab(){
        System.out.println("lab attendance");
    }
}