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


}
