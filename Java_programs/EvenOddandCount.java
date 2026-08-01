import java.util.Scanner;

public class EvenOddandCount{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter N value:");
        long n=scan.nextLong();
        long rem,es=0,os=0;
        long ecnt=0,ocnt=0,odd=0,even=0 ;
        while(n!=0){
            rem=n%10;
            n=n/10;
            if(rem%2==0){
                es=es+rem;
                ecnt++;
                even=even*10+rem;
            }
            else{
                os=os+rem;
                ocnt++;
                odd=odd*10+rem;
            }
        }
            System.out.println("Even numbers are:"+even);
            System.out.println("Odd numbers are:"+odd);
            System.out.println("Even numbers count:"+ecnt);
            System.out.println("Odd numbers count:"+ocnt);
            System.out.println("Sum of even digits:"+es);
            System.out.println("Sum of odd digits :"+os);
        scan.close();
    
}
}
