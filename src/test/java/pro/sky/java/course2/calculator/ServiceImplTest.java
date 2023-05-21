package pro.sky.java.course2.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceImplTest {
    ServiceImpl service = new ServiceImpl();

    @Test
    void testHello() {
        var result1 = service.hello();
        assertEquals("Добро пожаловать в калькулятор!", result1);
    }

    @Test
    void testPlus() {
        var result1 = service.plus(1, 2);
        assertEquals(3, result1);

        var result2 = service.plus(-7, 3);
        assertEquals(-4, result2);

        var result3 = service.plus(-11, -8);
        assertEquals(-19, result3);

        var result4 = service.plus(9, -2);
        assertEquals(7, result4);

        var result5 = service.plus(0, 0);
        assertEquals(0, result5);
    }

    @Test
    void testMinus() {

        var result1 = service.minus(1, 2);
        assertEquals(-1, result1);

        var result2 = service.minus(-7, 3);
        assertEquals(-10, result2);

        var result3 = service.minus(-11, -8);
        assertEquals(-3, result3);

        var result4 = service.minus(9, -2);
        assertEquals(11, result4);

        var result5 = service.minus(0, 0);
        assertEquals(0, result5);
    }

    @Test
    void testMultiply() {
        var result1 = service.multiply(1, 2);
        assertEquals(2, result1);

        var result2 = service.multiply(-7, 3);
        assertEquals(-21, result2);

        var result3 = service.multiply(-11, -8);
        assertEquals(88, result3);

        var result4 = service.multiply(9, -2);
        assertEquals(-18, result4);

        var result5 = service.multiply(0, 0);
        assertEquals(0, result5);
    }

    @Test
    void testDivide() {
        var result1 = service.divide(1, 2);
        assertEquals(0, result1);

        var result2 = service.divide(-6, 3);
        assertEquals(-2, result2);

        var result3 = service.divide(-16, -8);
        assertEquals(2, result3);

        var result4 = service.divide(9, -3);
        assertEquals(-3, result4);


        assertThrows(IllegalArgumentException.class, () -> service.divide(0, 0));
    }

}