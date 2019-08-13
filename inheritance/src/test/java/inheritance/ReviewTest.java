package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    Review myreview;

    @Before public void setUp() {
        myreview = new Review("Testy-Food", 5, "$$", " This is good.", "Tim");

    }



    @Test public void toStringTest() {
        assertEquals("should be equal", "Testy-Food has 5 stars . $$ This is good. author: Tim stars: 5",
                myreview.toString());
    }


}