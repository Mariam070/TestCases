import org.junit.Test;

import static org.junit.Assert.*;

public class MinMaxTest {
    @Test
    public void test1(){
        MinMax y = new MinMax();
        int[] x = {1,6,5,4,-24,100,7,8,10};
        assertEquals(-24,y.Min(x));
        assertEquals(100, y.Max(x));
    }
    @Test
    public void test2(){
        MinMax y = new MinMax();
        int[] x = {1,8,9,0,3,2,88,2,220};
        assertEquals(0,y.Min(x));
        assertEquals(220, y.Max(x));
    }
    @Test
    public void test3(){
        MinMax y = new MinMax();
        int[] x = {7,8};
        assertEquals(7,y.Min(x));
        assertEquals(8, y.Max(x));
    }
    @Test
    public void test4(){
        MinMax y = new MinMax();
        int[] x = {1};
        assertEquals(1,y.Min(x));
        assertEquals(1, y.Max(x));
    }

}