package pl.jwrabel;

import java.math.BigInteger;

/**
 * Created by jakubwrabel on 24.04.2017.
 */
public class MathOperations {

    public static void main(String[] args) throws MyException {
//        MathOperations.divide(10, 20);
    }

    public static double divide(double x, double y) throws MyException {
        if (y == 0) {
            throw new MyException();
        }

        return x / y;
    }

    public static int factorial(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Cannot calculate factorial from negative");
        }

        if (x > 12) {
            throw new IllegalArgumentException("Cannot calculate factorial for number greater than 12");
        }


        int result = 1;
        for (int i = 2; i <= x; i++) {
            result *= i;
        }
        return result;
    }
}
