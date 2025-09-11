public class Main {
    public static void main(String[] args) {
        Builder builder = new CarDirector();
        builder.setName("Toyota");
        builder.setRelease(2020);
        builder.setCountry("Japan");

        Car car = builder.build();
        System.out.println(car);
    }
}