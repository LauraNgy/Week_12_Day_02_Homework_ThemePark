import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Pink Smoke", "Mindy Pink", "P104");
    }

    @Test
    public void defaultPrice() {
        assertEquals(6.60, tobaccoStall.defaultPrice(), 0.1);
    }

    @Test
    public void priceFor() {
        Visitor visitor = new Visitor(50, 180, 200);
        assertEquals(6.60, tobaccoStall.priceFor(visitor), 0.1);
    }

    @Test
    public void getName() {
        assertEquals("Pink Smoke", tobaccoStall.getName());
    }

    @Test
    public void getOwnerName() {
        assertEquals("Mindy Pink", tobaccoStall.getOwnerName());
    }

    @Test
    public void getParkingSpot() {
        assertEquals("P104", tobaccoStall.getParkingSpot());
    }

    @Test
    public void getRating() {
        assertEquals(0, tobaccoStall.getRating());
    }

    @Test
    public void setRating() {
        tobaccoStall.setRating(8);
        assertEquals(8, tobaccoStall.getRating());
    }

    @Test
    public void isAllowed() {
        Visitor youngVisitor = new Visitor(13, 160, 50);
        Visitor oldVisitor = new Visitor(53, 160, 500);
        assertEquals(false, tobaccoStall.isAllowed(youngVisitor));
        assertEquals(true, tobaccoStall.isAllowed(oldVisitor));
    }
}
