package HomeWork22.Builder;

public class BuilderHomeWork {
    private String coffeeType;
    private int cupSize;
    private String coffeeManufacturer;
    private CoffeeOrder coffeeOrder;

    private BuilderHomeWork() {
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public int getCupSize() {
        return cupSize;
    }

    public String getCoffeeManufacturer() {
        return coffeeManufacturer;
    }

    public CoffeeOrder getCoffeeOrder() {
        return coffeeOrder;
    }

    public static Builder getBuilder() {
        return new BuilderHomeWork().new Builder();
    }

    public class Builder {
        private Builder() {
        }

        public Builder setCoffeeType(String someCoffeeType) {
            coffeeType = someCoffeeType;
            return this;
        }

        public Builder setCupSize(int someCupSize) {
            cupSize = someCupSize;
            return this;
        }

        public Builder setCoffeeManufacturer(String someCoffeeManufacturer) {
            coffeeManufacturer = someCoffeeManufacturer;
            return this;
        }

        public Builder setCoffeeOrder(int orderNumber) {
            coffeeOrder = new CoffeeOrder(orderNumber);
            return this;
        }

        public BuilderHomeWork build() {
            return BuilderHomeWork.this;
        }
    }
}
