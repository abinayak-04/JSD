import java.util.Scanner;
public class Discount{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Total purchased amount:");
        int totamt=scan.nextInt();
        float disamt=0.0f;
        if(totamt<6000){
            if(totamt<1000)
                System.out.println("Your discount amount: 0");
            else if(totamt>=1000 && totamt<=1999){
                disamt=(5.0f/100.0f)*totamt;
                System.out.println("Your discount is 5% and Discount amount is:"+disamt);}
            else if(totamt>=2000 && totamt<=3999){
                disamt=(7.0f/100.0f)*totamt;
                System.out.println("Your discount is 7% and Discount amount is:"+disamt);}
             else{
                disamt=(8.0f/100.0f)*totamt;
                System.out.println("Your discount is 8% and Discount amount is:"+disamt);}
        }
        else{
            disamt=(10.0f/100.0f)*totamt;
            System.out.println("Your discount is 10% and Discount amount is:"+disamt);
        }
        scan.close();
    }
}