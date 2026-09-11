import java.util.Scanner;

public class Stud3 {
    int rno;
    String name;
    char gender;
    float mark;
    boolean ismarried;
    Scanner scan=new Scanner(System.in);
    void getdata()
    {
        System.out.println("Enter rno, name ,gender, mark and is_married(true/false):");
        rno=scan.nextInt();
        name=scan.next();
        gender=scan.next().charAt(0);
        mark=scan.nextFloat();
        ismarried=scan.nextBoolean();
    }
    void dis()
    {
        System.out.println(rno+"   "+name+"     "+gender+"    "+mark+"    "+ismarried);
    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n=scan.nextInt();
        Stud3 s[]=new Stud3[n];
        for(int i=0;i<n;i++){
            s[i]=new Stud3();
            s[i].getdata();
        }
        for(int i=0;i<n;i++){
            s[i].dis();
        }
        //tot no. of students
        System.out.println("Total number of students:"+n);
        //count tot no. female students
        int cnt=0;
        for(int i=0;i<n;i++){
        if(s[i].gender=='f')
            cnt++;
        }
        System.out.println("Total number of female students:"+cnt);
        //display centum mark students
         System.out.println("---------Centum students list------------");
        for(int i=0;i<n;i++){
        if(s[i].mark==100)
            s[i].dis();
        }
        //display married students rno and name
        System.out.println("---------Married students rno and name------------");
         for(int i=0;i<n;i++){
        if(s[i].ismarried==true)
            System.out.println(s[i].rno+"   "+s[i].name);;
        }
        scan.close();
}
}
