import org.junit.Test;

import static org.junit.Assert.*;

public class CalculationsTest {

    @Test
    public void add() {
        Calculations c = new Calculations();
        assertEquals(c.add(7,8),15);
    }
}
