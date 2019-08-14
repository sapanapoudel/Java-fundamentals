package inheritance;



public class Review {
    //Instance variables
    private String author;
    private String textBody;
    private int star;
    private Restaurant restaurant;

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

    //Instance Methods
    public String toString() {
        return "Review{" +
                "author='" + author + '\'' +
                ", textBody='" + textBody + '\'' +
                ", numStar=" + star +
                ", restaurant=" + restaurant +
                '}';
    }

}
