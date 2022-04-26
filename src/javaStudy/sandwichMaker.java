package javaStudy;

public class sandwichMaker {

    // instances
    String title;
    String breadType;
    boolean cheese;
    boolean tomato;
    boolean lettuce;
    boolean coleslaw;

    // constructor
    public sandwichMaker(String sandwichTitle, String whiteOrBrown, boolean wantCheese, boolean wantTomato, boolean wantLettuce, boolean wantColeslaw) {
        title = sandwichTitle;
        breadType = whiteOrBrown;
        cheese = wantCheese;
        tomato = wantTomato;
        lettuce = wantLettuce;
        coleslaw = wantColeslaw;
    }

    // method
    public void confirmSandwich() {
        System.out.println(title.toUpperCase());
        System.out.println("Bread: " + breadType);
        System.out.println("Cheese: " + cheese);
        System.out.println("Tomato: " + tomato);
        System.out.println("Lettuce: " + lettuce);
        System.out.println("Coleslaw: " + coleslaw);
    }

    // main
    public static void main(String[] args) {
        sandwichMaker cheeseAndTomato = new sandwichMaker("Cheese & Tomato", "white", true, true,false, false);
        cheeseAndTomato.confirmSandwich();

        sandwichMaker cheeseAndColeslaw = new sandwichMaker("Cheese & Coleslaw", "white", true, false,false, true);
        cheeseAndColeslaw.confirmSandwich();
    }
}