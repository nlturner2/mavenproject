import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    Calc cal = new Calc();
    @Test
    void someTest(){
        assertEquals(5, cal.Add(3,2));
    }

}