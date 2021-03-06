import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class PalidromeTest {

    Palidrome finder;
    String input1;
    String input2;
    String input3;

    @Before
    public void setUp(){
        finder = new Palidrome();
        input1 = "catdoghatoapple";
        input2 = "happyppahaha";
        input3 = "yellowblueeulbred";
    }

    @Test
    public void hasPalidrome(){
        // if contains a palindrome of length 3 or more
        assertFalse(finder.containsPalindrome(input1));
        assertTrue(finder.containsPalindrome(input2));
        assertTrue(finder.containsPalindrome(input3));
    }

}
