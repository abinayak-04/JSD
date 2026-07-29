import java.util.Scanner;

public class ReverseName {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Your Name:");
        String name=scan.nextLine();
        int n=name.length();
        char ch;
        for(int i=n-1;i>=0;i--){
            ch=name.charAt(i);
            System.out.print(ch);
        }
        scan.close();
    }
}
