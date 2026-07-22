package Java_programs;
import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=scan.nextInt();
        if(age>=18)
        {
            System.out.println("You are eligible to Vote.");
        }
        else{
            System.out.println("You are not eligible to Vote");
        }
    }
}