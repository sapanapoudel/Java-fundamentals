/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        String PATH = "/Users/pousapan/codefellows-401/java-fundamentals!/linter/src/main/resources/gates.js";
        String expected = "Line 3: Missing semicolon.";
        assertEquals("", expected, classUnderTest.readFile(PATH));

    }

    //Test for file with no error
//    @Test public void readFileTest_noError() {
//        App classUnderTest = new App();
//        String PATH = "/Users/pousapan/codefellows-401/java-fundamentals!/linter/src/main/resources/contains_error.js";
//        assertEquals("", "no error", classUnderTest.readFile(PATH));
//    }
}
