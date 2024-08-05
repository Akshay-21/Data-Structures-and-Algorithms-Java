package RecursionAndBacktracking;

public class FibonacciSeries {

    public static void main(String[] args) {
        int n = 8;
        int a = 0;
        int b = 1;
        fib(n, a, b);
    }

    private static int fib(int n, int a, int b) {
        if (n <= 0) {
            return 0;
        }
        int c = a + b;
        System.out.println(a);
        a = b;
        b = c;
        return fib(n - 1, a, b);
    }
}
