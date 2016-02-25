package davis.john;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jrdavis on 2/25/16.
 */
public class GuardGameTest {
GuardGame guardGame;
    @Before
    public void setUp() throws Exception {
guardGame = new GuardGame();
    }

    @Test
    public void testAnswer() throws Exception {
        long test = 12;
        long test2 = 1235;
        long test3 = 234568;
        long test4 = 8904847;
        long test5 = 2147483647;
        long test6 = 99;
        long actual = guardGame.answer(test);
        long actual2 = guardGame.answer(test2);
        long actual3 = guardGame.answer(test3);
        long actual4 = guardGame.answer(test4);
        long actual5 = guardGame.answer(test5);
        long actual6 = guardGame.answer(test6);
        int expected = 3;
        int expected2 = 2;
        int expected3 = 1;
        int expected4 = 4;
        int expected5 = 1;
        int expected6 = 9;
        assertEquals("answer should be 3", expected, actual);
        System.out.println("test passed");
        assertEquals("answer should be 2", expected2, actual2);
        System.out.println("test passed");
        assertEquals("answer should be 1", expected3, actual3);
        System.out.println("test passed");
        assertEquals("answer should be 4", expected4, actual4);
        System.out.println("test passed");
        assertEquals("answer should be 1", expected5, actual5);
        System.out.println("test passed");
        assertEquals("answer should be 1", expected6, actual6);
        System.out.println("test passed");


    }
}