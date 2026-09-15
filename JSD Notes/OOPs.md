# OOPS Concept
### ABSTRACT CLASS:

* **definition:** set of complete and incomplete methods.
* **Purpose:** methods override purpose
* **Syntax:** 
  ```java
  abstract class classname
  {
      variable => should be declared & defined;
      method => can be complete/incomplete.
  }
  ```
* *Objects cannot be created for abstract class*

---

### Abstraction:
- Showing only essential information, hiding other details.

* **Real time Eg:** 
  1. **car driver** - driver knowing how to apply break, horn, accelerator but not the mechanism behind them.
  2. **ATM machine**
  3. **TV remote**
  * *i.e. private data is not shown but the public data is shown.*

---

### Encapsulation:
Wrapping of data.

* **Eg:** Capsule tablets
* **Technical explanation:** class containing variables & methods.
* *private - variables specified using private is accessible only inside that specific class.*

---
### Access Specifier
1. Private
2. Public
3. Protected
4. Default

| Access Specifier | Pack 1 (base) | Pack 1 (derived) | Pack 1 (Main) | Pack 2 (base) | Pack 2 (derived) |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **Private** | Yes | No | No | No | No |
| **Public** | Yes | Yes | Yes | Yes | Yes |
| **Protected** | Yes | Yes | Yes | No | Yes |
| **Default** | Yes | Yes | Yes | No | No |

---
### Exception Handling
- To avoid runtime or dynamic errors
#### Types
1. Checked Exceptions(compile time)
2. Runtime Exceptions(runtime)

#### Inbuilt Exception
- ArthmeticException    (0/0,anything/0)
- InputMismatchException    (wrong input format)
- ArrayIndexOutOfBoundsException    (out of range)
- NegativeArraySizeException    (we can't declare negative size)
- FileNotFoundException

#### Custom or Userdefined Exception
- AgeException
- PasswordException

**Syntax**
```java
try
{
    //write code
}
catch(Exceptionname obj)
{
    //only if error found in try block
    //catch iis must
}
finally
{
//optional
//works even if eeror not found
}
```