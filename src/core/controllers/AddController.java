/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers;

import calculator.Calculator;
import core.controllers.utils.Response;
import core.controllers.utils.Status;
import core.models.History;
import core.models.Operation;

/**
 *
 * @author USER
 */
public class AddController {

    public static Response addNumbers(String number1, String number2) {
        try {
            double num1, num2;
            String[] decimales;
            if (number1.isEmpty()) {
                return new Response("Number 1 must be not empty", Status.BAD_REQUEST);
            }
            if (number2.isEmpty()) {
                return new Response("Number 2 must be not empty", Status.BAD_REQUEST);
            }
            if (number1.contains(".")) {
                decimales = number1.split("\\.");
                if (decimales[1].length() > 3) {
                    return new Response("Number 1 must only have 3 decimals", Status.BAD_REQUEST);
                }
            }
            if (number2.contains(".")) {
                decimales = number2.split("\\.");
                if (decimales[1].length() > 3) {
                    return new Response("Number 2 must only have 3 decimals", Status.BAD_REQUEST);
                }
            }
            try {
                num1 = Double.parseDouble(number1);
                num2 = Double.parseDouble(number2);

            } catch (NumberFormatException ex) {
                return new Response("Numbers must be numeric", Status.BAD_REQUEST);
            }
            Calculator calculator = new Calculator();
            History history = new History();
            Operation operation = new Operation(num1, num2, "+", calculator.add(num1, num2));
            history.addOperation(operation);
            return new Response("Successful operation", Status.OK, operation);
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
}
