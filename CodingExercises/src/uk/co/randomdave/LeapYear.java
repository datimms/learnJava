package uk.co.randomdave;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2020));
        System.out.println("isLeapYear(1800) = " + isLeapYear(1800));

    }

    public static boolean isLeapYear (int year) {

        boolean leapYear = false;
        //input validation
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
                return true;
            } else if (year % 4 == 0 && year % 100 != 0 && year % 400 != 0) {
                return true;
            }
        }
        return leapYear;
    }
}
//    1. If the year is evenly divisible by 4, go to step 2. Otherwise, false
//        2. If the year is evenly divisible by 100, go to step 3. Otherwise, true
//            3. If the year is evenly divisible by 400, go to step 4. Otherwise, false
//            4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
//        5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.