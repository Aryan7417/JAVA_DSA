//types of nheritance 
//simple inheritance 
//milti-level inheritance 
//hierarchical inheritance 
//multiple inheritancxe

public class Demo2 {

    public static void main(String[] args) {
        CSEStdent sc = new CSEStdent();
        sc.Atttand();
        sc.preent();

    }

}

class Student {
    String name;
    int age;

    void Atttand() {
        System.out.println("Attand class");
    }
}

class EngineeringStudent extends Student {
    void preent() {
        System.out.println("presnst student");
    }
}

class CSEStdent extends EngineeringStudent {
    vodi lab() {
        System.out.println("this is lab");
    }
}
