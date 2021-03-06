package uk.co.randomdave;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println("getDaysInMonth(2,2020) = " + getDaysInMonth(2, 2020));
        System.out.println("getDaysInMonth(12,2020) = " + getDaysInMonth(12, 2020));
        System.out.println("getDaysInMonth(3,2020) = " + getDaysInMonth(3, 2020));
        System.out.println("getDaysInMonth(2,2019) = " + getDaysInMonth(2, 2019));
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


    public static int getDaysInMonth (int month, int year) {
        //validation
        if (month < 1 || month > 12) return -1;
        if (year < 1 || year > 9999) return -1;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;

            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }

            case 4: case 6:  case 9: case 11:
                return 30;
        }
        return -1;
    }
}
