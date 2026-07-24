import java.util.Scanner;
public class SwitchDemo1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter 2 Numbers:");
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println("Type any one\n1.Add\t2.Sub\t3.Mul\t4.Div\t5.Remain\nEnter your choice:");
        String ch=scan.next();
        switch(ch)
    {
        case "add":
            System.out.println("Addition:"+(a+b));
            break;
        case "sub":
            System.out.println("Subtraction:"+(a-b));
            break;
        case "mul":
            System.out.println("Multiplication:"+(a*b));
            break;
        case "div":
            System.out.println("Division:"+(a/b));
            break;
        case "remain":
            System.out.println("Remainder:"+(a%b));
            break;
        default:
            System.out.println("Ivalid choice!");
    }

        scan.close();
    }
}
