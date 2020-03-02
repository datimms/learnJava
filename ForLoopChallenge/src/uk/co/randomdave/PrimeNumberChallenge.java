package uk.co.randomdave;

public class PrimeNumberChallenge {
    public static void main(String[] args) {
        System.out.println("isPrime(4) = " + isPrime(4));
        System.out.println("isPrime(3) = " + isPrime(3));
        System.out.println("isPrime(7) = " + isPrime(7));

        int counter = 0;
        for (int i = 0; i <= 50; i++) {
            if (isPrime(i)) {
                counter ++;
                System.out.println("counter = " + counter);
            }
            if (counter > 2) {
                break;
            }
        }

    }
     public static boolean isPrime (int n) {

        if (n==1){
            return false;
        }

        for ( int i=2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
     }

}
