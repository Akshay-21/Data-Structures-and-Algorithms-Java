package RecursionAndBacktracking;

public class PrintN_NumberUsingRecursion {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }

    public static int print(int n) {
        if (n <= 0) {
            return 0;
        } else {
            System.out.println(n);
            return print(n - 1);
        }
    }
}
