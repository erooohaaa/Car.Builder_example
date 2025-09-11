
public class Car {
    private final String name;
    private final int release;
    private final String country;

    public Car(String name, int release, String country) {
        this.name = name;
        this.release = release;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", release=" + release +
                ", country='" + country + '\'' +
                '}';
    }
}
