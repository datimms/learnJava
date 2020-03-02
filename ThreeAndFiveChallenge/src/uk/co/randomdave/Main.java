package uk.co.randomdave;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //initialise variables
        int count = 0;
        int sum = 0;

        //loop
        for (int i = 1; i <=1000; i++) {

            if ( i % 3 == 0 && i % 5 == 0) {
                sum += i;
                System.out.println(i + " is divisible by 3 and 5.");
                count ++;
            }

            //exit loop once 5 matches found
            if (count == 5) break;
        }

        System.out.println("The sum is " + sum);
    }
}
