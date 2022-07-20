package javaStudy.RandomPractice.oopPractice;

public class fruitStand {
    // instance fields
    String productType;
    double price;

    // constructor method
    public fruitStand(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
        System.out.println(product.toUpperCase());
        System.out.println("Initial Price: " + price);
    }

    // increase price method
    public void increasePrice(double priceToAdd) {
        price += priceToAdd;
        System.out.println("New price: " + price);
    }

    // get price with tax method
    public double getPriceWithTax() {
        double totalPrice = price + price * 0.08;
        System.out.println("Price after tax: " + totalPrice);
        return totalPrice;
    }

    // main method
    public static void main(String[] args) {
        fruitStand lemonade  = new fruitStand("Lemonade", 2.25);
        lemonade.increasePrice(0.75);
        lemonade.getPriceWithTax();

        fruitStand appleJuice = new fruitStand("Apple Juice", 2.50);
        appleJuice.increasePrice(0.75);
        appleJuice.getPriceWithTax();
    }
}