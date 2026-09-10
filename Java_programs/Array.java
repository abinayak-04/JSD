import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        //int arr[]={1,3,44,12,9,7,33,55,66,77,88,99};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter array value of index "+i+": ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println("Array of ["+i+"]="+arr[i]);
        }
        sc.close();
    }
}
// find max
// find min
// sum of array
//sum of even no
// dispaly in ascending order