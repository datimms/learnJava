package uk.co.randomdave;

public class Main {

    public static void main(String[] args) {
	// write your code here

        char charValue = "A";

        switch (charValue) {
            case A: case B: case C: case D: case E:
                System.out.println("value was found");
                break;

            default:
                System.out.println("Not found");
                break;
        }
    }
}
