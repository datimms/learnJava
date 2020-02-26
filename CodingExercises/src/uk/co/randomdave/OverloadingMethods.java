package uk.co.randomdave;

public class OverloadingMethods {
    public static void main(String[] args) {
        System.out.println("calcFeetAndInchesToCentimetres(6,0) = " + calcFeetAndInchesToCentimetres(6, 0));
        System.out.println("calcFeetAndInchesToCentimetres(5) = " + calcFeetAndInchesToCentimetres(5));
        System.out.println("calcFeetAndInchesToCentimetres(7) = " + calcFeetAndInchesToCentimetres(7));
        System.out.println("calcFeetAndInchesToCentimetres(150) = " + calcFeetAndInchesToCentimetres(150));
        System.out.println("calcFeetAndInchesToCentimetres(70) = " + calcFeetAndInchesToCentimetres(70));

    }

    public static double calcFeetAndInchesToCentimetres (int feet, int inches) {
        //validate input
        if (feet < 0 || inches < 0 || inches > 12) return -1;

//        double totalInches = (feet * 12) + inches;
//        double centimetres = totalInches * 2.54;

        double centimetres = feet * 12 * 2.54;
        centimetres += inches * 2.54;

        return centimetres;
    }

    public static double calcFeetAndInchesToCentimetres (int inches) {
        //validate input
        if (inches < 0) return -1;

//        int feet = 0;
//        //int inchesRemainder = 0;
//        if (inches <= 12){
//            feet = 0;
//        } else {
//            feet = Math.round(inches / 12);
//
//        }

        int feet = (int) inches / 12;
        int inchesRemainder = inches % 12;
        return calcFeetAndInchesToCentimetres(feet,inchesRemainder);


    }

}
