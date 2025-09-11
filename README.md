# Report: Car.Builder Implementation in Java

## Product Choice
For this task, the chosen product was **Car**, implemented with the **Builder Pattern**.  
Builder makes it possible to create an object with mandatory and optional parameters in a clear and readable way.

---

## Why `final` fields are used
All fields in the `Car` class are declared as `final` to ensure:
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
   - Builder methods return `this`, which allows fluent method chaining.

3. **Single Responsibility per method**  
   - Each builder method sets exactly one parameter.  
   - `build()` is only responsible for constructing the `Car`.

4. **Clear interface for usage**  
   - Client code is easy to read and resembles natural language.

---

## Example Usage
```java
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car.Builder("Honda")
                .release(2022)
                .country("South Korea")
                .build();

        Car car2 = new Car.Builder("BMW")
                .release(2010)
                .build();

        System.out.println(car1);
        System.out.println(car2);
    }
}
