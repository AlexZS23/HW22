package HomeWork22.Builder;

public class CoffeeOrder {

    private int orderNumber;

    public CoffeeOrder(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void printOrder() {
        System.out.println("Your order # " + orderNumber + " consist of:");
    }
}
