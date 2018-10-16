import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before() {
        dodgems = new Dodgems("Meadow");
    }

    @Test
    public void hasName() {
        assertEquals("Meadow", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(0, dodgems.getRating());
    }

    @Test
    public void canSetRating() {
        dodgems.setRating(7);
        assertEquals(7, dodgems.getRating());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(4.50, dodgems.defaultPrice(), 0.1);
    }

    @Test
    public void hasPriceForVisitor() {
        Visitor youngVisitor = new Visitor(10, 140, 10);
        Visitor oldVisitor = new Visitor(40, 1800, 100);
        assertEquals(2.25, dodgems.priceFor(youngVisitor), 0.1);
        assertEquals(4.50, dodgems.priceFor(oldVisitor), 0.1);
    }
}
