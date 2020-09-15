import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumNotCarryingTest {

    @Test
    public void shouldReturn1Digit(){
        assertEquals(1, SumNotCarrying.sumNotCarrying(0,1));
        assertEquals(0, SumNotCarrying.sumNotCarrying(0,0));
    }


    @Test
    public void shouldReturn2Digits() {
        assertEquals(13, SumNotCarrying.sumNotCarrying(2,11));
        assertEquals(89, SumNotCarrying.sumNotCarrying(31,58));
    }

    @Test
    public void shouldReturn3Digits(){
        assertEquals(214, SumNotCarrying.sumNotCarrying(16,18));
        assertEquals(515, SumNotCarrying.sumNotCarrying(26,39));
    }

    @Test
    public void shouldReturn4Digits() {
        assertEquals(1103, SumNotCarrying.sumNotCarrying(122,81));
    }
}
