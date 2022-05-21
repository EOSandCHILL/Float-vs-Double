public class Main {
    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        /*A float = single precision = 32 bits = width of 32
         * A double = double precision = 64 bits = width of 64
         * This means the double is much more precise than the float
         * But it needs twice the memory to store the number*/

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3;
        double myDoubleValue = 5d / 3;

        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);
        System.out.println();

        System.out.println("Java Master Class Challenge:");

        System.out.println("Convert a given number of pounds (200lbs) to kilograms");

        double poundToKilogram = 1 * 0.45359237;
        double numberOfPounds = 200d;
        double numberOfKilograms = numberOfPounds * poundToKilogram;

        System.out.println("200 lbs/pounds converted to kilograms = " + numberOfKilograms + " kilograms");

    }
}

