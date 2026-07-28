# User Input
## How to get value at runtime/dynamic?

## Steps to Get User Input in Java using Scanner

### Step 1: Import the Scanner Class

```java
import java.util.Scanner;
```

---

### Step 2: Create a Scanner Object

```java
Scanner scan = new Scanner(System.in);
```

---

### Step 3: Read Different Types of Input

#### String (Single Word)

```java
String data = scan.next();
```

#### String (Full Line)

```java
String data = scan.nextLine();
```

#### Integer

```java
int mark = scan.nextInt();
```

#### Float

```java
float avg = scan.nextFloat();
```

#### Double

```java
double d = scan.nextDouble();
```

#### Long

```java
long l = scan.nextLong();
```

#### Short

```java
short s = scan.nextShort();
```

#### Byte

```java
byte b = scan.nextByte();
```

#### Boolean

```java
boolean bo = scan.nextBoolean();
```

#### Character

```java
char c = scan.next().charAt(0);
```

---

### Step 4: Close the Scanner

```java
scan.close();
```

*Note:*
  * next - does  not accepts space in string.
  scan.next();

  * nextLine - accepts space in string.
  scan.nextLine();

**Example program**
```java
import java.util.Scanner;
class Runtime
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = scan.next();
        System.out.println("Your Name: " + name);
        scan.close();
    }
}
```

**Output**
```bash Enter Your Name: Abinaya K
Your Name: Abinaya
```

**Task 1 - Get 5 marks from user, find total marks and its average.**

*Program*
```java
import java.util.Scanner;
class Task1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter mark1:");
	      int m1=scan.nextInt();
	      System.out.println("Enter mark2:");
	      int m2=scan.nextInt();
	      System.out.println("Enter mark3:");
	      int m3=scan.nextInt();
	      System.out.println("Enter mark4:");
	      int m4=scan.nextInt();
	      System.out.println("Enter mark5:");
	      int m5=scan.nextInt();
	      System.out.println("Total marks:"+(m1+m2+m3+m4+m5));
	      System.out.println("Average marks:"+(m1+m2+m3+m4+m5)/5.0f);
    }
}
```
*Output*
```bash
Enter mark1:
98
Enter mark2:
89
Enter mark3:
78
Enter mark4:
100
Enter mark5:
76
Total marks:441
```

# String Functions
- toUpperCase(); - converts all the letters to uppercase.
- toLowerCase(); - converts all the letters to lowercase.
- length; -returns the length of the string.
- charAt(); -returns the character present at the specified index of the string.
- indexOf(); -returns the index of the given character in the string.
- equals(); -checks whether the given two strings are same(case sensitive).
- equalsIgnoreCase(); -similar to equals() but ignores the case of the letters.
- substring(); -returns subset of the string from the given index.
- concat(); -concatenates new words to the string.
- compareTo(); -compares the ascii value of the letters of the string and returns their difference.
- hashCode(); -returns the ascii value of the given letter.
- startswith(); -checks whether the string starts with the given char or letters(case sensitive).
- endswith(); -checks whether the string ends with the given char or letters(case sensitive).
- repeat(); -repeats the string with given no. of count.
- matches(); -checks whether the string matches the pattern or words(case sensitive).
- split(); -divides a string into an array of substrings based on a specified delimiter or regular expression.

**Example Program**
```java
import java.util.Scanner;
public class Strfun {
    public static void main(String[] args) {
        String name="ABINAYA";
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf("A"));
        System.out.println(name.equals("abinaya"));
        System.out.println(name.equalsIgnoreCase("abinaya"));
        System.out.println(name.substring(5));
        System.out.println(name.substring(2, 5));
        System.out.println(name.concat(" K"));
        System.out.println(name.compareTo("pavya"));
        System.out.println(name.compareTo("abirami"));
        System.out.println("N".hashCode());
        System.out.println("r".hashCode());
        System.out.println("starts with:"+name.startsWith("ab"));
        System.out.println("ends with:"+name.endsWith("YA"));
        System.out.println(""+name.repeat(5));
        name="Abi,na,ya";
        String arr[]=name.split(",");
        System.out.println(arr[0]);
        System.out.println(arr[2]);
        System.out.println(arr.length);
        System.out.println(name.matches(".......ya"));
        System.out.println(name.matches(".......YA"));
    }
}
```
**Output**
```bash
ABINAYA
ABINAYA
abinaya
7
A
0
false
true
YA
INA
ABINAYA K
-47
-32
78
114
starts with:false
ends with:true
ABINAYAABINAYAABINAYAABINAYAABINAYA
Abi
ya
3
true
false
```
