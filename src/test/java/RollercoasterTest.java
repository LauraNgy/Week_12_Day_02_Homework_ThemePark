import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before() {
        rollercoaster = new Rollercoaster("Meadow");
    }

    @Test
    public void hasName() {
        assertEquals("Meadow", rollercoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(0, rollercoaster.getRating());
    }

    @Test
    public void canSetRating() {
        rollercoaster.setRating(7);
        assertEquals(7, rollercoaster.getRating());
    }

    @Test
    public void isAllowed() {
        Visitor smallVisitor = new Visitor(30, 140, 100);
        Visitor youngVisitor = new Visitor(10, 160, 10);
        Visitor goodVisitor = new Visitor(40, 180, 500);
        assertEquals(true, rollercoaster.isAllowed(goodVisitor));
        assertEquals(false, rollercoaster.isAllowed(smallVisitor));
        assertEquals(false, rollercoaster.isAllowed(youngVisitor));
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(8.40, rollercoaster.defaultPrice(), 0.1);
    }

    @Test
    public void hasPriceForVisitor() {
        Visitor smallVisitor = new Visitor(30, 140, 100);
        Visitor tallVisitor = new Visitor(40, 210, 100);
        assertEquals(8.40, rollercoaster.priceFor(smallVisitor), 0.1);
        assertEquals(16.80, rollercoaster.priceFor(tallVisitor), 0.1);
    }
}
