class CarBuilder {
    private final String name;
    private final int release;
    private final String country;

    private CarBuilder(Builder builder) {
        this.name = builder.name;
        this.release = builder.release;
        this.country = builder.country;

    }
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", release=" + release +
                ", country='" + country + '\'' +
                '}';
    }
    public static class Builder{
        private String name;
        private int release;
        private String country;
        public Builder (String name) {
            this.name = name;

        }
        public Builder release(int release) {
            this.release = release;
            return this;
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }
        public CarBuilder build() {
            return new CarBuilder(this);
        }

    }



}
