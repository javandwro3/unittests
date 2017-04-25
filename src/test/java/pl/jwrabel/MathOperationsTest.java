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

    @Test
    public void factiorial_shouldReturnCorrectResultFor1() throws MyException {
        // given
        int x = 1;

        // when
        int result = MathOperations.factorial(x);

        // then
        assertEquals(result, 1);
    }

    @Test
    public void factiorial_shouldReturnCorrectResultFor0() throws MyException {
        // given
        int x = 0;

        // when
        int result = MathOperations.factorial(x);

        // then
        assertEquals(result, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void factiorial_shouldThrowExceptionForNegative() throws MyException {
        // given
        int x = -1;

        // when
        MathOperations.factorial(x);
    }

//    @Test
//    public void factiorial_shouldThrowExceptionForNegative2() throws MyException {
//        // given
//        int x = -1;
//
//        // when
//        try {
//            MathOperations.factorial(x);
//            assertTrue(false);
//        } catch (IllegalArgumentException e) {
//            assertTrue(true);
//        }
//    }

    @Test
    public void factiorial_shouldReturnCorrectResultFor5() throws MyException {
        // given
        int x = 5;

        // when
        int result = MathOperations.factorial(x);

        // then
        assertEquals(result, 120);
    }

    @Test
    public void factiorial_shouldReturnCorrectResultFor12() throws MyException {
        // given
        int x = 12;

        // when
        int result = MathOperations.factorial(x);

        // then
        assertEquals(result, 479001600);
    }

    @Test(expected = IllegalArgumentException.class)
    public void factiorial_shouldThrowExceptionForMoreThan12() throws MyException {
        // given
        int x = 13;

        // when
        MathOperations.factorial(x);
    }

    public static void main(String[] args) {
        System.out.println(MathOperations.factorial(30));
    }


//    @Test
//    public void factiorial_shouldReturnCorrectResultFor1() throws MyException {
//        // given
//        int x = 5;
//
//        // when
//        int result = MathOperations.factorial(x);
//
//        // then
//        assertEquals(result, 120);
//    }
}
