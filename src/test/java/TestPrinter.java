import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class TestPrinter {

    Printer printerHP;

    @Before
    public void before() {
        printerHP = new Printer();
    }

    @Test
    public void getNumberSheets(){
        int result = printerHP.getNumOfSheets();
        assertEquals(50, printerHP.getNumOfSheets());
    }

    @Test
    public void canPrint(){
        printerHP.print(2, 10);
        assertEquals(30, printerHP.getNumOfSheets());
    }

    @Test
    public void overPrint(){
        printerHP.print(50, 20);
        assertEquals(50, printerHP.getNumOfSheets());
    }

    @Test
    public void reduceToner(){
        printerHP.print(2, 10);
        assertEquals(10, printerHP.getTonerVolume());
    }

    @Test
    public void  NotEnoughToner(){
        printerHP.print(50, 20);
        assertEquals(30, printerHP.getTonerVolume());
    }
}

