package JavaProjeckten.UdemyJava.JavaUdemy;

public class mynumber {

    public static void main(String[] args) {

        int myFirstNumber = (5 + 10) + (10 * 2);
        int mySecoundNumber = 12;
        int myThirdNumber = 6;

        int mytotal = myFirstNumber + mySecoundNumber + myThirdNumber;
        System.out.println("My tottal ist:" + mytotal);

        int myMinIntValue = Integer.MIN_VALUE;
        System.out.println("Integer MIN VALUE : " + myMinIntValue);
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Max VALUE : " + myMaxIntValue);
        System.out.println("Size of Integer :" + Integer.SIZE);

        int myMinByteValue = Byte.MIN_VALUE;
        System.out.println("Byte MIN VALUE : " + myMinByteValue);
        int myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Max VALUE : " + myMaxByteValue);
        System.out.println(" Size of Byte : " + Byte.SIZE);

        int myMinShortValue = Short.MIN_VALUE;
        System.out.println("Short MIN VALUE : " + myMinShortValue);
        int myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Max VALUE : " + myMaxShortValue);
        System.out.println(" Size of Short : " + Short.SIZE);

        long myMinLongValue = Long.MIN_VALUE;
        System.out.println("Long MIN VALUE :" + myMinLongValue);
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println(" Long MAX VALUE :" + myMaxLongValue);
        System.out.println("Size of Long ist :" + Long.SIZE);

        float myOtherFloatValue = (float) 5.25;
        System.out.println("Float Number use (Float) casting : " + myOtherFloatValue);
        float myFloatNumber = 5.25f;
        System.out.println("Float f sofix after value : " + myFloatNumber);

        {
            int myIntValue = 5;
            float myFloatValue = 5.0f;
            double myDoubleValue = 5.0d;

            myIntValue = 5 / 2;
            System.out.println("5 / 2 : " + myIntValue);
            myFloatValue = 5f / 2f;
            System.out.println("5f / 2F : " + myFloatValue);
            myDoubleValue = 5d / 2d;
            System.out.println("5d / 2d : " + myDoubleValue);
            myIntValue = 5 / 3;
            System.out.println("5 / 3 : " + myIntValue);
            myFloatValue = 5f / 3f;
            System.out.println("5f / 3f : " + myFloatValue);
        }

    }

}
