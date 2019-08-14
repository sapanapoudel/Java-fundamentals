package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    //Instance Variables
    private  String name;
    private int stars;
    private int price;
    private List<Review> reviews = new ArrayList<>();

    public Restaurant(String name, int stars, int price) {
        this.name = name;

        if(stars > 5) {
            this.stars = 5;
        } else {
            this.stars = stars;
        }
        this.price = price;
    }

    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    //Instance methods
    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", price=" + price +
                ", reviews=" + reviews +
                '}';
    }

    //add review method
    public void addReview(Review review) {
        this.reviews.add(review);
        review.setRestaurant(this);
        updateStarsOfRestaurant();
    }

    //Method for update star of Restaurant with the star of review
    public void updateStarsOfRestaurant() {
        int currentStar = this.stars;
        for(int i = 0; i < getReviews().size(); i++) {
            currentStar += getReviews().get(i).getStar();
        }

        currentStar /= (getReviews().size() + 1);
        this.stars = currentStar;
    }




}
