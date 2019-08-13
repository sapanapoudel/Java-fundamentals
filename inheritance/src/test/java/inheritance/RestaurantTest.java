package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    Restaurant testyFood;
    @Before
    public void setUp() {
        testyFood = new Restaurant("testyFood", 4, "$$");
    }


    @Test public void reviewTest() {
        assertEquals("should be equal",
                "testyFood has 4 stars . $$",
                testyFood.toString());
    }





}