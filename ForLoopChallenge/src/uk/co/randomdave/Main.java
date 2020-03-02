package uk.co.randomdave;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double principal = 10000d;
        for (double i=8d; i>=2d; i--) {
            System.out.println(principal + " at " + i + "% interest = " + String.format("%.2f", calculateInterest(principal, i)));
        }
    }

    public static double calculateInterest (double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
