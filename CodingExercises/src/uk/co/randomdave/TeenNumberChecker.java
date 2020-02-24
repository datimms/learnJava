package uk.co.randomdave;

public class TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println("hasTeen(9,99,19) = " + hasTeen(9, 99, 19));
        System.out.println("hasTeen(23,15,42) = " + hasTeen(23, 15, 42));
        System.out.println("hasTeen(22,23,34) = " + hasTeen(22, 23, 34));
    }

    public static boolean hasTeen (int numOne, int numTwo, int numThree) {
        return  (isTeen(numOne) || isTeen(numTwo) || isTeen(numThree));
    }

    public static boolean isTeen (int number) {
        return (number >= 13 && number <= 19);
    }
}
