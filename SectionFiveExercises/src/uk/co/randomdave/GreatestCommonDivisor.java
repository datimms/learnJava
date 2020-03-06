package uk.co.randomdave;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("getGreatestCommonDivisor(25,15) = " + getGreatestCommonDivisor(25, 15));
        System.out.println("getGreatestCommonDivisor(12,30) = " + getGreatestCommonDivisor(12, 30));
        System.out.println("getGreatestCommonDivisor(9,18) = " + getGreatestCommonDivisor(9, 18));
        System.out.println("getGreatestCommonDivisor(81,153) = " + getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor (int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int min = (first < second) ? first : second;
        int max = (first > second) ? first : second;

        for (int i = min; i > 0; i-- ) {

            if (min % i == 0) {
                if (max % i == 0 ) {
                    return i;
                }
            }
        }

        return -1;

    }
}
