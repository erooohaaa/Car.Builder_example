public class Main {
    public static void main(String[] args) {

        Builder1 builder1 = new PhoneDirector();
        builder1.setName("Samsung Galaxy S24 Ultra");
        builder1.setDisplay("6.8-inch QHD+ AMOLED");
        builder1.setCPU("Snapdragon 8 Gen 3");
        builder1.setMemory("12GB");
        builder1.setRAM("12GB");
        builder1.setBattery("5000mAh");
        builder1.setColor("Phantom Black");
        builder1.setStorage("512GB");
        builder1.setCamera("200MP + 12MP + 10MP + 10MP");
        builder1.setRelease(2024);
        builder1.setCountry("South Korea");
        builder1.setCost("$1199");

        Phone phone = builder1.build();
        System.out.println(phone);


        Builder2 builder2 = new LaptopDirector();
        builder2.setName("ASUS ROG Zephyrus G14");
        builder2.setDisplay("14-inch QHD+ 165Hz");
        builder2.setCPU("AMD Ryzen 9 7940HS");
        builder2.setMemory("16GB DDR5");
        builder2.setGPU("NVIDIA RTX 4070");
        builder2.setRAM("16GB");
        builder2.setBattery("76Wh");
        builder2.setColor("Eclipse Gray");
        builder2.setStorage("1TB SSD");
        builder2.setCamera("1080p IR Webcam");
        builder2.setRelease(2023);
        builder2.setCountry("Taiwan");
        builder2.setCost("$1999");

        Laptop laptop = builder2.build();
        System.out.println(laptop);
    }
}
