package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {
    private int num1;
    private int num2;
    @Override
    public int getSumCalc() {
        //int sum = num1 + num2;
        return num1 + num2;
    }
}
