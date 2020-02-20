package uk.co.randomdave;

import static uk.co.randomdave.SpeedConverter.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(toMilesPerHour(1.5)); // → should return value 1
        System.out.println(toMilesPerHour(10.25)); // → should return value 6
        System.out.println(toMilesPerHour(-5.6)); // → should return value -1
        System.out.println(toMilesPerHour(25.42)); // → should return value 16
        System.out.println(toMilesPerHour(75.114)); // → should return value 47

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);

    }
}
