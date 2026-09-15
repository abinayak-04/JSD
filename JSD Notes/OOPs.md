# OOPS Concept
### ABSTRACT CLASS:

* **definition:** set of complete and incomplete methods.
* **Purpose:** methods override purpose
* **SYNTAX:** 
  ```java
  abstract class classname
  {
      variable => should be declared & defined; (can)
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
*
---
### Access Specifier
1. Private
2. Public
3. Protected
4. Default

| Access Specifier | Pack 1 (base) | Pack 1 (derived) | Main | Pack 2 (base) | Pack 2 (derived) |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **Private** | yes | NO | NO | No | NO |
| **Public** | yes | yes | yes | Yes | Yes |
| **Protected** | yes | yes | yes | NO | Yes |
| **Default** | yes | yes | yes | No | No |