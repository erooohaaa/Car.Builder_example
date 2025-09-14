# 📌 Builder Pattern Implementation in Java

## 📖 Overview
This project demonstrates the **Builder Pattern** in Java using two products:  

- **📱 Phone**  
- **💻 Laptop**  

The Builder Pattern is used to construct complex objects step by step, making the code **clean, flexible, and readable**.  

---

## 🚀 Why Builder Pattern?
- ✅ Handles objects with many parameters (mandatory + optional).  
- ✅ Improves **readability** of client code.  
- ✅ Supports **immutability** (fields can be declared `final`).  
- ✅ Each method has **single responsibility** (sets one parameter).  

---

## 🛠️ Implementation

### Phone
Some fields (e.g., `name`, `release`, `country`) are declared as **final** for:  
- **Immutability**  
- **Reliability**  
- **Thread safety**  

### Laptop
Laptop follows the same Builder principle but includes more parameters (e.g., `GPU`).  

---

## 📂 Project Structure
src/
├── Main.java
├── Phone.java
├── PhoneDirector.java
├── Builder1.java
├── Laptop.java
├── LaptopDirector.java
├── Builder2.java

csharp
Копировать код

---

## 💡 Example Usage
```java
public class Main {
    public static void main(String[] args) {
        // 📱 Phone
        Builder1 phoneBuilder = new PhoneDirector();
        phoneBuilder.setName("Samsung Galaxy S24 Ultra");
        phoneBuilder.setDisplay("6.8-inch QHD+ AMOLED");
        phoneBuilder.setCPU("Snapdragon 8 Gen 3");
        phoneBuilder.setMemory("12GB");
        phoneBuilder.setRAM("12GB");
        phoneBuilder.setBattery("5000mAh");
        phoneBuilder.setColor("Phantom Black");
        phoneBuilder.setStorage("512GB");
        phoneBuilder.setCamera("200MP + 12MP + 10MP + 10MP");
        phoneBuilder.setRelease(2024);
        phoneBuilder.setCountry("South Korea");
        phoneBuilder.setCost("$1199");
        Phone phone = phoneBuilder.build();
        System.out.println(phone);

        // 💻 Laptop
        Builder2 laptopBuilder = new LaptopDirector();
        laptopBuilder.setName("MacBook Pro 16");
        laptopBuilder.setDisplay("16-inch Liquid Retina XDR");
        laptopBuilder.setCPU("Apple M3 Max");
        laptopBuilder.setMemory("32GB");
        laptopBuilder.setGPU("40-core GPU");
        laptopBuilder.setRAM("32GB");
        laptopBuilder.setBattery("100Wh");
        laptopBuilder.setColor("Space Black");
        laptopBuilder.setStorage("1TB SSD");
        laptopBuilder.setCamera("1080p FaceTime HD");
        laptopBuilder.setRelease(2023);
        laptopBuilder.setCountry("USA");
        laptopBuilder.setCost("$3499");
        Laptop laptop = laptopBuilder.build();
        System.out.println(laptop);
    }
}
🖥️ Example Output
pgsql
Копировать код
Phone{name=Samsung Galaxy S24 Ultra, display=6.8-inch QHD+ AMOLED, CPU=Snapdragon 8 Gen 3, memory=12GB, RAM=12GB, Battery=5000mAh, color=Phantom Black, storage=512GB, camera=200MP + 12MP + 10MP + 10MP, release=2024, country=South Korea, cost=$1199}

Laptop{name=MacBook Pro 16, display=16-inch Liquid Retina XDR, CPU=Apple M3 Max, memory=32GB, GPU=40-core GPU, RAM=32GB, Battery=100Wh, color=Space Black, storage=1TB SSD, camera=1080p FaceTime HD, release=2023, country=USA, cost=$3499}
⚡ Clean Code Principles Used
