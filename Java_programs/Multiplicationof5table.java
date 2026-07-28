import java.util.Scanner;

public class Multiplicationof5table {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the value for 5 table needs to print:");
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("5 * "+i+" = "+(5*i)+"\n");
        }
        scan.close();
    }
}
