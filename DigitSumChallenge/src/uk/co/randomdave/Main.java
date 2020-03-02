package uk.co.randomdave;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("sumDigits(125) = " + sumDigits(1253));
        //sumDigits(1253)
    }

    public static int sumDigits (int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;
        //my solution
//        do {
//            sum += number % 10;
//            number /= 10;
//        } while (number > 10);
//
//        sum += number;

        //Tim's solution
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;


    }
}
