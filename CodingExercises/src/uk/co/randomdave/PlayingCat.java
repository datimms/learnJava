package uk.co.randomdave;

public class PlayingCat {
    public static void main(String[] args) {

    }

    public static boolean isCatPlaying (boolean summer, int temperature) {
        int maxTemp = 35;

        if (summer) maxTemp = 45;

        if (temperature >= 25 && temperature <= maxTemp) {
            return true;
        } else {
            return false;
        }

    }
}
