package inheritance;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Review myreview = new Review("Tim", "I love food", 4);
////        System.out.println(myreview.toString());
//
//        Restaurant myRestaurant = new Restaurant("IHOP", 2, 1 );
//        Review review = new Review("Smith", "Breakfast is good", 3);

//        myRestaurant.addReview(review);
        Restaurant myRestaurant = new Restaurant("IHOP", 2, 1 );
        Review review = new Review("Smith", "Breakfast is good", 3);
        myRestaurant.addReview(review);
        List<Review> testReview = myRestaurant.getReviews();
        System.out.println();
        myRestaurant.toString();
    }
}
