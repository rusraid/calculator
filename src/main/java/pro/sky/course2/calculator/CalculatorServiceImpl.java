package pro.sky.course2.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{

    @Override
    public String calculatorHello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String calculatorPlus(int num1, int num2){
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String calculatorMinus(int num1, int num2){
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String calculatorMultiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @Override
    public double calculatorDivide(int num1, int num2) {
        return (double) num1 / num2;
    }

}
