import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class TestWaterBottle {

    WaterBottle waterB;
    @Before
    public void before() {
        waterB = new WaterBottle();
    }

    @Test
    public void hasVolume() {
        int result = waterB.getVolume();
        assertEquals(100, result);
    }

    @Test
    public void canDrinkTwice(){
        waterB.drink();
        waterB.drink();
        assertEquals(80, waterB.getVolume());
    }

    @Test
    public void canEmpty(){
        waterB.empty();
        assertEquals(0,waterB.getVolume());
    }

    @Test
    public void canFill(){
        waterB.fill();
        assertEquals(100, waterB.getVolume());
    }
}
