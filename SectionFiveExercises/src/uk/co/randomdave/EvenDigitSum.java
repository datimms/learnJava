package uk.co.randomdave;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println("getEvenDigitSum(123456789) = " + getEvenDigitSum(123456789));
        System.out.println("getEvenDigitSum(252) = " + getEvenDigitSum(252));
        System.out.println("getEvenDigitSum(-22) = " + getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum (int number) {
        if (number < 0) {
            return -1;
        }

        int lastNum = 0;
        int sum = 0;

        while (number != 0) {
            lastNum = number % 10;
            if (lastNum % 2 == 0) {
                sum += lastNum;
            }
            number /= 10;
        }
        return sum;
    }
}
