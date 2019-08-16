package inheritance;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class RestaurantTest {

    Restaurant testyFood;
    @Before
    public void setUp() {
        testyFood = new Restaurant("Macdonald", 2);
    }

    @Test public void reviewTest() {
        assertEquals("should be equal",
                "Restaurant{name='Macdonald', stars=0, price=2, reviews=[]}",
                testyFood.toString());
    }

    @Test public void addReviewTest_singleReview() {
        Review review = new Review("Smith", "Breakfast is good", 3);
        testyFood.addReview(review);
        List<Review> testReview = testyFood.getReviews();
        assertTrue(testReview.size() == 1);
    }

    @Test public void addReviews_multipleReviews() {
        Review review = new Review("Tim", "I love dollar menu", 4);
        Review anotherReview = new Review("Jack", "It is bad", 1);
        testyFood.addReview(review);
        testyFood.addReview(anotherReview);
        List<Review> testReview = testyFood.getReviews();
        assertTrue(testReview.size() == 2);
    }

}