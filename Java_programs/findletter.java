import java.util.Scanner;
public class findletter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String let=sc.nextLine();
        System.out.println("Enter search letter:");
        char ch=sc.next().charAt(0);
        int len=let.length();
        int cnt=0;
        String res=" ";
        for(int i=0;i<len;i++){
            if(let.charAt(i)==ch){
                res=res+i+",";
                cnt++;
            }
        }
        if(cnt>0)
            System.out.println(ch+" is found at index:"+res+"\b ");
        else
            System.out.println(ch+" is not found!");  
        sc.close();
    }
}
