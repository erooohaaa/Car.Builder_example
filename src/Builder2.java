public interface Builder2 {
    void setName(String name);
    void setDisplay(String display);
    void setCPU(String CPU);
    void setMemory(String memory);
    void setGPU(String GPU);
    void setRAM(String RAM);
    void setBattery(String battery);
    void setColor(String color);
    void setStorage(String storage);
    void setCamera(String camera);
    void setRelease(int release);
    void setCountry(String country);
    void setCost(String cost);




    Laptop build();
}
