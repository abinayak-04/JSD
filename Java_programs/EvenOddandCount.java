import java.util.Scanner;

public class EvenOddandCount{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter N value:");
        long n=scan.nextLong();
        long rem,es=0,os=0;
        long ecnt=0,ocnt=0,odd=0,even=0,te=1,to=1 ;
        while(n!=0){//1234
            rem=n%10;
            n=n/10;
            if(rem%2==0){
                es=es+rem;          //0+4        4+3        7+2           9+1               10+0
                ecnt++;
                //even=even*10+rem;
                even=even+rem*te;   //0+4*1=4    4+3*10=34  34+2*100=234  234+1*1000=1234    1234+0*10000=1234
                te=te*10;           //1*10=10    10*10=100  100*10=1000   1000*10=10000      10000*10=100000
            }
            else{
                os=os+rem;
                ocnt++;
                //odd=odd*10+rem;
                odd=odd+rem*to;
                to=to*10;
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

