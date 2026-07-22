package Java_programs;

import java.util.Scanner;
public class OddorEven {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=scan.nextInt();
        if(n%2==0)
        {
            System.out.println("The given number "+n+" is Even");
        }
        else{
            System.out.println("The given number "+n+" is Odd");
        }
    }
}