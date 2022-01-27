package prod.ru.job4j.condition.ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void testManWeight() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void testWomanWeight() {
        short inw = 170;
        double expectedw = 69;
        double outw = Fit.womanWeight(inw);
        Assert.assertEquals(expectedw, outw, 0.01);
    }
}