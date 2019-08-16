package inheritance;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ShopTest {
    Shop myShop;
    @Before
    public void setUp() {
        myShop = new Shop("Dollar Store", "find everything for dollar", "$",3);
    }

    @Test public void toStringTest() {
        assertEquals("should be equal", "Shop{shopName='Dollar Store', description='find everything for dollar'," +
                        " numOfDollarSign='$', stars=3, reviews=[]}",
                myShop.toString());
    }

    @Test public void addReviewTest_singleReviewForShop() {
        Review  review = new Review("Sapana", "I lived dollar store", 5);
        myShop.addReview(review);
        List<Review> firstReview = myShop.getReviews();
        assertTrue(firstReview.size() == 1);
    }

    @Test public void addReviewTest_multipleReviewsForShop() {
        Review review1  = new Review("Mike", "you can find anything", 4);
        Review review2 = new Review("Sam", "don't have quality", 2);
        myShop.addReview(review1);
        myShop.addReview(review2);
        List<Review> multipleReviews = myShop.getReviews();
        assertTrue(multipleReviews.size() == 2);
    }

}