import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before() {
        visitor = new Visitor(18, 200, 100);
    }

    @Test
    public void hasAge() {
        assertEquals(18, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(200, visitor.getHeight());
    }

    @Test
    public void hasMoney() {
        assertEquals(100, visitor.getMoney());
    }
}
