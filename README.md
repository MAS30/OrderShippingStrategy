# Order Shipping Strategy Example

Demonstration of **Open/Closed Principle** and **Strategy Pattern** in Java (Order–Shipping example).

---

## Description
The `Order` class delegates shipping cost and date calculations to a `Shipping` strategy.  
New shipping types can be added (e.g., `Ground`, `Air`, `Sea`) **without changing** the `Order` class — demonstrating the **Open/Closed Principle**.

---

## Design Principles Applied
| Principle | Description |
|------------|--------------|
| **Open/Closed Principle** | Add new shipping methods without modifying existing classes |
| **Strategy Pattern** | Shipping behavior is interchangeable at runtime |
| **Single Responsibility** | Each class handles one specific concern |
| **Dependency Inversion** | `Order` depends on `Shipping` interface, not specific types |

---

## How to Run
You can test this on [Programiz Online Java Compiler](https://www.programiz.com/java-programming/online-compiler).

1. Copy all `.java` files into the editor.
2. Run the `Main.java` file.

## Clean Code Practices
- Low coupling and high cohesion  
- Descriptive names  
- Consistent indentation and structure  
- Easily extendable codebase
