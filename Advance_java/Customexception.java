package Advance_java;

import java.util.Scanner;

class AgeException extends Exception{
    Scanner sc=new Scanner(System.in);
    AgeException(){
    System.out.print("Enter age:");
    int age=sc.nextInt();
    if(age>=18){
        System.out.println("Age accepted");
    }
    else{
        try{
            throw new Exception("Below the age 18 is not accepted");
        }
        catch(Exception e){
            System.out.println(e);
        }
        new AgeException();
    } 
}
}
public class Customexception {
    public static void main(String[] args) {
        new AgeException();
    }
}
