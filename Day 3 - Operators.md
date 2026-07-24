# Operators

## 1. Arithmetic Operators
- Addition (+)	
- Subtraction (-)
- Multiplication (*)
- Division (/)
- Modulus (%)

*Note:* 0/0 is undefined, 5/0 is error, 0/5 is 0

**Example program**
```java
class Oper
{
public static void main(String args[])
{
int a=11;
int b=3;
int c=a+b*2;
System.out.println(c);
System.out.println((a+b)*2);
c=200-1+200;
System.out.println(c);
System.out.println(a%b);
System.out.println(6%3);
System.out.println(2%3);
System.out.println(2/3);
}
}
```

**Output**
```bash
17
28
399
2
0
2
0
```

## 2. Relational or Comparison Operators
- (<) less than
- (<=) less than and equal to
- (>) greater than
- (>=) greater than and equal to
- (==) comparison
- (!=) not equal to

*Note:* Don't use string when compare

*Example program**
```java
class Oper
{
public static void main(String args[])
{
int a=11;
int b=11;
System.out.println(a<b);
boolean c=a<=b;
System.out.println(c);
c=a>b;
System.out.println(c);
c=a>=b;
System.out.println(c);
c=a==b;
System.out.println(c);
c=a!=b;
System.out.println(c);
}
}
```

**Output**
```bash
false
true
false
true
true
false
```

## 3. Logical Operators
- (&&) logical and
		*Note:* Any condition is false, result will be false.
- (||) logical or
		*Note:* Any condition is True, result will be True.
- (!) logical not
		*Note:* True means False, False means True.

**Example program**
```java
class Oper
{
public static void main(String args[])
{
int m1=100;
int m2=100;
int m3=100;
int m4=100;
int m5=34;
boolean res=m1>34 && m2>34 && m3>34 && m4>34 && m5>34;
System.out.println("Result:"+res);
res=m1>34 || m2>34 || m3>34 || m4>34 || m5>34;
System.out.println("Result:"+res);
res=!(m1>34 && m2>34 && m3>34 && m4>34 && m5>34);
System.out.println("Result:"+res);
}
}
```

**Output**
```bash
Result:false
Result:true
Result:true
```
## 4.Assignment operator

	It is used to assign (store) a value into a variable.

- a += 10 (or) a = a + 10
- a -= 5 (or)  a = a - 5
- a *= 2 (or)  a = a * 2
- a /= 5 (or)  a = a / 5
- a %= 3 (or)  a = a % 3


## 5. Increment and Decrement operators

### i) Increment operator (++)
- It is used to increase the value of a variable by 1.

Ex:	
```java 
int count = 5;
count++; //post increment
++count; //pre-increment
```
### ii)Decrement operator (--)
- It is used to decrease the value of a variable by 1.

*Ex:*	
```java 
int count = 5;
count--; //post decrement
--count; //pre-decrement
```

*Note:*
- System.out.println(++a)	---> add 1 to value of a and prints result
- System.out.println(a++)	---> add 1 to the value a and store it memory, but prints the previous value of a
- System.out.println(--a)	---> Subtract 1 from value of a and prints result
- System.out.println(a--)	---> Subtract 1 from value a and store it memory, but prints the previous value of a

**Example Program**
```java
public class Ex {
public static void main(String[] args) {
    int a=200;
    System.out.println(a);
    System.out.println(a++);
    System.out.println(++a);
    System.out.println(a);
    System.out.println(--a);
    System.out.println(a--);
    System.out.println(a);
}
}
```

**Output**
```bash
200
200
202
202
201
201
200
```

## 6.Conditional or Ternary Operator
	
	It is a short form of if-else statement. It uses three operands. They are
- Condition
- Expression when condition is true
- Expression when condition is false

**Syntax:**
- 	variable= condition ? expression1(true part) : expression2(false part)

**Example program**
```java
public class Ex {
public static void main(String[] args) {
    int a=200;
    int b=300;
    int c;
    c=(a>b)?a:b;
    System.out.println(c);
}
}
```

**Output**
```bash
300
```
## 7. Bitwise Operators
- Bitwise AND (&)
- Bitwise OR (|)
- Bitwise NOT (~)
- Exclusive OR (^)

*Note:*
-  True --> 1
- false --> 0

### Truth Table

| A | B | AND (`&`) | OR (`|`) | XOR (`^`) |
|:-:|:-:|:---------:|:--------:|:---------:|
| 1 | 1 | 1 | 1 | 0 |
| 1 | 0 | 0 | 1 | 1 |
| 0 | 1 | 0 | 1 | 1 |
| 0 | 0 | 0 | 0 | 0 |

### NOT (`~`)

| A | NOT |
|:-:|:---:|
| 0 | 1 |
| 1 | 0 |

