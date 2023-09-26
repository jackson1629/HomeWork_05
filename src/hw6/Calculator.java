package hw6;

import static java.lang.Math.pow;

public class Calculator {
    public int powerXY(int x, int y) throws CalException {

        if (x == 0 && y == 0) {
            throw new CalException("0的0次方無意義");
        } else if (x != 0 && y < 0) {
            throw new CalException("次方數為負值導致結果不為整數");
        } else {
            return (int) pow(x, y);
        }

    }
}
