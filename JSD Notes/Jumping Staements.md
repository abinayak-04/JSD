# Jumping Statements
**Def: Moves the control from one statement to another statement**

## 1. Continue
- Skip the remaining statement 
- Directly move on to increment position. 

## 2. Break
- terminate or end loop

*Note*
- Continue: only works inside the loop.
- Break: works on both loop and switch


**Continue Example Program 1**
```java
public class JumpDemo{
    public static void main(String[] args){
        for(int i=5;i<=40;i++){
            if(i<=30)
            continue;
            System.out.print(i+" ")
        }
    }
}

**Output**
```bash
31 32 33 34 35 36 37 38 39 40
```
**Continue Example Program 2**
```java
public class JumpDemo{
    public static void main(String[] args){
        for(int i=5;i<=40;i++){
            if(i>=30 ||i<=10)
            continue;
            System.out.print(i+" ")
        }
    }
}

**Output**
```bash
11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29
```
**Continue Example Program 3**
```java
public class JumpDemo{
    public static void main(String[] args){
        for(int i=5;i<=40;i++){
            if( i>=10 && i<30)
            continue;
            System.out.print(i+" ")
        }
    }
}

**Output**
```bash
5 6 7 8 9 31 32 33 34 35 36 37 38 39 40
```

**Break Example Program 1**
```java
public class JumpDemo{
    public static void main(String[] args){
        for(int i=5;i<=40;i++){
            System.out.print(i+" ")
            if( i<=30)
            break; 
        }
        System.out.print(" end ")
    }
}

**Output**
```bash
5 end
```