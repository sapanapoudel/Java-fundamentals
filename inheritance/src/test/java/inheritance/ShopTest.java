package inheritance;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ShopTest {
    Shop myShop;
    @Before
    public void setUp() {
        myShop = new Shop("Dollar Store", "find everything for dollar", "$");
    }

    @Test public void toStringTest() {
        assertEquals("should be equal", "In Dollar Store, find everything for dollar: $",
                myShop.toString());
    }

    @Test public void addReviewTest_singleReviewForShop() {
        Review  review = new Review("Sapana", "I lived dollar store", 5);
        myShop.addReviewForShop(review);
        List<Review> firstReview = myShop.getReviewList();
        assertTrue(firstReview.size() == 1);
    }

    @Test public void addReviewTest_multipleReviewsForShop() {
        Review review1  = new Review("Mike", "you can find anything", 4);
        Review review2 = new Review("Sam", "don't have quality", 2);
        myShop.addReviewForShop(review1);
        myShop.addReviewForShop(review2);
        List<Review> multipleReviews = myShop.getReviewList();
        assertTrue(multipleReviews.size() == 2);
    }

}