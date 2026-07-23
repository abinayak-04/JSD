# Escape Sequence or Format Specifier

**Purpose**: for the alignment purpose

- \n	- cursor moves to new line
- \t	- tab space
- \b	- backspace
- \r	- over written
- \"	- double quotes
- \'	- single quotes
- \\	- single slash

**Example Program**
```java
class Sample
{
public static void main(String args[])
{
System.out.print("Welcome to Java\n"); //to print in a new line
System.out.println("Java is platform \t independent "); //for tab space
System.out.println("Java is case sensitive\b "); //for backspace
System.out.println("Java default \rtype is String "); //for overwriting
System.out.println("Java \"default\" type is String "); // for double quotes
System.out.println("Java default 'type' is String "); // for single quotes
System.out.println("Java supports oops partially \\ "); //to print slash
System.out.println();//accepts empty
}
}
```
**Output**
```bash
Welcome to Java
Java is platform         independent
Java is case sensitiv
type is String
Java "default" type is String
Java default 'type' is String
Java supports oops partially \

```

## Java Datatypes 
1. Number:
	- byte		-  1 byte = 8 bits = 2^8 = 256/2 = (-128 to 127)
	- short	-  2 byte = 16 bits = 2^16 = 65534/2 (-32768 to 32767)
	- int	 - 4 byte = 32 bits = 2^32 = 4294967296/2 = (-2147483648 to 2147483647)
	- long 	-  8 byte = 64 bits = 2^64 / 2 = (-9223372036854775808 to 9223372036854775807)
2. Decimal:
	- float	 - 4 bytes (8 digits)
	- double -	8 bytes (17 digits)
3. text:
	- char		-  1 byte 		char c = '#'; char c = '\n';
	- string -	infinite 	string name = "Abi";
4. true or false:
	- boolean -	1 bit 		boolean v = true; boolean v = 12 < 13

**Example program**
```java
public class Datatypes {
	public static void main(String[] args) {
		byte b=127;
		short s=32767;
		int num=2147483647;
		long l=9223372036854775807L;
		float f=2.345678f;
		double d=0.12234467890987d;
		boolean bo=true;
		char c='@';
		String str="Abi";
		System.out.println("byte:"+b);
		System.out.println("short:"+s);
		System.out.println("integer:"+num);
		System.out.println("long:"+l);
		System.out.println("Float:"+f);
		System.out.println("double:"+d);
		System.out.println("boolean:"+bo);
		System.out.println("char:"+c);
		System.out.println("string:"+str);
	}
}
```

**Output**
```bash 
byte:127
short:32767
integer:2147483647
long:9223372036854775807
Float:2.345678
double:0.12234467890987
boolean:true
char:@
string:Abi
```
