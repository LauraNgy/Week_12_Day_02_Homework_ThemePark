import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall icStall;

    @Before
    public void before(){
        icStall = new IceCreamStall("Frozen Pink", "Mindy Pink", "P106");
    }

    @Test
    public void defaultPrice() {
        assertEquals(2.80, icStall.defaultPrice(), 0.1);
    }

    @Test
    public void priceFor() {
        Visitor visitor = new Visitor(13, 160, 50);
        assertEquals(2.80, icStall.priceFor(visitor), 0.1);
    }

    @Test
    public void getName() {
        assertEquals("Frozen Pink", icStall.getName());
    }

    @Test
    public void getOwnerName() {
        assertEquals("Mindy Pink", icStall.getOwnerName());
    }

    @Test
    public void getParkingSpot() {
        assertEquals("P106", icStall.getParkingSpot());
    }

    @Test
    public void getRating() {
        assertEquals(0, icStall.getRating());
    }

    @Test
    public void setRating() {
        icStall.setRating(8);
        assertEquals(8, icStall.getRating());
    }
}
