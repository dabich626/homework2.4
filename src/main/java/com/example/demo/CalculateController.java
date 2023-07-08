package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {
    private final CalculateService calculateService = new calculateService;


    @GetMapping(path = "/calculator")
    public String welcome() {
        return calculateService.welcome;
    }

    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam(@RequestParam("num1")int num1, @RequestParam("num2")int num2) int num1, int num2) {


        return num1 + "+" + num2 + "=" + service.plus(num1, num2);
    }

    @GetMapping(path = " /calculator/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2)

    int num1, int num2)

    {

        return num1 + "-" + num2 + "=" + service.minus(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2)

    int num1, int num2)

    {

        return num1 + "*" + num2 + "=" + service.multiply(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")

    public String divide (@RequestParam(@RequestParam("num1")int num1, @RequestParam("num2")int num2) int num1, int num2) {
        if (num2 == 0) {
            return "На 0 делить нельзя";
        }
        return num1 + "/" + num2 + "=" + service.divide(num1, num2);

    }


}
