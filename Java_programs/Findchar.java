import java.util.Scanner;

public class Findchar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=scan.next();
        System.out.print("Enter the character to find:");
        char ch=scan.next().charAt(0);
        int len=name.length();
        int cnt=0;
        for(int i=0;i<len;i++){
           if(name.charAt(i)==ch)
                {
                    System.out.println(ch+" is found at index:"+i);
                    cnt++;
                }
            }
        if(cnt==0){
            System.out.println(ch+" is not found");
        }
        scan.close();
    
}
}
