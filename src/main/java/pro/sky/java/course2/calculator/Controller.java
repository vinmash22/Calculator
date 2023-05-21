package pro.sky.java.course2.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller {
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping()
    public String hello() {
        return service.hello();
    }

    @GetMapping("plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + service.plus(num1, num2);
    }

    @GetMapping("minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " - " + num2 + " = " + service.minus(num1, num2);
    }

    @GetMapping("multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " * " + num2 + " = " + service.multiply(num1, num2);
    }

    @GetMapping("divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        if (num2 == 0) {
            return "На ноль делить нельзя!";
        } else return num1 + " / " + num2 + " = " + service.divide(num1, num2);
    }

    @GetMapping("authorization")
    public String authorization(@RequestParam String login, @RequestParam String password, @RequestParam String confirmPassword) {
        try {
            return service.authorization(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            return "false";
        } finally {
            System.out.println("Проверка завершена");
        }

    }
}
