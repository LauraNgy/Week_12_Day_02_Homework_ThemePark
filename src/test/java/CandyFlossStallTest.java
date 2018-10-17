import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall cfStall;

    @Before
    public void before(){
        cfStall = new CandyFlossStall("Pink Clouds", "Mindy Pink", "P105");
    }

    @Test
    public void defaultPrice() {
        assertEquals(4.20, cfStall.defaultPrice(), 0.1);
    }

    @Test
    public void priceFor() {
        Visitor visitor = new Visitor(13, 160, 50);
        assertEquals(4.20, cfStall.priceFor(visitor), 0.1);
    }

    @Test
    public void getName() {
        assertEquals("Pink Clouds", cfStall.getName());
    }

    @Test
    public void getOwnerName() {
        assertEquals("Mindy Pink", cfStall.getOwnerName());
    }

    @Test
    public void getParkingSpot() {
        assertEquals("P105", cfStall.getParkingSpot());
    }

    @Test
    public void getRating() {
        assertEquals(0, cfStall.getRating());
    }

    @Test
    public void setRating() {
        cfStall.setRating(8);
        assertEquals(8, cfStall.getRating());
    }
}
