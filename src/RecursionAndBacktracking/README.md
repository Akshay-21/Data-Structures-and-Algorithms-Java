## Data Structures and Algorithms Java

### Recursion and Backtracking

### What is recursion?

Any function which calls itself is called recursive. A recursive method solves a problem
by calling a copy of itself to work on a smaller problem. This is called the recursive
step. The recursion step can result in many more such recursive calls. It is important to
ensure that the recursion terminates. Each time the function calls itself with a slightly
simpler version of the original problem. The sequence of smaller problems must eventually
converge on the base case.

```
Que: Calculate factorial of a positive integer.
Using Recursive
int n = 5;
n! = 5 * 4 * 3 * 2 * 1;

factorial of 5! = 120
```