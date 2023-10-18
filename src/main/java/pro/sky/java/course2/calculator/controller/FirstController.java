package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.service.CalcService;

import java.util.stream.Stream;

@RestController
@RequestMapping("/calculator")
public class FirstController {
    private final CalcService calcService;
    public FirstController(CalcService calcService) {
        this.calcService = calcService;
    }
    //private int num1;
    //private int num2;
    @GetMapping //метод 1 выполнен
    public String greetingsUser() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus?num1=5&num2=5")
    public String plusCalc(int num1, int num2) { //метод 2 "сложение"
        //return num1 + num2; //не работает
        return "5 + 5 = " + calcService.getSumCalc(); //выдает ошибку 404
        // This application has no explicit mapping for /error, so you are seeing this as a fallback.
        //
        //Thu Oct 19 00:17:35 MSK 2023
        //There was an unexpected error (type=Not Found, status=404).
    }

    @GetMapping("/greetings") //проверка метода, что он работает http://localhost:8080/calculator/greetings?name=John&lastName=Connor
    public String showGreetings(@RequestParam(required = true) String name, @RequestParam(required = true) String lastName) {
        return "Hello,  " + lastName + " " + name + "!";
    }
}
