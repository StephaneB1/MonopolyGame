import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoSquareTest {

    @Test
    void landedOnGo() {
        Board  board = new Board();
        Cup cup = new Cup(2);
        Player p = new Player("Joe", board, cup);
       Square square = new GoSquare();
       square.landedOn(p);
       assertEquals(1700, p.getNetWorth());
    }
}