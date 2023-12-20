//import org.junit.*;
import org.junit.jupiter.api.Test;

//import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YatzyTest {

    @Test
    public void chanceScoreDice() {
        int expected = 15;
        int actual = Yatzy.chance(2,3,4,5,1);
        assertEquals(expected, actual);
        assertEquals(16, Yatzy.chance(3,3,4,5,1));
    }

    @Test
    public void yatzyScore50() {
        int expected = 50;
        int actual = Yatzy.yatzy(4,4,4,4,4);
        assertEquals(expected, actual);
        assertEquals(50, Yatzy.yatzy(6,6,6,6,6));
        assertEquals(0, Yatzy.yatzy(6,6,6,6,3));
    }

    @Test public void testOnes() {
        assertEquals(1, Yatzy.ones(1,2,3,4,5));
        assertEquals(2, Yatzy.ones(1,2,1,4,5));
        assertEquals(0, Yatzy.ones(6,2,2,4,5));
        assertEquals(4, Yatzy.ones(1,2,1,1,1));
    }

    @Test
    public void testTwos() {
        assertEquals(4, Yatzy.twos(1,2,3,2,6));
        assertEquals(10, Yatzy.twos(2,2,2,2,2));
    }

    @Test
    public void testThrees() {
        assertEquals(6, Yatzy.threes(1,2,3,2,3));
        assertEquals(12, Yatzy.threes(2,3,3,3,3));
    }

    @Test
    public void testFours()
    {
        assertEquals(12, Yatzy.fours(4,4,4,5,5));
        assertEquals(8, Yatzy.fours(4,4,5,5,5));
        assertEquals(4, Yatzy.fours(4, 5, 5, 5, 5));
    }

    @Test
    public void testFives() {
        assertEquals(10, Yatzy.fives(4,4,4,5,5));
        assertEquals(15, Yatzy.fives(4,4,5,5,5));
        assertEquals(20, Yatzy.fives(4,5,5,5,5));
    }

    @Test
    public void testSixs() {
        assertEquals(0, Yatzy.sixs(4,4,4,5,5));
        assertEquals(6, Yatzy.sixs(4,4,6,5,5));
        assertEquals(18, Yatzy.sixs (6,5,6,6,5));
    }

    @Test
    public void onePair() {
        assertEquals(6, Yatzy.scorePair(3,4,3,5,6));
        assertEquals(10, Yatzy.scorePair(5,3,3,3,5));
        assertEquals(12, Yatzy.scorePair(5,3,6,6,5));
    }

    @Test
    public void twoPair() {
        assertEquals(16, Yatzy.twoPair(3,3,5,4,5));
        assertEquals(16, Yatzy.twoPair(3,3,5,5,5));
        assertEquals(0, Yatzy.twoPair(1,1,2,3,4));

    }

    @Test
    public void testThreeKind()
    {
        assertEquals(9, Yatzy.threeOfAKind(3,3,3,4,5));
        assertEquals(15, Yatzy.threeOfAKind(5,3,5,4,5));
        assertEquals(9, Yatzy.threeOfAKind(3,3,3,3,5));
        assertEquals(12, Yatzy.threeOfAKind(4,4,4,4,4));
        assertEquals(0, Yatzy.threeOfAKind(2,2,3,3,5));
    }

    @Test
    public void testFourKind() {
        assertEquals(12, Yatzy.fourOfAKind(3,3,3,3,5));
        assertEquals(20, Yatzy.fourOfAKind(5,5,5,4,5));
        assertEquals(12, Yatzy.fourOfAKind(3,3,3,3,3));
        assertEquals(0, Yatzy.fourOfAKind(3,4,3,3,1));
    }

    @Test
    public void testSmallStraight() {
        assertEquals(15, Yatzy.smallStraight(1,2,3,4,5));
        assertEquals(15, Yatzy.smallStraight(2,3,4,5,1));
        assertEquals(0, Yatzy.smallStraight(1,2,2,4,5));

    }

    @Test
    public void testLargeStraight() {
        assertEquals(20, Yatzy.largeStraight(6,2,3,4,5));
        assertEquals(20, Yatzy.largeStraight(2,3,4,5,6));
        assertEquals(0, Yatzy.largeStraight(1,2,2,4,5));
    }

    @Test
    public void fullHouse() {
        assertEquals(18, Yatzy.fullHouse(6,2,2,2,6));
        assertEquals(0, Yatzy.fullHouse(2,3,4,5,6));
        assertEquals(0, Yatzy.fullHouse(2,2,2,2,2));
    }
}

