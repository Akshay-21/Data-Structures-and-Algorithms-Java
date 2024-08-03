package RecursionAndBacktracking;

public class FactorialUsingRecursion {

    public static void main(String[] args) {
        int n = 5;
        int a = fact(n);
        System.out.println(a);
    }

    public static int fact(int n) {
        if (n <= 0)
            return 1;
        else
            return n * fact(n - 1);
    }
}
