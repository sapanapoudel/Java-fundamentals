package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {
    Theater myTheater;
    @Before
    public void setUp() {
        myTheater = new Theater("Regal", 3);
        System.out.println(myTheater.toString());
    }

    @Test
    public  void toStringTest () {
        assertEquals("Should be equal", "name='Regal', stars=3, movies=[], reviews=[]", myTheater.toString());
    }
    @Test public void addMovieInTheater() {
        myTheater.addMovie("The Angry Birds Movie 2");
        Review myReview = new Review("Sapana", "It was a great movie", 3);
        myTheater.addReview(myReview);
        System.out.println(myTheater.toString());
    }

}