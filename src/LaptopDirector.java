public class LaptopDirector implements Builder2 {
private String name;
private String display;
private String CPU;
private String memory;
private String GPU;
private String RAM;
private String Battery;
private String color;;
private String storage;
private String camera;
private int release;
private String country;
private String cost;
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public void setCPU(String CPU) {
        this.CPU  = CPU;
    }

    @Override
    public void setMemory(String memory) {
        this.memory = memory;
    }

    @Override
    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    @Override
    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    @Override
    public void setBattery(String battery) {
        this.Battery = battery;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public void setCamera(String camera) {
            this.camera = camera;
    }

    @Override
    public void setRelease(int release) {
        this.release = release;
    }

    @Override
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public void setCost(String cost) {
        this.cost = cost;
    }

    @Override
    public Laptop build() {
        return new Laptop(
                name,
                display,
                CPU,
                memory,
                GPU,
                RAM,
                Battery,
                color,
                storage,
                camera,
                release,
                country,
                cost
        );
    }
}
