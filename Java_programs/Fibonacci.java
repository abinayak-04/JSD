import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = scan.nextInt();
        int a = -1;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            int next = a + b;
            System.out.print( " "+next);
            a = b;
            b = next;
        }
        scan.close();
    }
}