import org.junit.jupiter.api.Test;
import org.objects.Dice;

import static org.junit.jupiter.api.Assertions.*;

public class DiceTest
{
    @Test
    public void testConstructor()
    {
        Dice die = new Dice(6, "blue");
        assertAll(
                () -> assertEquals(6, die.getSides()),
                () -> assertEquals("blue", die.getColor())
        );
    }
    @Test
    public void testRoll()
    {
        Dice die = new Dice(20, "teal");

        int value = die.roll();

        assertTrue(value <= die.getSides() + 1);
    }

    @Test
    public void testRollMany()
    {
        Dice die = new Dice(6, "white");

        int times = 5;

        int[] rolls =  die.rollMany(times);

        assertTrue(rolls.length == times);

    }

    @Test
    public void testToString()
    {
        Dice die = new Dice(10, "yellow");

        assertEquals(die.toString(), "A 10 sided die");
    }



}
