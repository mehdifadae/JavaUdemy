package JavaProjeckten.UdemyJava.JavaUdemy;

public class sum {

    public static void main(String[] args) {

        byte byteNumber = 100;
        short shortNumber = 450;
        int intNumber = 67900;
        long longNumber = 50000L + 10 + (10 * (byteNumber + shortNumber + intNumber));
        System.out.println("Sum of all Variablen ist : " + longNumber);

    }

}
