package uk.co.randomdave;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println("isPalindrome(1) = " + isPalindrome(1));
        System.out.println("isPalindrome(121) = " + isPalindrome(-121));
        System.out.println("isPalindrome(1321) = " + isPalindrome(1321));
    }

    public static boolean isPalindrome (int number) {
        int reverse = 0;
        int originalNumber = number;
        int lastDigit = 0;

        while (number != 0) {
            lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
        System.out.println(originalNumber + " <===> " + reverse);

        return  reverse == originalNumber;


    }

}
