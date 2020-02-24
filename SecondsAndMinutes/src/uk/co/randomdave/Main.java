package uk.co.randomdave;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(0, 44));
        System.out.println(getDurationString(44, 44));
        System.out.println(getDurationString(64, 44));
        System.out.println(getDurationString(124, 44));

        System.out.println(getDurationString(44));
        System.out.println(getDurationString(64));
        System.out.println(getDurationString(124));
        System.out.println(getDurationString(3604));



    }

    public static String getDurationString(int seconds) {
        //validate input
        if (seconds < 0) return "Invalid value";
        int minutes = seconds / 60;
        seconds = seconds % 60;

        return getDurationString(minutes, seconds);
    }

    public static String getDurationString (int minutes, int seconds) {
        //validate input
        if (minutes < 0 || seconds < 0 || seconds > 59) return "Invalid value";

        //convert to seconds
        int totalSeconds = minutes * 60;
        totalSeconds += seconds;

        //calculate hours
        int hours = totalSeconds / 3600 ;
        //System.out.println("hours = " + hours);
        int secondsRemaining = totalSeconds % 3600;
        //System.out.println("secondsRemaining = " + secondsRemaining);
        minutes = secondsRemaining / 60;
        //System.out.println("minutes = " + minutes);
        secondsRemaining = secondsRemaining % 60;
        //System.out.println("secondsRemaining = " + secondsRemaining);
        return hours + "h " + minutes + "m " + secondsRemaining + "s";
    }
}
