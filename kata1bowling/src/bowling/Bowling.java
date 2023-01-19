package bowling;

public class Bowling {

    public static final String STRIKE = "X";

    public int bowl(String input) {
        //Example input: "X 45 4/ 32"
        int totalGameScore = 0;
        int strikeScore = 0;
        String[] listOfScores = input.split(" ");
        int numberOfFrames = listOfScores.length;

        for(int i=0 ; i<numberOfFrames ; i++) {
            String theScoreThisFrame = listOfScores[i];

            if(theScoreThisFrame.equals(STRIKE)) {
                strikeScore = 10;
            } else {
                String pointsInRoll1 = getPointsFromRollXinScoreY(1, theScoreThisFrame);
                String pointsInRoll2 = getPointsFromRollXinScoreY(2, theScoreThisFrame);

                int totalPointsForThisFrame = Integer.parseInt(pointsInRoll1) + Integer.parseInt(pointsInRoll2);
                String previousFrameScore = "initialValue";
                boolean thisIsTheFirstFrame = (i==0 ? true : false);
                boolean thisIsNotTheFirstFrame = !thisIsTheFirstFrame;

                if (thisIsNotTheFirstFrame) {
                    previousFrameScore = listOfScores[i - 1];
                    boolean previousFrameScoreIsAStrike = previousFrameScore.equals(STRIKE);

                    if (previousFrameScoreIsAStrike) {
                        strikeScore += totalPointsForThisFrame;
                    }
                }

                totalGameScore += totalPointsForThisFrame + strikeScore;
                strikeScore = 0;
            }
        }

        int a=1;
        return totalGameScore;
    }

    private String getPointsFromRollXinScoreY(int rollNumber, String frame) {
        return frame.substring(rollNumber-1, rollNumber);
    }
}
