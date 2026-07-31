import java.util.Scanner;

public class EvenOddandCount{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter N value:");
        long n=scan.nextLong();
        long r,es=0,os=0;
        long ecnt=0,ocnt=0 ;
        String even="",odd="";
        while(n!=0){
            r=n%10;
            n=n/10;
            if(r%2==0){
                es=es+r;
                ecnt++;
                even=r+even;
            }
            else{
                os=os+r;
                ocnt++;
                odd=r+odd;
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
