package testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {

    private Sum sum;

    @Before
    public void setUp() throws Exception {
        sum = new Sum();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
        assertEquals(sum.add(10,10), 20);
    }

    @Test
    public void times() {
        assertEquals(sum.times(5,2), 10);
    }

    @Test
    public void sub() {
        assertEquals(sum.sub(20,5), 15);
    }
}