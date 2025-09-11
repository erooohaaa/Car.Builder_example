public class CarDirector implements Builder {
    private String name;
    private int release;
    private String country;

    @Override
    public void setName(String name) {
        this.name = name;
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
    public Car build() {
        return new Car(name, release, country);
    }
}