import java.util.Scanner;

public class Findvowels {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name=scan.nextLine();
        int len=name.length();
        int cnt=0;
        char c;
        for(int i=0;i<len;i++){
           c=name.charAt(i);
            if(c=='A'|| c=='a'||c=='e'||c=='E' || c=='i'||c=='I' || c=='o'||c=='O' || c=='u'||c=='U'){
                System.out.print(" "+c);
                cnt++;
            }
        }

        System.out.println("\n No.of vowels ("+cnt+")");
        scan.close();
    }
}
