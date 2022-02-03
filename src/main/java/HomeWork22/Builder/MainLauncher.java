package HomeWork22.Builder;

public class MainLauncher {
    public static void main(String[] args) {

        BuilderHomeWork builderHomeWork = BuilderHomeWork
                .getBuilder()
                .setCoffeeOrder(1)
                .setCoffeeManufacturer("Lavazza")
                .setCupSize(450)
                .setCoffeeType("Americano")
                .build();
        builderHomeWork
                .getCoffeeOrder()
                .printOrder();
        System.out.println(builderHomeWork.getCoffeeType() + " " + builderHomeWork.getCupSize() +
                " ml., that produced by " + builderHomeWork.getCoffeeManufacturer());
    }
}
