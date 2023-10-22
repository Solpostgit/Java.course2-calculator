package pro.sky.java.course2.calculator.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.calculator.service.CalcService;

@Service
public class CalculatorServiceImpl implements CalcService {
    @Override
    public String plus(int num1, int num2) {
        return String.valueOf(num1 + num2);
    }

    @Override
    public String minus(int num1, int num2) {
        return String.valueOf(num1 - num2);
    }

    @Override
    public String multiply(int num1, int num2) {
        return String.valueOf(num1 * num2);
    }

    @Override
    public String divide(int num1, int num2) {
        return String.valueOf(num1 / num2);
    }
}
