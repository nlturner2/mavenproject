import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    Calc cal = new Calc();
    @Test
    void someTest(){
        assertEquals(3, cal.Add(2,2));
    }

}