package exam01;

public class RecCalculator implements Calculator{
    public long factorial(long num) {

        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}