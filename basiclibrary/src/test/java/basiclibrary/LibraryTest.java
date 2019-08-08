/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LibraryTest {
    //Test for rolling dice
    @Test public void rollTest(){

        assertEquals(5, Library.roll(5).length);
    }
    @Test public void rollTest_expectedFailure() {
        assertNotEquals (3, Library.roll(2).length);
        assertNotEquals (2.0, Library.roll(2).length);

    }
    @Test public void rollTest_edgeCase() {
        assertEquals(0, Library.roll(0).length);
    }

     //Test cases for containsDuplicate
    @Test public void containsDuplicatesTest() {
        assertTrue("an array with duplicates shoiuld return true",
                Library.containsDuplicates(new String[]{"apple", "orange", "banana", "apple"}));
    }

    //Test for calculating average
    @Test public void calculateAverageTest() {
        assertEquals(6.0, Library.calculateAverage(new int[]{10, 2, 3, 4, 5, 6, 7, 8, 9}), 0.000001);
    }

    //Test for Array of Arrays
    @Test public void calculateAvgOfArrayOfArraysTest() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        assertArrayEquals("should return array with min average",
                new int[]{55, 54, 60, 53, 59, 57, 61}, Library.calculateAvgOfArrayOfArrays(weeklyMonthTemperatures));
    }

    //Test for weather data
    @Test public void weatherDataTest() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        assertTrue(Library.weatherData(weeklyMonthTemperatures).equals("Never saw temperature: 63"));
    }

    //Test of tally
    @Test public void tallyTest() {
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        //String winner = Library.tally(votes);

        assertEquals("should be same", "Bush",
                Library.tally(votes));
    }

}
