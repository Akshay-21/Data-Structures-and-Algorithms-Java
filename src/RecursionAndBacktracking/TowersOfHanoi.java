package RecursionAndBacktracking;

public class TowersOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        char fromRod = 'A';
        char toRod = 'C';
        char auxRod = 'B';
        towersOfHanoi(n, fromRod, toRod, auxRod);
    }

    public static void towersOfHanoi(int n, char fromRod, char toRod, char auxRod) {

        if (n == 0) {
            return;
        }

        /*Move top n-1 disk from A to B, using C as auxiliary*/
        towersOfHanoi(n - 1, fromRod, auxRod, toRod);

        /*Move remaining disk from A to B, using C as Auxiliary.*/
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);

        /*Move n-1 disks from B to C using A as Auxiliary*/
        towersOfHanoi(n - 1, auxRod, toRod, fromRod);
    }
}