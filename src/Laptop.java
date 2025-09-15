public class Laptop {
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

    public Laptop(String name, String display, String CPU, String memory, String GPU,
                  String RAM, String Battery, String color, String storage, String camera,
                  int release, String country, String cost, String OS, String weight,
                  String dimensions, String refreshRate, String keyboard, String ports,
                  String cooling, String speakers, String materials) {
        this.name = name;
        this.display = display;
        this.CPU = CPU;
        this.memory = memory;
        this.GPU = GPU;
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
        this.keyboard = keyboard;
        this.ports = ports;
        this.cooling = cooling;
        this.speakers = speakers;
        this.materials = materials;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name=" + name +
                ", display=" + display +
                ", CPU=" + CPU +
                ", memory=" + memory +
                ", GPU=" + GPU +
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
                ", keyboard=" + keyboard +
                ", ports=" + ports +
                ", cooling=" + cooling +
                ", speakers=" + speakers +
                ", materials=" + materials +
                '}';
    }
}
