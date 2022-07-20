package javaStudy.CodeCademy;

public class Order {

<<<<<<< Updated upstream
<<<<<<< Updated upstream
    // attributes
    String item;
=======

    // attributes
>>>>>>> Stashed changes
=======

    // attributes
>>>>>>> Stashed changes
    boolean isFilled;
    double billAmount;
    String shipping;


    // constructor
<<<<<<< Updated upstream
<<<<<<< Updated upstream
    public Order(String item, boolean filled, double cost, String shippingMethod) {
        this.isFilled = filled;
        this.billAmount = cost;
        this.shipping = shippingMethod;
        this.item = item;
    }

    public void ship() {
        System.out.println("\n1 " + item + " ordered:");
=======
=======
>>>>>>> Stashed changes
    public Order(boolean filled, double cost, String shippingMethod) {
        if (cost > 24.00) {
            System.out.println("High value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
    }


    public void ship() {
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
        if (isFilled) {
            System.out.println("Shipping");
            System.out.println("Shipping cost: " + calculateShipping());
        } else {
            System.out.println("Order not ready");
        }
    }

<<<<<<< Updated upstream
<<<<<<< Updated upstream
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
=======
=======
>>>>>>> Stashed changes

    public double calculateShipping() {
        // declare conditional statement here
        if (shipping == "Regular") {
            return 0;
        } else if (shipping == "Express") {
            return 1.75;
        } else {
            return 0.50;
        }

    }


    public static void main(String[] args) {
        // do not alter the main method!
        Order book = new Order(true, 9.99, "Express");
        Order chemistrySet = new Order(false, 72.50, "Regular");
        book.ship();
        chemistrySet.ship();
    }
}
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
