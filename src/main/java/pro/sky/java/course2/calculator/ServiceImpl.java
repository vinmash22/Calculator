package pro.sky.java.course2.calculator;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
    // int num1;
    //int num2;
    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    @Override
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        return num1 / num2;
    }
}
