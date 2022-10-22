package programs;

public class Fibonacci_Series {

    public int fibonacciSeries(int n){
        if(n<=1){
            return n;
        }
        return fibonacciSeries(n-1)+fibonacciSeries(n-2);
    }
}
