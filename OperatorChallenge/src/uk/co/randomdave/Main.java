package uk.co.randomdave;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double myDouble = 20d;
        double myDouble2 = 80d;

        double result = (myDouble + myDouble2 ) * 100;
        double remainder = result % 40;

        boolean cock = remainder == 0 ? true : false;

        System.out.println(cock);

        if (!cock) {
            System.out.println("Got some remainder");
        }
    }
}
