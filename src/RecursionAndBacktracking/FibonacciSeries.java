package RecursionAndBacktracking;

public class FibonacciSeries {

    public static void main(String[] args) {
        int n = 8;
        int a = 0;
        int b = 1;
        fib(n, a, b);

//        =============================================
//        2nd Approach

        // Given Number N
        int N = 10;
        // Print the first N numbers
        for (int i = 0; i < N; i++) {
            System.out.print(fib(i) + " ");
        }
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

    // Function to print the fibonacci series
    static int fib(int n) {
        // Base Case
        if (n <= 1)
            return n;
        // Recursive call
        return fib(n - 1) + fib(n - 2);
    }
}
