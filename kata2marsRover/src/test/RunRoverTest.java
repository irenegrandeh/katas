package src.test;

import org.junit.jupiter.api.Test;
import src.main.RunRover;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RunRoverTest {

    @Test
    void returnAtest() {
        RunRover runRover = new RunRover();
        String result = runRover.returnA();
        assertEquals(result, "a");
    }
}
