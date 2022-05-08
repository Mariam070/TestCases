import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddTest {
    @Test
    public void even1() {
        EvenOdd x = new EvenOdd();
        int n = 2;
        assertEquals("Even", x.check(n));
    }

    @Test
    public void even2() {
        EvenOdd x = new EvenOdd();
        int n = 100;
        assertEquals("Even", x.check(n));
    }
    @Test
    public void zero() {
        EvenOdd x = new EvenOdd();
        int n = 0;
        assertEquals("Even",x.check(n));
    }

    @Test
    public void odd1() {
        EvenOdd x = new EvenOdd();
        int n = 3;
        assertEquals("Odd", x.check(n));
    }

    @Test
    public void odd2() {
        EvenOdd x = new EvenOdd();
        int n = 99;
        assertEquals("Odd", x.check(n));
    }


    @Test(expected = IllegalArgumentException.class)
    public void negative(){
        EvenOdd x = new EvenOdd();
        int n = -2;
        x.check(n);
    }


}