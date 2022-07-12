package javaStudy.CodeCademy;

public class Reservation {

    // attributes
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;


    // constructor
    public Reservation(int count, int capacity, boolean open) {
        guestCount = count;
        restaurantCapacity = capacity;
        isRestaurantOpen = open;
    }


    public void confirmReservation() {
        if (restaurantCapacity >= guestCount && isRestaurantOpen) {
            System.out.println("Reservation confirmed");
            isConfirmed = true;
        } else {
            System.out.println("Reservation denied");
            isConfirmed = false;
        }
    }


    public void informUser() {
        if (isConfirmed) {
            System.out.println("Please enjoy your meal!");
        } else {
            System.out.println("Please come back another day.");
        }
    }


    public static void main(String[] args) {
        Reservation partyOfThree = new Reservation(3, 12, true);
        partyOfThree.confirmReservation();
        partyOfThree.informUser();

        Reservation partyOfFour = new Reservation(4, 3, true);
        partyOfFour.confirmReservation();
        partyOfFour.informUser();
    }
}