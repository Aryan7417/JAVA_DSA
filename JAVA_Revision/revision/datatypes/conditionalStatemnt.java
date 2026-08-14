package JAVA_Revision.revision.datatypes;

public class conditionalStatemnt {
    public static void main(String[] args) {
        boolean isSunnt = true;
        boolean isWarm = true;

        if (isSunnt && isWarm) {
            System.out.println("beach day");
        } else if (isSunnt) {
            System.out.println("wear jacket and then go to becth ");
        } else {
            System.err.println("gahr mai regio ");
        }

        System.out.println("-------switch case-------");

        int day = 2;
        String dayname = null;
        switch (day) {
            case 1:
                dayname = "monday";

                break;

            case 2:
                dayname = "Tuesday";

                break;

            case 3:
                dayname = "wednesday";

                break;

            case 4:
                dayname = "Thrusday";

                break;

            default:
                System.out.println("enter valid value");

        }

        System.out.println(dayname);

        // Terneay operator

        // result =(condition) ? valueTrue : ValueFalse

        int a = 3;
        String isEvame = a % 2 == 0 ? "Even" : "ODD";
        System.out.println(isEvame);

    }

}
