public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Generate 10 Fibonacci numbers
        int a = 0, b = 1, next;

        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            next = a + b;
            a = b;
            b = next;
        }
    }
}
