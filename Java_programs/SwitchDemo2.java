import java.util.Scanner;
public class SwitchDemo2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter 2 Numbers:");
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println("Type any one\n1.Add(a or A)\t2.Sub(s or S)\t3.Mul(m or M)\t4.Div(d or D)\t5.Remain(r or R)\nEnter your choice:");
        char ch=scan.next().charAt(0);
        switch(ch)
    {
        case 'a':case 'A':
            System.out.println("Addition:"+(a+b));
            break;
        case 's':case 'S':
            System.out.println("Subtraction:"+(a-b));
            break;
        case 'm':case 'M':
            System.out.println("Multiplication:"+(a*b));
            break;
        case 'd':case 'D':
            System.out.println("Division:"+(a/b));
            break;
        case 'r':case 'R':
            System.out.println("Remainder:"+(a%b));
            break;
        default:
            System.out.println("Ivalid choice!");
    }

        scan.close();
    }
}
