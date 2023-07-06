package com.example.demo;

import org.springframework.stereotype.Service;


@Service
public class CalculateService {


    public class CalculateController {

        public CalculateController() {

            int num1;

            int num2;


        }

        public String welcome() {
            return "Добро пожаловать в калькулятор";
        }


        public String plusOne(int num1, int num2) {
            num1 = 5;
            num2 = 5;
            int result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
            return "5 + 5 = 10";
        }


        public String minus(int num1, int num2) {
            num1 = 5;
            num2 = 5;
            int result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
            return "5 - 5 = 0";

        }


        public String multiply(int num1, int num2) {
            num1 = 5;
            num2 = 5;
            int result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
            return "5 * 5 = 25";

        }


        public String divide(int num1, int num2) {
            num1 = 5;
            num2 = 5;
            int result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result);
            return "5 / 5 = 1";


        }

        public String error() {

            return "простите, наш калькулятор умеет считать только до 5";
        }
    }
}
