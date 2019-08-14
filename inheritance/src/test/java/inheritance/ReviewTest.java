package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    Review myreview;

    @Before public void setUp() {
        myreview = new Review("Smith", "I love this place", 4);
    }

    @Test public void toStringTest() {
        assertEquals("should be equal",
                "Review{author='Smith', textBody='I love this place', numStar=4, restaurant=null}",
                myreview.toString());
    }


}