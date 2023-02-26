package JavaProjeckten.UdemyJava.JavaUdemy;

public class poundstokilo {

    public static void main(String[] args) {
        /*
         * Diesse Program Convert pounts to kilogram
         */

        double pound = Double.parseDouble(args[0]);
        double converttokilo = (pound * 0.45359d); // we do not nit d sofix weil variable ist double
        System.out.println(pound + " pound convertet to killo ist : " + converttokilo + " killogram");

    }
}
