package com.example.demo;


import Verifications.ConverterNumber;
import Verifications.Maths;
import exceptions.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.*;

//
@RestController
public class MathController {
    private Maths math = new Maths();


    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}",
            method = RequestMethod.GET)
    public Double sum(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {

        if (! ConverterNumber.isNumeric(numberOne) || ! ConverterNumber.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please enter a valid number");
        }
        return  math.sum(Double.parseDouble(numberOne), Double.parseDouble(numberTwo));

    }

    @RequestMapping(value = "/subtration/{numberOne}/{numberTwo}",
            method = RequestMethod.GET)
    public Double subtration(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {

        if (! ConverterNumber.isNumeric(numberOne) || ! ConverterNumber.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please enter a valid number");
        }
        return  math.subtration(Double.parseDouble(numberOne), Double.parseDouble(numberTwo));

    }

    @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}",
            method = RequestMethod.GET)
    public Double multiplication(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {

        if (! ConverterNumber.isNumeric(numberOne) || ! ConverterNumber.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please enter a valid number");
        }
        return  math.multiplication(Double.parseDouble(numberOne), Double.parseDouble(numberTwo));

    }

    @RequestMapping(value = "/division/{numberOne}/{numberTwo}",
            method = RequestMethod.GET)
    public Double division(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {

        if (! ConverterNumber.isNumeric(numberOne) || ! ConverterNumber.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please enter a valid number");
        }
        return math.division(Double.parseDouble(numberOne), Double.parseDouble(numberTwo));

    }

    @RequestMapping(value = "/mean/{numberOne}/{numberTwo}",
            method = RequestMethod.GET)
    public Double mean(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {

        if (! ConverterNumber.isNumeric(numberOne) || ! ConverterNumber.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please enter a valid number");
        }
        return math.mean(Double.parseDouble(numberOne), Double.parseDouble(numberTwo));

    }
    @RequestMapping(value = "/squareRoot/{number}")
    public Double scareRoot(
            @PathVariable(value = "number") String number)
            throws Exception {
        if (! ConverterNumber.isNumeric(number)) {
            throw new UnsupportedMathOperationException("Please enter a valid number");

        }
        return math.scareRoot(Double.parseDouble(number));

    }


}
