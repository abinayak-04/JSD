# Math Fuctions

- Math.PI();
	- It prints the PI value which is 22/7 =3.141...
- Math.sin();
	- It returns the sin value of given value.
- Math.cos();
	- It returns the cos value of given value.
- Math.tan();
	- It returns the tan value of given value.
- Math.ceil();
	- It returns the highest value.
- Math.floor();
	- It returns the lowest value.
- Math.round();
	- It rounds the decimal or float number to the nearest integer.
- Math.sqrt();
	- It returns the square root of the given value.
- Math.abs();
	- It returns the absolute value(Positive numbers).
- Math.max();
	- It returns the maximum value from the given numbers.
- Math.min();
	- It returns the minimum value from the given numbers.
- Math.exp();
	- It returns Euler's number e raised to the power of the specified argument (e^a).
- Math.floorDivExact();
	- It returns the exact divided number not in decimals.
	- Ex: 13/5 = 2

**Example Program**
```java
public class Mathfun {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.sin(0));
        System.out.println(Math.cos(0));
        System.out.println(Math.tan(0));
        System.out.println(Math.ceil(12.10));
        System.out.println(Math.ceil(-12.10));
        System.out.println(Math.floor(12.90));
        System.out.println(Math.floor(-12.90));
        System.out.println(Math.round(18.50));
        System.out.println(Math.round(18.49));
        System.out.println(Math.sqrt(49));
        System.out.println(Math.abs(-100));
        System.out.println(Math.max(12,3));
        System.out.println(Math.min(12,3));
        System.out.println(Math.exp(0));
        System.out.println(Math.floorDivExact(13,5));
    }
}
```
**Output**
```bash
3.141592653589793
0.0
1.0
0.0
13.0
-12.0
12.0
-13.0
19
18
7.0
100
12
3
1.0
2
```
# Control Statements in Java
	
## Def: Condition based execution

**Condition:**
- a>34
- mark>=50
- m1>34 && m2>34 && m3>34
- !(m>=35)
- name.equals("admin") && pwd.equals("Password@123") 

### 1. Simple if

**Syntax:**
```java
		if(Condition)
			{
			 Statement;
			}
```

**Example Program**
```java
import java.util.Scanner;
public class controlstsmt {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter mark:");
        int mark=scan.nextInt();
        if(mark>49)
        {
            System.out.println("Result:Pass");
        }

    }
}
```

**Output**
```bash
Enter mark:
45
Enter mark:
50
Result:Pass
```
### 2. if else statement

**Syntax:**
```java
        if(Condition)
			{
			 True Statement;
			}
		else
			{
			 False Statement;
			}
```

**Example program**
```java
import java.util.Scanner;
public class controlstsmt {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter mark:");
        int mark=scan.nextInt();
        if(mark>34)
        {
            System.out.println("Result:Pass");
        }
        else{
            System.out.println("Result:Fail");
        }
    }
}
```

**Output**

Enter mark:
20
Result:Fail
Enter mark:
35
Result:Pass

### 3. if else if statement (or) else if ladder

(multiple chances)

**def:** infinite chances
**Syntax:**
```java
		if(condition 1)
		{
		 Statement 1;
		}
		else if(condition 2)
		{
		 Statement 2;
		}
		else if(condition 3)
		{
		 Statement 3;
		}
		--------------
		--------------
		else
		{
		 else Statement;
		} 
```

**Example Program**
```java
import java.util.Scanner;
public class controlstmt {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter 5 marks:");
        int m1=scan.nextInt();
        int m2=scan.nextInt();
        int m3=scan.nextInt();
        int m4=scan.nextInt();
        int m5=scan.nextInt();
        String res="";
        if(m1>34 && m2>34 && m3>34 && m4>34 && m5>34)
        {
           res="Pass";
        }
        else{
            res="Fail";
        }
        int tot=m1+m2+m3+m4+m5;
        float avg= tot/5.0f;
        String gra="";
        if(res=="Pass")
        {
            if(avg>=85)
                gra="Outstanding";
            else if(avg>=75)
                gra="Excellent";
            else if(avg>=65)
                gra="Good";
            else if(avg>=55)
                gra="Fair";
            else
                gra="Satisfactory";
        }
        else{
            gra="No grade because of fail.";
        }
        System.out.println("Total Marks:"+tot);
        System.out.println("Result:"+res);
        System.out.println("Percentage:"+avg);
        System.out.println("Grade:"+gra);
	scan.close();
    }
}
```
**Output**

1)Enter 5 marks:
45
67
32
86
76
Total Marks:306
Result:Fail
Percentage:61.2
Grade:No grade because of fail.
2)Enter 5 marks:
90
98
78
86
99
Total Marks:451
Result:Pass
Percentage:90.2
Grade:Outstanding

### 4. Nested if
	
**def:** A if statement with in if statement.
	
**Syntax:**
```java
		if(Condition)
		{
		 if(Condition)
		{
		 Statement;
		}
		}
```
