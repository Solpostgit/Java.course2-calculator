package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class FirstController {
    @GetMapping //метод 1 выполнен
    public String greetingsUser() {
        return "Добро пожаловать в калькулятор";
    }
}
