package Advance_java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptiondemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter 2 numbers:");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=a%b;
            System.out.println("Remainder:"+c);
            System.out.print("Enter array size:");
            int size=sc.nextInt();
            int arr[]=new int[size];
            System.out.println("Array size accepted");
            int brr[]={11,22,33};
            System.out.println("2nd index value:"+brr[2]);
            System.out.println("3rd index value"+brr[3]);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch(InputMismatchException e){
            System.out.println("Type only numbers");
        }
        catch(NegativeArraySizeException e){
            System.out.println("Array size should be only positive numbers");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of range");
        }
        sc.close();
    }
}
