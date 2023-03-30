package pro.sky.java.course2.calculator;

import org.springframework.web.bind.annotation.RequestParam;

public interface Service {
    String hello();

    int plus(int num1, int num2);

    int minus(int num1, int num2);

    int multiply(int num1, int num2);

    int divide(int num1, int num2);

    String authorization (String login, String password, String confirmPassword);
}
