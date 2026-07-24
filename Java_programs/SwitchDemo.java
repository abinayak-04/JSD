import java.util.Scanner;
public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter 2 Numbers:");
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println("Select any one\n1.Addition\t2.Subtraction\t3.Multiplication\t4.Division\t5.Remainder\nEnter your choice:");
        int ch=scan.nextInt();
        switch(ch)
    {
        case 1:
            System.out.println("Addition:"+(a+b));
            break;
        case 2:
            System.out.println("Subtraction:"+(a-b));
            break;
        case 3:
            System.out.println("Multiplication:"+(a*b));
            break;
        case 4:
            System.out.println("Division:"+(a/b));
            break;
        case 5:
            System.out.println("Remainder:"+(a%b));
            break;
        default:
            System.out.println("Ivalid choice!");
    }

        scan.close();
    }
}
