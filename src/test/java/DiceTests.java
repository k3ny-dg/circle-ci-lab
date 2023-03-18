import org.junit.jupiter.api.Test;
import org.objects.Dice;

import static org.junit.jupiter.api.Assertions.*;

public class DiceTests
{
    @Test
    public void constructorTest()
    {
        Dice die = new Dice(6, "blue");
        assertAll(
                () -> assertEquals(6, die.getSides()),
                () -> assertEquals("blue", die.getColor())
        );
    }
    @Test
    public void rollTest()
    {
        Dice die = new Dice(20, "teal");

        int value = die.roll();

        assertTrue(value <= die.getSides() + 1);
    }

    @Test
    public void rollManyTest()
    {
        Dice dice = new Dice(6, "white");

        dice.rollMany(5);

    }

}
