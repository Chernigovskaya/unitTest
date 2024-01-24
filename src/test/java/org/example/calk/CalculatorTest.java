package org.example.calk;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
    private Calculator calculator;
    private int operand;

    @BeforeEach
    void testInit() {
        calculator = new Calculator();
        operand = 5;
    }
    @AfterEach
    void testAfterEach() {
        calculator = null;
    }

    @Test
    void testAddition() {
        int result = calculator.add(operand, 3);
        assertEquals(8, result); // Проверка сложения
    }

    @Test
    void testSubtraction() {
        int result = calculator.subtract(operand, 4);
        assertEquals(1, result); // Проверка вычитания
    }

    @Test
    void testMultiplication() {
        int result = calculator.multiply(operand, 4);
        assertEquals(20, result); // Проверка умножения
    }

    @Test
    void testDivision() {
        int result = calculator.divide(10, operand);
        assertEquals(2, result); // Проверка деления
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            int result = calculator.divide(operand, 0); // Попытка деления на ноль, должно выбросить исключение
        });
    }
    @Test
    void testCalculateDiscount() {
        int result = calculator.calculateDiscount(100, operand);
        assertEquals(95, result); // Проверка деления
    }
    @Test
    void testPositiveSumCart() {
        assertThrows(IllegalStateException.class, () -> {
            int result = calculator.calculateDiscount(-100, operand); // Попытка отрицательных покупок
        });
    }

    @Test
    void testPositiveDiscount() {
        assertThrows(IllegalStateException.class, () -> {
            int result = calculator.calculateDiscount(100, -operand); // Попытка отрицательной скидки
        });
    }
    @Test
    void testNotZeroSumCart() {
        assertThrows(IllegalStateException.class, () -> {
            int result = calculator.calculateDiscount(0, -operand); // Попытка нулевой покупки
        });
    }

    @Test
    void testNotZeroDiscount() {
        assertThrows(IllegalStateException.class, () -> {
            int result = calculator.calculateDiscount(100, 0); // Попытка нулевой скидки
        });
    }
    @Test
    void testTwoOperandPositive() {
        assertThrows(IllegalStateException.class, () -> {
            int result = calculator.calculateDiscount(-100, - operand); // Попытка отрицательных значений
        });
    }
}
