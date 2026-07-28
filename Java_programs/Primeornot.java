import java.util.Scanner;

public class Primeornot {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a value:");
        int n=scan.nextInt();
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                cnt++;
            }
        }
        if(cnt>2)
            System.out.println(n+" is a not prime number");
        else
            System.out.println(n+" is a prime number");
        scan.close();
    }
}
