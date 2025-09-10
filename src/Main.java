public class Main {
    public static void main(String[] args) {
        Car car1 = new Car.Builder("Honda")
                .release(2022)
                .country("South Korea")
                .build();
        Car car2 = new Car.Builder("BMW")
                .release(2010)
                .country("Germany")
                .build();
        Car car3 = new Car.Builder("BMW")
                .release(2010)
                .build();

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}