package JAVA_Revision.revision.datatypes;

public class StringExammple {
   public static void main(java.lang.String[] args) {

        int a = 3;

        java.lang.String str1 = "HEllo";
        java.lang.String str2 = "HEllo";
        java.lang.String str3 = new java.lang.String("Hello");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
    }
}
