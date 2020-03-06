package uk.co.randomdave;

public class NumberToWords {
    public static void main(String[] args) {
//        System.out.println("reverse(-121) = " + reverse(-121));
//        System.out.println("reverse(1212) = " + reverse(1212));
//        System.out.println("reverse(1234) = " + reverse(1234));
//        System.out.println("reverse(100) = " + reverse(100));
//        System.out.println("**************");
//        System.out.println("getDigitCount(0) = " + getDigitCount(0));
//        System.out.println("getDigitCount(123) = " + getDigitCount(123));
//        System.out.println("getDigitCount(-12) = " + getDigitCount(-12));
//        System.out.println("getDigitCount(5200) = " + getDigitCount(5200));
//        System.out.println("**************");
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

    public static int reverse (int number) {

        int digit = 0;
        int reverse = 0;

        while (number != 0) {
            digit = number % 10;
            reverse *= 10;
            reverse += digit;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount (int number) {
        if (number < 0) {return -1;}
        if (number == 0) {return 1;}
        int counter = 0;

        while (number != 0) {
            number /= 10;
            counter ++;
        }
        return counter;
    }

    public static void numberToWords (int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        }

        int numberLength = getDigitCount(number);
        number = reverse(number);
        int reverseLength = getDigitCount(number);
        int lastDigit = 0;


        while (number != 0) {
            lastDigit = number % 10;

            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        number /= 10;
        }

        if (numberLength != reverseLength) {
            for (int i = (numberLength - reverseLength); i > 0; i--) {
                System.out.println("Zero");
            }
        }

    }

}
