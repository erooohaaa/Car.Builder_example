public class LaptopDirector implements Builder2 {
    private String name;
    private String display;
    private String CPU;
    private String memory;
    private String GPU;
    private String RAM;
    private String Battery;
    private String color;
    private String storage;
    private String camera;
    private int release;
    private String country;
    private String cost;
    private String OS;
    private String weight;
    private String dimensions;
    private String refreshRate;
    private String keyboard;
    private String ports;
    private String cooling;
    private String speakers;
    private String materials;

    @Override public void setName(String name) { this.name = name; }
    @Override public void setDisplay(String display) { this.display = display; }
    @Override public void setCPU(String CPU) { this.CPU = CPU; }
    @Override public void setMemory(String memory) { this.memory = memory; }
    @Override public void setGPU(String GPU) { this.GPU = GPU; }
    @Override public void setRAM(String RAM) { this.RAM = RAM; }
    @Override public void setBattery(String battery) { this.Battery = battery; }
    @Override public void setColor(String color) { this.color = color; }
    @Override public void setStorage(String storage) { this.storage = storage; }
    @Override public void setCamera(String camera) { this.camera = camera; }
    @Override public void setRelease(int release) { this.release = release; }
    @Override public void setCountry(String country) { this.country = country; }
    @Override public void setCost(String cost) { this.cost = cost; }
    @Override public void setOS(String OS) { this.OS = OS; }
    @Override public void setWeight(String weight) { this.weight = weight; }
    @Override public void setDimensions(String dimensions) { this.dimensions = dimensions; }
    @Override public void setRefreshRate(String refreshRate) { this.refreshRate = refreshRate; }
    @Override public void setKeyboard(String keyboard) { this.keyboard = keyboard; }
    @Override public void setPorts(String ports) { this.ports = ports; }
    @Override public void setCooling(String cooling) { this.cooling = cooling; }
    @Override public void setSpeakers(String speakers) { this.speakers = speakers; }
    @Override public void setMaterials(String materials) { this.materials = materials; }

    @Override
    public Laptop build() {
        return new Laptop(name, display, CPU, memory, GPU, RAM, Battery, color, storage,
                camera, release, country, cost, OS, weight, dimensions, refreshRate,
                keyboard, ports, cooling, speakers, materials);
    }
}
