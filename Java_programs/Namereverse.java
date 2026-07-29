import java.util.Scanner;

public class Namereverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Your Name:");
        String name=scan.next();
        int len=name.length();
        int j=1;
        for(int i=0;i<len/2;i++){
            System.out.print(name.charAt(i)+""+name.charAt(len-j));
            j++;
        }
        if(len%2!=0)
            System.out.print(name.charAt(len/2));
        scan.close();
    }
}
