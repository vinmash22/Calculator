package pro.sky.java.course2.calculator;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
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

    @Override
    public String authorization(String login, String password, String confirmPassword) {
        String regex = "^[a-zA-Z0-9-._]+$";
        if (!login.matches(regex) || login.length() >= 20) {
            throw new WrongLoginException("Некорректный логин");
        }
        if (!password.matches(regex) || password.length() >= 20 || !password.equals(confirmPassword)) {
            throw new WrongLoginException("указанные пароли не равны");
        }
        return "true";
    }
}
