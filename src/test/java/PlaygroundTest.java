import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;

    @Before
    public void before() {
        playground = new Playground("Meadow");
    }

    @Test
    public void hasName() {
        assertEquals("Meadow", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(0, playground.getRating());
    }

    @Test
    public void canSetRating() {
        playground.setRating(7);
        assertEquals(7, playground.getRating());
    }

    @Test
    public void isAllowed() {
        Visitor youngVisitor = new Visitor(14, 140, 10);
        Visitor oldVisitor = new Visitor(40, 180, 500);
        assertEquals(true, playground.isAllowed(youngVisitor));
        assertEquals(false, playground.isAllowed(oldVisitor));
    }
}
