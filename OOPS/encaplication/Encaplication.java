
public class Encaplication {

    public static void main(String[] args) {
        balanche ba = new balanche();
        ba.deposit(500);
        ba.withdraw(200);
        System.out.println(ba.getbalance());

    }

}

 class balanche{
        private double showbalance;
       
       
        public   void deposit(int amount){
            showbalance +=amount;

        }

        public  void withdraw(int amount){
            showbalance -= amount;
        }
        public double getbalance(){
            
            return showbalance;
        }

    }


class Student{
    private String name;
    private int rollno;
    private  int age ;
    private  String collage ;
    



    Student(String name ,int rollno,int age ,String collage){
        this.name = name;
        this.rollno =rollno ;
        this.age = age;
        this.collage = collage;
    }

    public  String getcollage() {
    
        return  collage;
    }


    public String setCollage(String collage){
        this.collage = collage;
        return  collage;
    }

}