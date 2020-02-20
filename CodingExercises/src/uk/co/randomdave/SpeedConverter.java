package uk.co.randomdave;

public class SpeedConverter {
    public static long toMilesPerHour (double kilometersPerHour){
        //return -1 if value negative
        if (kilometersPerHour < 0) return -1L;
        if (kilometersPerHour == 0) return 0L;

        //1mph = 1.609kmph round to nearest int
        long milesPerHour = Math.round(kilometersPerHour/1.609d);
        return milesPerHour;
    }
    public static void printConversion (double kilometersPerHour){
        //do conversion
        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if (milesPerHour < 0) {
            System.out.println("Invalid value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }

    }
}


