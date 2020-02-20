package uk.co.randomdave;

public class Methods {

    public static void main(String[] args) {
        displayHighScorePosition("John", calculateHighScorePosition(1500));
        displayHighScorePosition("Ringo", calculateHighScorePosition(900));
        displayHighScorePosition("Paul", calculateHighScorePosition(450));
        displayHighScorePosition("George", calculateHighScorePosition(50));
    }

    public static void displayHighScorePosition(String playerName, int tablePosition) {
        System.out.println(playerName + " managed to get into position " + tablePosition + " in the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }

    }


}
