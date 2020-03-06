package uk.co.randomdave;

public class SharedDigit {
    public static void main(String[] args) {
//        System.out.println("hasSharedDigit(12,23) = " + hasSharedDigit(12, 23));
//        System.out.println("hasSharedDigit(9,99) = " + hasSharedDigit(9, 99));
//        System.out.println("hasSharedDigit(15,55) = " + hasSharedDigit(15,55));
        System.out.println("hasSharedDigit(12,13) = " + hasSharedDigit(12, 13));
        System.out.println("hasSharedDigit(12,34) = " + hasSharedDigit(12, 34));
    }

    public static boolean hasSharedDigit (int first, int second) {
        if (first < 10 || first > 99 || second < 10 || second > 99) {
            return false;
        }

        int digit = 0;
        int two = second;

        while ( first != 0) {
            digit = first % 10;
            //System.out.println("digit = " + digit);

            while ( second != 0) {
                //System.out.println("(second % 10) = " + (second % 10));
                if (digit == second % 10) {
                    return true;
                }
                second /= 10;
                //System.out.println("second = " + second);
            }
            second = two;
            first /= 10;
            //System.out.println("(first) = " + first );

        }
        return false;
    }

//    public static boolean hasSharedDigit(int a, int b) {
//
//        if ((a < 10 || a > 99) || (b < 10 || b > 99)) {
//            return false;
//        }
//
//        int d1a = a/10;
//        int d1b = a%10;
//        int d2a = b/10;
//        int d2b = b%10;
//
//        return d1a == d2a || d1a == d2b || d1b == d2a || d1b == d2b;
//
//    }
}


