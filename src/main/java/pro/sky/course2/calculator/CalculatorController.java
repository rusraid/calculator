package pro.sky.course2.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String calculatorHello() {
        return calculatorService.calculatorHello();
    }

    @GetMapping("/plus")
    public String calculatorPlus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.calculatorPlus(num1, num2);
    }

    @GetMapping("/minus")
    public String calculatorMinus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.calculatorMinus(num1, num2);
    }

    @GetMapping("/multiply")
    public String calculatorMultiply(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.calculatorMultiply(num1, num2);
    }

    @GetMapping("/divide")
    public String calculatorDivide(@RequestParam int num1, @RequestParam int num2) {
                if (num2 == 0){
                    return "Ошибка! На 0 делить нельзя!";
        }
        return num1 + " / " + num2 + " = " + calculatorService.calculatorDivide(num1, num2);
    }
}