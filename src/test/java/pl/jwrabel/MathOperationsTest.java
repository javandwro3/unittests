package pl.jwrabel;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jakubwrabel on 24.04.2017.
 */
public class MathOperationsTest {

    @Test
    public void divide_simpleCase() throws MyException {
        // given
        double x = 3;
        double y = 1;

        // when
        double result = MathOperations.divide(x, y);

        // then
        assertEquals(result, 3, 0.0000000001);
    }

    @Test
    public void divide_largeNumbers() throws MyException {
        // given
        double x = 100000000;
        double y = 50000000;

        // when
        double result = MathOperations.divide(x, y);

        // then
        assertEquals(result, 2, 0.0000000001);
    }

    @Test(expected = MyException.class)
    public void divide_byZero() throws MyException {
        // given
        double x = 10;
        double y = 0;

        // when
        double result = MathOperations.divide(x, y);

        // then
        assertEquals(result, 2, 0.0000000001);
    }
}
