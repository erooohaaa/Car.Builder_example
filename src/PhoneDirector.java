public class PhoneDirector implements Builder1 {
    private String name;
    private String display;
    private String CPU;
    private String memory;
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
    private String network;
    private String SIM;
    private String security;
    private String charging;
    private String materials;

    @Override public void setName(String name) { this.name = name; }
    @Override public void setDisplay(String display) { this.display = display; }
    @Override public void setCPU(String CPU) { this.CPU = CPU; }
    @Override public void setMemory(String memory) { this.memory = memory; }
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
    @Override public void setNetwork(String network) { this.network = network; }
    @Override public void setSIM(String SIM) { this.SIM = SIM; }
    @Override public void setSecurity(String security) { this.security = security; }
    @Override public void setCharging(String charging) { this.charging = charging; }
    @Override public void setMaterials(String materials) { this.materials = materials; }

    @Override
    public Phone build() {
        return new Phone(name, display, CPU, memory, RAM, Battery, color, storage, camera,
                release, country, cost, OS, weight, dimensions, refreshRate, network,
                SIM, security, charging, materials);
    }
}
