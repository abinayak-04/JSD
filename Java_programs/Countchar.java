import java.util.Scanner;

public class Countchar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Text:");
        String txt=scan.next();
        int len=txt.length();
        int acnt=0,dcnt=0,scnt=0;
        for(int i=0;i<len;i++){
            if(txt.charAt(i)>='a' && txt.charAt(i)<='z')
                acnt++;
             if(txt.charAt(i)>='0' && txt.charAt(i)<='9')
                dcnt++;
             if(txt.charAt(i)=='.' || txt.charAt(i)=='&' || txt.charAt(i)=='*' || txt.charAt(i)=='^'||txt.charAt(i)==')' || txt.charAt(i)=='('||txt.charAt(i)=='%' || txt.charAt(i)=='$'||txt.charAt(i)=='!' || txt.charAt(i)=='#')
                scnt++;
            if (txt.charAt(i)=='@')
                break;
        }
        System.out.println("Alphabets:"+acnt);
        System.out.println("Numbers:"+dcnt);
        System.out.println("Special characters:"+scnt);

        scan.close();
    }
}
