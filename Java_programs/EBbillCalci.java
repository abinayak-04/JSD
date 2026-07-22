import java.util.Scanner;
public class EBbillCalci {
    public static void main(String[] args) {
        float totbill=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Units:");
        int unit=scan.nextInt();
        if(unit<=500){
            if(unit>=201 && unit<=400)
                totbill= (unit-200)*4.70f;
            else if(unit>=401 && unit<=500)
                totbill=(unit-400)*6.30f+(200*4.70f);
            else
                totbill=0;
            }
        else
            totbill=(unit-500)*8.40f+(300*4.70f)+(100*6.30f);
        scan.close();
        System.out.println("Total bill amount: "+totbill);

    }
}