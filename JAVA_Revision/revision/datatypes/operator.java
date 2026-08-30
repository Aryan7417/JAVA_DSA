package JAVA_Revision.revision.datatypes;

public class operator {
    public static void main(String[] args) {

        // Arthementic operator

        int a = 34 + 43;
        int b = 36 - 34;
        int c = 45 * 4;
        int d = 10 / 3;

        System.out.println(a);

        // incremnet Operator

        a++;

        System.out.println(a);

        // decriminet operarator

        // bnineray operator

        System.out.println(Integer.toBinaryString(a));

        // bitwise operator

        int f = 5;
        int g = 3;

        System.out.println(f & g);

        System.out.println(f);

        // // Rational Operator
        System.out.println("--------------");

        System.out.println(23 < 89);
        System.out.println(2 == 3);

        // Logical Operator

        System.out.println(1 != 2 && 1 < 2);

        // OR operator
        boolean isWarm = true;
        boolean isSunney = false;
        boolean isGoodWeather = isSunney || isWarm;
        System.out.println(isGoodWeather);

        // AND operatotr
        boolean isWarms = true;
        boolean isSunneys = true;
        boolean isGoodWeathers = isSunneys && isWarms;
        System.out.println(isGoodWeathers);

        // NOT opeatyor

        boolean iswar = true;
        boolean isGoodWeatheree = !iswar;
        System.out.println(isGoodWeatheree);




        

    }

}
