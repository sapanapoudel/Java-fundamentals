package inheritance;

public class Restaurant {
    //Instance Variables
    String name;
    int stars;
    String price;

    public Restaurant(String name, int stars, String price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
    }

    //Instance methods
    public String toString() {
        System.out.println();
        return this.name + " has " + this.stars + " stars . " + this.price;
    }

    //Add review





}
