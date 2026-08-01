# Function
- It is a named set of instructions.
- It runs a specific task or solves a small part of a bigger problem.
### Why we use functions?
- To avoid repeating the same code.
- Instead of copying code again & again, call the function whenever needed.
- It makes code cleaner, easier to update and easier to understand.

## User-defined function or methods

**Demo program**
```java
public class UserFunDemo {
    public static void main(String args[]) {
        abinaya();
        Pavya(); 
        Pooji();
        abinaya();
    }
}
static void abinaya() {
    System.out.println("I am abinaya");
}

static void pavya() {
    System.out.println("I am Pavya");
}

static void pooji() {
    System.out.println("I am pooji");
}
```java

**Output**
```bash
I am abinaya
I am Pavya
I am pooji
I am abinaya
```
### Pre-request to learn user defined functions or method
- ( )
- Calling function/method
- It can be used many times in program
-  Ex:- abinaya(); // in 4th line of demo code
- Called function/method
- It should be used only once in code.
- Ex:- static void abinaya();
### Arguments or parameters
- {arguments}
- It is used inside called functions(datatype)
- In calling functions (variables/value)
- void----> No return(don't use return keyword)
- return
    - It is must if dont use of void.
    - It is used only in the last line of code.