package inheritance;

public class Review extends Restaurant {
    //Instance variables
    String body;
    String author;

    //Constructor
    public Review (String name, int stars, String price, String body, String author) {
        super(name, stars, price);
        this.body = body;
        this.author = author;
    }

    //Instance variables
    public String toString() {
        return super.toString() + this.body
                + " author: " + this.author
                + " stars: " + this.stars;

    }




}
