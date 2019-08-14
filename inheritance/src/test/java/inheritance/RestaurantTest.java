package inheritance;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class RestaurantTest {

    Restaurant testyFood;
    @Before
    public void setUp() {
        testyFood = new Restaurant("TestyFood", 4, 2);
    }

    @Test public void reviewTest() {
        assertEquals("should be equal",
                "Restaurant{name='TestyFood', stars=4, price=2, reviews=[]}",
                testyFood.toString());
    }

    @Test public void addReviewTest_singleReview() {
        Restaurant myRestaurant = new Restaurant("IHOP", 2, 1 );
        Review review = new Review("Smith", "Breakfast is good", 3);
        myRestaurant.addReview(review);
        List<Review> testReview = myRestaurant.getReviews();
        assertTrue(testReview.size() == 1);
    }

    @Test public void addReviews_multipleReviews() {
        Restaurant myRestaurant = new Restaurant("MacDonald", 3, 1);
        Review review = new Review("Tim", "I love dollar menu", 4);
        Review anotherReview = new Review("Jack", "It is bad", 1);
        myRestaurant.addReview(review);
        myRestaurant.addReview(anotherReview);
        List<Review> testReview = myRestaurant.getReviews();
        assertTrue(testReview.size() == 2);
    }

}