public class Exception {
    public static void main(String[] args) {
        // int a = 2 / 0;
        // System.out.println(a);

        // error
        //main(args);

        // ======================

        // int a = 3;
        // int b = 0;
        // System.out.println("step1");
        // System.out.println(a / b);   // exception
        // System.out.println("step2");

 
        //-------------------------------------------------------------

        int a = 3;
        int b = 0;
        int c = 3;
        
        methodA(a,b);



    }

    private  static void methodA(int a,int b){
        methodB(a,b);
    }

   private  static void methodB(int a,int b){
        System.out.println(a/b);
    }

}
