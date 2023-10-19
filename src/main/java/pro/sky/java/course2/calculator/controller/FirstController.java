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

    @GetMapping("/plus")
    public String plusCalc(@RequestParam("num1") int num1, @RequestParam("num2") int num2) { //метод 2 "сложение"
        return "5 + 5 = " + calcService.getOperationCalc();
        //Указываем в браузере http://localhost:8080/calculator/plus?num1=5&num2=5
    }

    @GetMapping("/minus")
    public String minusCalc(@RequestParam("num1") int num1, @RequestParam("num2") int num2) { //метод 2 "вычитание"
        return "5 - 5 = " + calcService.getMinusCalc();
        //Указываем в браузере http://localhost:8080/calculator/minus?num1=5&num2=5
    }

    @GetMapping("/multiply")
    public String multiplyCalc(@RequestParam("num1") int num1, @RequestParam("num2") int num2) { //метод 3 "умножение"

        return "5 * 5 = " + calcService.getMultiplyCalc();
        //Указываем в браузере http://localhost:8080/calculator/multiply?num1=5&num2=5
    }

    @GetMapping("/divide")
    public String divideCalc(@RequestParam("num1") int num1, @RequestParam("num2") int num2) { //метод 4 "деление"

        return "5 * 5 = " + calcService.getDivideCalc();
        //Указываем в браузере http://localhost:8080/calculator/divide?num1=5&num2=5
    }

    @GetMapping("/greetings")
    //проверка метода, что он работает http://localhost:8080/calculator/greetings?name=John&lastName=Connor
    public String showGreetings(@RequestParam(required = true) String name, @RequestParam(required = true) String lastName) {
        return "Hello,  " + lastName + " " + name + "!";
    }
}
