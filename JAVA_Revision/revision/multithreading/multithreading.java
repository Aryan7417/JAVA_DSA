package JAVA_Revision.revision.multithreading;

public class multithreading {
    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();

        long sum = 0;
        for (int i = 1; i <= 1000000000; i++) {

            sum += i;
        }
        System.out.println("sum : =" + sum);

        int count = 0;
        for (int i = 1; i <= 500000; i++) {
            if (i % 10 == 7) {
                count++;
            }
        }

        System.out.println("count :" + count);
        System.out.println("Time takeen :" + (System.currentTimeMillis() - starttime) + "ms");
    }

}
