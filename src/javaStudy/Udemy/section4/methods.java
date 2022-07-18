package javaStudy.Udemy.section4;

public class methods {


    public static void main(String[] args) {

        int myScore = calculateScore(true, 500, 4, 4);
        int  jaysScore = calculateScore(true, 1000, 5, 5);
        int pipScore = calculateScore(true, 100, 3, 2);
        int jeffScore = calculateScore(true, 50, 1, 1);


        displayHighScorePosition("Jay", calculateHighScorePosition(jaysScore));
        displayHighScorePosition("Destina", calculateHighScorePosition(myScore));
        displayHighScorePosition("Pip", calculateHighScorePosition(pipScore));
        displayHighScorePosition("Jeff", calculateHighScorePosition(jeffScore));

    }

    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        return -1;                                 // -1 is used to indicate an error (the game isn't over)
    }


    public static void displayHighScorePosition (String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }


    public static int calculateHighScorePosition (int score) {

        int position;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        } else {
            position = 4;
        }
        return position;
    }
}
