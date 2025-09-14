# Report: Phone.Builder1 Implementation in Java

## Product Choice
For this task, the chosen product was **Phone**, implemented with the **Builder1 Pattern**.  
Builder1 makes it possible to create an object with mandatory and optional parameters in a clear and readable way.

---

## Why `final` fields are used
All fields in the `Phone` class are declared as `final` to ensure:
- **Immutability** – the object cannot be modified after creation.  
- **Reliability** – protects fields from accidental changes in the code.  
- **Thread safety** – immutable objects are safer to use in multithreaded environments.  

---

## Applied *Clean Code* Principles
1. **Readable names**  
   - Fields and methods are clearly named: `name`, `release`, `country`, `build()`.  
   - Code is self-explanatory.

2. **Minimalism and no duplication**  
   - Only essential logic is included.  
   - Builder1 methods return `this`, which allows fluent method chaining.

3. **Single Responsibility per method**  
   - Each builder1 method sets exactly one parameter.  
   - `build()` is only responsible for constructing the `Phone`.

4. **Clear interface for usage**  
   - Client code is easy to read and resembles natural language.

---

## Example Usage
```java
public class Main {
    public static void main(String[] args) {
        Phone car1 = new Phone.Builder1("Honda")
                .release(2022)
                .country("South Korea")
                .build();

        Phone car2 = new Phone.Builder1("BMW")
                .release(2010)
                .build();

        System.out.println(car1);
        System.out.println(car2);
    }
}
