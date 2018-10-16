import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before() {
        park = new Park("Meadow");
    }

    @Test
    public void hasName() {
        assertEquals("Meadow", park.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(0, park.getRating());
    }

    @Test
    public void canSetRating() {
        park.setRating(7);
        assertEquals(7, park.getRating());
    }
}
