import javax.print.DocFlavor.STRING;

public class contructor {
    public static void main(String[] args) {
        Innercontructor s1 = new Innercontructor("ksnds", 23, 34, "LODA LKUSN COLLGAE");

        // ------------------------------- default-----------------------------

        // s1.name = "Atuan";
        // s1.college = "jss collage";
        // s1.age = 23;
        // s1.rollNumber = 363;

        // ---------------Constructore----------------

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);

        // int x;// local variable --> NO default values
        // System.out.println(x)
    }
}

class Innercontructor {

    String name;
    int age;
    int rollNumber;
    String college;

    Innercontructor() {
        name = "Aryan YAdav";
        age = 20;
        rollNumber = 23;
        college = "jss academy collage";
        
    }
    //-------------parameterized constructor-----------

    Innercontructor(String n, int a, int rn, String c) {
        name = n;
        age = a;
        rollNumber = rn;
        college = c;
    
    }
}