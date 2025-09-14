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

    public Phone(String name, String display, String CPU, String memory,
                 String RAM, String Battery, String color, String storage,
                 String camera, int release, String country, String cost) {
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
                '}';
    }
}
