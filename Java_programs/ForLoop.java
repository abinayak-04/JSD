import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the n value:");
        int n=scan.nextInt();
        int s=0;
        for(int i=1;i<=n;i++){
            s=s+i;
            if(i==n)
                System.out.print(i+"="+s);
            else
                System.out.print(i+"+");
        }
        scan.close();
    }
}
