public class Main {
    public static void main(String[] args) {
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
        phoneBuilder.setOS("Android 14");
        phoneBuilder.setWeight("232g");
        phoneBuilder.setDimensions("162.3 x 79 x 8.9 mm");
        phoneBuilder.setRefreshRate("120Hz");
        phoneBuilder.setNetwork("5G");
        phoneBuilder.setSIM("Dual SIM");
        phoneBuilder.setSecurity("Fingerprint, Face ID");
        phoneBuilder.setCharging("45W Fast Charging");
        phoneBuilder.setMaterials("Glass, Aluminum");

        Phone phone = phoneBuilder.build();
        System.out.println(phone);

        Builder2 laptopBuilder = new LaptopDirector();
        laptopBuilder.setName("ASUS ROG Zephyrus G14");
        laptopBuilder.setDisplay("14-inch QHD+ 165Hz");
        laptopBuilder.setCPU("AMD Ryzen 9 7940HS");
        laptopBuilder.setMemory("16GB DDR5");
        laptopBuilder.setGPU("NVIDIA RTX 4070");
        laptopBuilder.setRAM("16GB");
        laptopBuilder.setBattery("76Wh");
        laptopBuilder.setColor("Eclipse Gray");
        laptopBuilder.setStorage("1TB SSD");
        laptopBuilder.setCamera("1080p IR Webcam");
        laptopBuilder.setRelease(2023);
        laptopBuilder.setCountry("Taiwan");
        laptopBuilder.setCost("$1999");
        laptopBuilder.setOS("Windows 11");
        laptopBuilder.setWeight("1.65kg");
        laptopBuilder.setDimensions("312 x 227 x 19.5 mm");
        laptopBuilder.setRefreshRate("165Hz");
        laptopBuilder.setKeyboard("RGB Backlit");
        laptopBuilder.setPorts("USB-C, HDMI, USB-A, Audio Jack");
        laptopBuilder.setCooling("Dual-fan cooling");
        laptopBuilder.setSpeakers("Dolby Atmos Speakers");
        laptopBuilder.setMaterials("Aluminum, Magnesium Alloy");

        Laptop laptop = laptopBuilder.build();
        System.out.println(laptop);
    }
}
