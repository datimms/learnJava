package uk.co.randomdave;

public class SumOddRange {
    public static void main(String[] args) {
        System.out.println("sumOdd(1,100) = " + sumOdd(1, 100));
        System.out.println("sumOdd(-1, 100) = " + sumOdd(-1, 100));
        System.out.println("sumOdd(100,100) = " + sumOdd(100, 100));
        System.out.println("sumOdd(13,13) = " + sumOdd(13, 13));
        System.out.println("sumOdd(100,-100) = " + sumOdd(100, -100));
        System.out.println("sumOdd(100,1000) = " + sumOdd(100, 1000));
    }

    public static boolean isOdd (int number) {
        //validation
        if (number <= 0) {
            return false;
        }

        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd (int start, int end) {
        if (start > end || start < 0 || end < 0) {
            return -1;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;

    }
}
