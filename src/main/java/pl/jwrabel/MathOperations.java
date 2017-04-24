package pl.jwrabel;

/**
 * Created by jakubwrabel on 24.04.2017.
 */
public class MathOperations {
    public static double divide(double x, double y) throws MyException {
        if(y == 0){
            throw new MyException();
        }

        return x / y;
    }

    public static int factorial(int x){

    }
}
