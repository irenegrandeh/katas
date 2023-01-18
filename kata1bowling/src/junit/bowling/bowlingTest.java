package junit.bowling;

import bowling.Bowling;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class bowlingTest {

    Bowling bowling = new Bowling();

    //Example score: "X 45 4/ 32"

    @Test
    public void scoreIsZero() {
        int result = bowling.bowl("00 00 00 00 00 00 00 00 00 00");
        assertEquals(result,0);
    }

    @Test
    public void onlyOneRollGetsPointsNoStrikesNoSpares() {
        int result = bowling.bowl("02 40 10 20 30 90 01 01 02 20");
        assertEquals(result,27);
    }

    @Test
    public void bothRollsGetsPointsNoStrikesNoSpares() {
        int result = bowling.bowl("12 49 13 27 30 90 01 01 02 20");
        assertEquals(result,47);
    }

    @Test
    public void bothRollsGetsPointsNoStrikesNoSparesUnfinishedGame() {
        int result = bowling.bowl("10 19 90");
        assertEquals(result,20);
    }

    @Test
    public void oneStrikeAtTheBeginning() {
        int result = bowling.bowl(("X 31 22"));
        assertEquals(result, 22);
    }

    @Test
    public void twoStrikesNotTogether() {
        int result = bowling.bowl(("X 31 X 22"));
        assertEquals(result, 36);
    }

}
