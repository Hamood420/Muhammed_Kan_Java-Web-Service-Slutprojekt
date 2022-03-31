package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;

public class calcController {
	
	@RequestMapping("/add")
	public Double addition(Double number1, Double number2) {
		Double sum = number1 + number2;
		return sum;
    }

    @RequestMapping("/sub")
    public Double subtraction(Double number1, Double number2) {
        Double sum = number1 - number2;
        return sum;
    }

    @RequestMapping("/multi")
    public Double multiplication(Double number1, Double number2) {
        Double sum = number1 * number2;
        return sum;
    }

    @RequestMapping("/div")
    public Double division(Double number1, Double number2) {
        Double sum = number1 / number2;
        return sum;
    }
    
}

