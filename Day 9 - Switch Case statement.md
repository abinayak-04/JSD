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
int k=1;
Switch(k)
{
    case 1:
        System.out.println("One");
    case 2:
        System.out.println("Two");
    case 3:
        System.out.println("Three");
    default:
        System.out.println();
}
```
