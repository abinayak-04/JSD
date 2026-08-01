import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter value:");
        long n=scan.nextLong();
        long rem=0L;
        while(n!=0){
            rem=n%10;
            n=n/10;
            System.out.print(rem);
        }
       
        scan.close();
    }
}
