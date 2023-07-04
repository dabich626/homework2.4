package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {
    private final CalculateService calculateService;

    public CalculateController(CalculateService calculateService) {

        this.calculateService = calculateService;
    }

    @GetMapping(path = "/calculator")
    public String welcome() {
        return calculateService.welcome;
    }

    @GetMapping(path = "/calculator/plus?num1=5&num2=5 ")
    public String plusOne() {

        return calculateService.plusOne;
    }

    @GetMapping(path = " /calculator/minus?num1=5&num2=5")
    public String minus() {

        return calculateService.minus;
    }

    @GetMapping(path = "/calculator/multiply?num1=5&num2=5")
    public String multiply() {

        return calculateService.multiply;
    }

    @GetMapping(path = "/calculator/divide?num1=5&num2=5")
    public String divide() {

        return calculateService.divide;

    }


}
