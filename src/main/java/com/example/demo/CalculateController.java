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

    @GetMapping(path = "/calculator/plus")
    public String plusOne(@RequestParam("num1, num2") int num1, int num2) {

        return calculateService.plusOne(num1,num2);
    }

    @GetMapping(path = " /calculator/minus")
    public String minus(@RequestParam("num1, num2") int num1, int num2) {

        return calculateService.minus(num1,num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam("num1, num2") int num1, int num2) {

        return calculateService.multiply(num1,num2);
    }

    @GetMapping(path = "/calculator/divide")

    public String divide(@RequestParam("num1, num2") int num1, int num2) {

        return calculateService.divide(num1,num2);

    }


}
