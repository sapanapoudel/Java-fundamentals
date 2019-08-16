package inheritance;

public class Review {
    //Instance variables
    private String author;
    private String textBody;
    private int star;
    private String movie;
    private Restaurant restaurant;
    private Shop shop;
//    private Theater theater;

    //Constructor
    public Review(String author, String textBody, int star) {
        this.author = author;
        this.textBody = textBody;
        if(star > 5) {
            this.star = 5;
        } else {
            this.star = star;
        }
    }

    //Overloading Constructor
    public Review(String movie){
        this.movie = movie;
    }


    //Getter and Setter
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTextBody() {
        return textBody;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }


    public void setTextBody(String textBody) {
        this.textBody = textBody;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(Theater theater) {
    }

    //Instance Methods
    public String toString() {
        return "author='" + author + '\'' +
                ", textBody='" + textBody + '\'' +
                ", numStar=" + star +
                ", restaurant=" + restaurant;
    }


    public void setMovie() {
        this.movie = movie;
    }
}
