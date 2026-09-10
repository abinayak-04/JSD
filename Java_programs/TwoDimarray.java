import java.util.Scanner;

public class TwoDimarray {
    public static void main(String[] args) {
       //int arr[][]={{11,22,33},{44,55,66},{77,88,99}};
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter row and colum size:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter matrix values:"+r+"X"+c);
        for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            arr[i][j]=sc.nextInt();
        }
        System.out.println();
       }
       System.out.println("Result array:");
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print("  "+arr[i][j]);
        }
        System.out.println();
       }
       sc.close();
    }
}
