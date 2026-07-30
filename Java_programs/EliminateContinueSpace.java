import java.util.Scanner;

public class EliminateContinueSpace {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a txt:");
        String s=scan.nextLine();
        String res="";
        int len=s.length();
        for(int i=0;i<len-1;i++){
           if(s.charAt(i)==' ' &&s.charAt(i+1) ==' ')
            continue;
           else if(s.charAt(i)=='\t'){
            System.out.println();
            continue;}
           else
            res=res+s.charAt(i);
            }
            System.out.print(res+s.charAt(len-1));
        
        scan.close();
        }  

    }

