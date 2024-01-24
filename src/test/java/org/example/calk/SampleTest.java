package org.example.calk;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class SampleTest {

    private int number;

    @BeforeAll
    static void setUpAll() {
        System.out.println("Before all tests");
    }

    @BeforeEach
    void setUp() {
        number = 5;
        System.out.println("Before each test");
    }

    @Test
    @DisplayName("Test addition")
    void testAddition() {
        int result = number + 3;
        assertEquals(8, result); // Проверка сложения
    }

    @Test
    @DisplayName("Test subtraction")
    void testSubtraction() {
        int result = number - 2;
        assertEquals(3, result); // Проверка вычитания
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each test");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("After all tests");
    }

    @Test
    @Disabled("This test is disabled for demonstration purposes")
    @DisplayName("Disabled test")
    void disabledTest() {
        fail("This test should not be executed");
    }
}