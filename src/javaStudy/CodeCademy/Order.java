package javaStudy.CodeCademy;

public class Order {

    // attributes
    String item;
    boolean isFilled;
    double billAmount;
    String shipping;


    // constructor
    public Order(String item, boolean filled, double cost, String shippingMethod) {
        this.isFilled = filled;
        this.billAmount = cost;
        this.shipping = shippingMethod;
        this.item = item;
    }

    public void ship() {
        System.out.println("\n1 " + item + " ordered:");
        if (isFilled) {
            System.out.println("Shipping");
            System.out.println("Shipping cost: " + calculateShipping());
        } else {
            System.out.println("Order not ready");
        }
    }

    public double calculateShipping() {
        double shippingCost;
        // declare switch statement here
        switch (this.shipping) {
            case "Regular":
                shippingCost = 0;
                break;
            case "Express":
                shippingCost = 1.75;
                break;
            default:
                shippingCost = .50;
        }
        return shippingCost;
    }

    public static void main(String[] args) {

        Order book = new Order("Book",true, 9.99, "Express");
        Order chemistrySet = new Order("Chemistry Set",false, 72.50, "Regular");
        Order laptop = new Order("Laptop", true, 699, "Express");

        book.ship();
        chemistrySet.ship();
        laptop.ship();
    }
}