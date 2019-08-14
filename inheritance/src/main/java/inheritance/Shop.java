package inheritance;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    //Fields
    private String shopName;
    private String description;
    private String numOfDollarSign;
    private List<Review> reviewList = new ArrayList<>();

    //Constructor
    public Shop (String shopName, String description, String numOfDollarSign){
        this.shopName= shopName;
        this.description = description;
        this.numOfDollarSign = numOfDollarSign;
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


    public List<Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(List<Review> reviewList) {
        this.reviewList = reviewList;
    }


    //addReview Method
    public void addReviewForShop(Review review) {
        this.reviewList.add(review);
        review.setShop(this);
    }

    //toString Method
    @Override
    public String toString() {
        return "In " + this.shopName + ", " + this.description + ": " + this.numOfDollarSign;
    }
}
