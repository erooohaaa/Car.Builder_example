public class Main {
    public static void main(String[] args) {
        CarBuilder carBuilder1 = new CarBuilder.Builder("Honda")
                .release(2022)
                .country("South Korea")
                .build();
        CarBuilder carBuilder2 = new CarBuilder.Builder("BMW")
                .release(2010)
                .country("Germany")
                .build();
        CarBuilder carBuilder3 = new CarBuilder.Builder("BMW")
                .release(2010)
                .build();

        System.out.println(carBuilder1);
        System.out.println(carBuilder2);
        System.out.println(carBuilder3);
    }
}