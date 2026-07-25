# Introduction to Programming

## Program
- Set of instructions.

### Purpose of programming
- To reduce man power
- Fast and efficiency
- Accuracy
- Problem solving
- Automatic
- Secure storage

## Variables
- Variable is a user defined identifier.
- Storing data in RAM.
- Temporary memory.
- The value can be changed during the execution of  the program.
- Example: Pendrive, Memory card.

### Variable naming rules
- must start with alphabets (a-z) or _(underscore)
- do not start with number, but we can use second letter onwards
- keywords or reserved words are not allowed
- special characters are not allowed exepect(_)
- space not allowed
- variable name must be unique

## Constant
- The value canot be changed during the execution of the program.
- Example: CD-r, DVD-r

## Key words and Reserved words in java

1. `switch`
2. `for`
3. `static`
4. `break`
5. `continue`
6. `return`
7. `int`
8. `while`
9. `public`
10. `private`
11. `void`
12. `double`
13. `protected`
14. `long`
15. `float`
16. `do`
17. `case`
18. `new`
19. `byte`
20. `class`
21. `if`
22. `else`
23. `char`
24. `enum`
25. `abstract`
26. `boolean`
27. `short`
28. `try`
29. `super`
30. `catch`
31. `throw`
32. `throws`
33. `extends`
34. `implements`
35. `finally`
36. `final`
37. `null`
38. `this`

# Looping or iterator

**Def:** A set of same statements executes more than one times until condition is false.

## Types

1. for loop - fixed iteration
2. while loop - unfixed iteration with entry loop
3. do...while loop - unfixed iteration with exit loop
4. nested loop - a loop within a loop

## 1. for loop

**Syntax**

```text
for(intial;condition;increment/decrement)
{
    Statement;
}
```
### Execution Steps

**Step 1:** Initial (Starting value)

**Ex:**

```java
int i = 1;
```

**Step 2:** Condition (true / false)

**Ex:**

```java
i <= 10
```

- If true goes to **Step 3**.
- If false terminates the loop.

**Step 3:** Statement

**Ex:**

```java
System.out.print(i);
```

**Step 4:** Increment / Decrement

**Ex:**

```java
i++;
```

or

```java
i = i + 1;
```

or

```java
i += 1;
```

**Step 5:** Go to Step 2

---

**Example Program**

```java
for (int i = 5; i < 17; i += 3)
{
    System.out.print(i);
}
```
