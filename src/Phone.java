public class Phone {
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

    public Phone(String name, String display, String CPU, String memory,
                 String RAM, String Battery, String color, String storage,
                 String camera, int release, String country, String cost,
                 String OS, String weight, String dimensions, String refreshRate,
                 String network, String SIM, String security, String charging, String materials) {
        this.name = name;
        this.display = display;
        this.CPU = CPU;
        this.memory = memory;
        this.RAM = RAM;
        this.Battery = Battery;
        this.color = color;
        this.storage = storage;
        this.camera = camera;
        this.release = release;
        this.country = country;
        this.cost = cost;
        this.OS = OS;
        this.weight = weight;
        this.dimensions = dimensions;
        this.refreshRate = refreshRate;
        this.network = network;
        this.SIM = SIM;
        this.security = security;
        this.charging = charging;
        this.materials = materials;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name=" + name +
                ", display=" + display +
                ", CPU=" + CPU +
                ", memory=" + memory +
                ", RAM=" + RAM +
                ", Battery=" + Battery +
                ", color=" + color +
                ", storage=" + storage +
                ", camera=" + camera +
                ", release=" + release +
                ", country=" + country +
                ", cost=" + cost +
                ", OS=" + OS +
                ", weight=" + weight +
                ", dimensions=" + dimensions +
                ", refreshRate=" + refreshRate +
                ", network=" + network +
                ", SIM=" + SIM +
                ", security=" + security +
                ", charging=" + charging +
                ", materials=" + materials +
                '}';
    }
}
