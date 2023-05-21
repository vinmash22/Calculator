package pro.sky.java.course2.calculator;

import org.assertj.core.internal.bytebuddy.asm.Advice;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServiceImplParametersTest {
    ServiceImpl service = new ServiceImpl();

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(2, 1),
                Arguments.of(-6, 3),
                Arguments.of(10, -5),
                Arguments.of(-12, -2));
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void testPlus(int num1, int num2) {
        var actual = service.plus(num1, num2);
        var expected = num1 + num2;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void testMinus(int num1, int num2) {
        var actual = service.minus(num1, num2);
        var expected = num1 - num2;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void testMultiply(int num1, int num2) {
        var actual = service.multiply(num1, num2);
        var expected = num1 * num2;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void testDivide(int num1, int num2) {
        var actual = service.divide(num1, num2);
        var expected = num1 / num2;
        assertEquals(expected, actual);
    }
}