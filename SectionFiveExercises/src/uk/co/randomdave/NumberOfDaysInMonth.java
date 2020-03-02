package uk.co.randomdave;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {

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
            case 1:
                return 31;
                break;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
                break;
            case 3:
                return 31;
            break;
            case 1:
                return 31;
            break;
            case 1:
                return 31;
            break;
            case 1:
                return 31;
            break;
            case 1:
                return 31;
            break;
            case 1:
                return 31;
            break;
            case 1:
                return 31;
            break;
            case 1:
                return 31;
            break;
            case 1:
                return 31;
            break;
            case 1:
                return 31;
            break;
        }
    }
}
