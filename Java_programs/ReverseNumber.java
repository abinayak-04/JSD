import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter value:");
        long n=scan.nextLong();
        long rev=0L;
        while(n!=0){
            long rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        System.out.println("Reversed Number:"+rev);
        scan.close();
    }
}
