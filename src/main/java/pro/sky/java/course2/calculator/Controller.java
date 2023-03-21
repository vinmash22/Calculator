package pro.sky.java.course2.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
    private final Service service;
    public Controller (Service service){
        this.service = service;
    }
    @GetMapping(path = "/calculator")
    public String hello() {
        return service.hello();
    }
}
