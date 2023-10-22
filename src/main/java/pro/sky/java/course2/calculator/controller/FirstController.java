package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.service.CalcService;

@RestController
@RequestMapping("/calculator")
public class FirstController {
    private final CalcService calculatorServiceImpl;

    public FirstController(CalcService calculatorServiceImpl) {
        this.calculatorServiceImpl = calculatorServiceImpl;
    }

    @GetMapping //метод 1 выполнен
    public String greetingsUser() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(
            @RequestParam(name = "num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "Оба аргумента обязательны! Попробуй ещё раз.";
        }
        return num1 + " + " + num2 + " = " + calculatorServiceImpl.plus(num1, num2);
        //Указываем в браузере http://localhost:8080/calculator/plus?num1=25&num2=5
    }

    @GetMapping("/minus")
    public String minus(
            @RequestParam(name = "num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "Оба аргумента обязательны! Попробуй ещё раз.";
        }
        return num1 + " - " + num2 + " = " + calculatorServiceImpl.minus(num1, num2);
        //Указываем в браузере http://localhost:8080/calculator/minus?num1=25&num2=5
    }

    @GetMapping("/multiply")
    public String multiply(
            @RequestParam(name = "num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "Оба аргумента обязательны! Попробуй ещё раз.";
        }
        return num1 + " * " + num2 + " = " + calculatorServiceImpl.multiply(num1, num2);
        //Указываем в браузере http://localhost:8080/calculator/multiply?num1=5&num2=5
    }

    @GetMapping("/divide")
    public String divide(
            @RequestParam(name = "num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "Оба аргумента обязательны! Попробуй ещё раз.";
        }
        if (num2.equals(0)) {
            return "Деление на ноль запрещено!";
        }
        return num1 + " / " + num2 + " = " + calculatorServiceImpl.divide(num1, num2);
        //Указываем в браузере http://localhost:8080/calculator/divide?num1=25&num2=5
    }
}
