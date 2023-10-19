package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {
    private int num1 = 5;
    private int num2 = 5;

    @Override
    public int getOperationCalc() {
        return num1 + num2;
    }

    @Override
    public int getMinusCalc() {
        return num1 - num2;
    }

    @Override
    public int getMultiplyCalc() {
        return num1 * num2;
    }

    @Override
    public int getDivideCalc() {
        return num1 / num2;
    }
}
