package uk.co.randomdave;

public class DecimalComparitor {
    public static void main(String[] args) {
        System.out.println("areEqualByThreeDecimalPlaces(-3.1756, -3.175) = " + areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println("areEqualByThreeDecimalPlaces(3.175, 3.176) = " + areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println("areEqualByThreeDecimalPlaces(3.0, 3.0) = " + areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println("areEqualByThreeDecimalPlaces(-3.123, 3.123) = " + areEqualByThreeDecimalPlaces(-3.123, 3.123));
        System.out.println("areEqualByThreeDecimalPlaces(3.174,3.175) = " + areEqualByThreeDecimalPlaces(3.174, 3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double secondNumber) {
        double diff = Math.abs(firstNumber - secondNumber);
        System.out.println(diff);
        if (Math.abs(firstNumber - secondNumber) >= 0.0009 ) {
            return false;
        } else {
            return true;
        }
    }
}
