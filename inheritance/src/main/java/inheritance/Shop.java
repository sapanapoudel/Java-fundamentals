package inheritance;
import java.util.ArrayList;
import java.util.List;

public class Shop implements Reviewable {
    //Fields
    private String shopName;
    private String description;
    private String numOfDollarSign;
    private int stars;
    private List<Review> reviews = new ArrayList<>();

    //Constructor
    public Shop (String shopName, String description, String numOfDollarSign, int stars){
        this.shopName= shopName;
        this.description = description;
        this.numOfDollarSign = numOfDollarSign;
        this.stars = stars;
    }

    //Getter and Setter

    public String getShopName() {
        return shopName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNumOfDollarSign() {
        return numOfDollarSign;
    }

    public void setNumOfDollarSign(String numOfDollarSign) {
        this.numOfDollarSign = numOfDollarSign;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }


    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviewList) {
        this.reviews = reviewList;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    //addReview Method
    public void addReview(Review review) {
        this.reviews.add(review);
        review.setShop(this);
    }

    //Update Star
    public void updateStars() {
        int currentStar = this.stars;
        for(int i = 0; i < getReviews().size(); i++) {
            currentStar += getReviews().get(i).getStar();
        }
        currentStar /= (getReviews().size());
        this.stars = currentStar;
    }

    //toString Method
    @Override
    public String toString() {
        return "Shop{" +
                "shopName='" + shopName + '\'' +
                ", description='" + description + '\'' +
                ", numOfDollarSign='" + numOfDollarSign + '\'' +
                ", stars=" + stars +
                ", reviews=" + reviews +
                '}';
    }
}
