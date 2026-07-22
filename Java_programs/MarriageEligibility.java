import java.util.Scanner;
public class MarriageEligibility{
    public static void main(String[] args) {
        System.out.println("Enter your Gender(Male/Female)");
        Scanner scan=new Scanner(System.in);
        String gen=scan.next();
        System.out.println("Enter your age ");
        int age=scan.nextInt();
        if ((gen.equalsIgnoreCase("Male")&& age>=18)||(gen.equalsIgnoreCase("Female")&& age>=21))
            {
             System.out.println("You are eligible for marriage");
        }
        else{
            System.out.println("You are not eligible for marriage");
        }
        scan.close();
    }
}
