package pro.sky.java.course2.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceImplTest {
    ServiceImpl service = new ServiceImpl();

    @Test
    void testHello() {
    }

    @Test
    void testPlus() {
        var result1 = service.plus(1, 2);
        assertEquals(3, result1);

        var result2 = service.plus(-7, 3);
        assertEquals(-4, result2);

        var result3 = service.plus(-11, -8);
        assertEquals(-19, result3);
     }

    @Test
    void testMinus() {
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }

    @Test
    void authorization() {
    }
}