package uk.co.randomdave;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println("hasSameLastDigit(41,22,71) = " + hasSameLastDigit(41, 22, 71));
        System.out.println("hasSameLastDigit(23,32,42) = " + hasSameLastDigit(23, 32, 42));
        System.out.println("hasSameLastDigit(9,99,999) = " + hasSameLastDigit(9, 99, 999));
        System.out.println("*****");
        System.out.println("isValid(10) = " + isValid(10));
        System.out.println("isValid(468) = " + isValid(468));
        System.out.println("isValid(1051) = " + isValid(1051));
        System.out.println("isValid(9) = " + isValid(9));
    }

    public static boolean hasSameLastDigit (int numOne, int numTwo, int numThree) {
        if (numOne < 10 || numOne > 1000
            || numTwo < 10 || numTwo > 1000
            || numThree < 10 || numThree > 1000) {
            return false;
        }
    
        int digitOne = numOne % 10;
        int digitTwo = numTwo % 10;
        int digitThree = numThree % 10;
        
        return digitOne == digitTwo || digitTwo == digitThree || digitOne == digitThree;
    }

    public static boolean isValid (int num) {
        return (num >= 10 && num <= 1000);
    }

}
