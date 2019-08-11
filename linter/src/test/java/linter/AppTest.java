/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() throws FileNotFoundException {
        App classUnderTest = new App();
        String PATH = "/Users/pousapan/codefellows-401/java-fundamentals!/linter/src/main/resources/gates.js";
        String expected = "Line 3: Missing semicolon.";
        assertEquals("", expected, classUnderTest.readFile(PATH));

    }

    //Test for file with no error
    @Test public void readFileTest_noError() throws FileNotFoundException {
        App classUnderTest = new App();
        String PATH = "/Users/pousapan/codefellows-401/java-fundamentals!/linter/src/main/resources/contains_error.js";
        assertEquals("There should be no error", "Line 7: has no error",
                classUnderTest.readFile(PATH));
    }

    @Test public void readFileTest_fewError() throws FileNotFoundException {
        App classUnderTest = new App();
        String PATH = "/Users/pousapan/codefellows-401/java-fundamentals!/linter/src/main/resources/few_error.js";
        assertEquals("There should be missing semicolon", "Line 3: Missing semicolon.",
                classUnderTest.readFile(PATH));
    }

    @Test public void readFileTest_emptyFile() throws FileNotFoundException {
        App classUnderTest = new App();
        String PATH = "/Users/pousapan/codefellows-401/java-fundamentals!/linter/src/main/resources/empty_file.js";
        assertEquals("File is empty", "file is empty",
                classUnderTest.readFile(PATH));
    }
}
