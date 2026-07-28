# Switch Case Statement

**Def:** Expression based execution.

**Expression:**
- `var`
- `var + 1`
- `a + b / c`
- `a * c`

### Syntax
```java
Switch(expression)
{
    case value1:
        Statement;
        break;
    case value2:
        Statement;
        break;
    case value2:
        Statement;
        break;
    ------------
    ------------
    default:
        default statement;
}
```

*Note:* case values can be inifinite.

**Example Program**
```java
import java.util.Scanner;
public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number from 1 to 5:");
        int k=scan.nextInt();
switch(k)
{
    case 1:
        System.out.println("One");
        break;
    case 2:
        System.out.println("Two");
        break;
    case 3:
        System.out.println("Three");
        break;
    case 4:
        System.out.println("Four");
        break;
    case 5:
        System.out.println("Five");
        break;
    default:
        System.out.println();
}
scan.close();
    }
}
```
**Output**
```bash
Enter a number from 1 to 5:
3
Three
```
