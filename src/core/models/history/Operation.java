/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models.history;

/**
 *
 * @author edangulo
 */
public class Operation {
    
    private double number1;
    private double number2;
    private String operator;
    private String result;

    public Operation(double number1, double number2, String operator, String result) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
        this.result = result;
    }

    public String getResult() {
        return result;
    }
    
    @Override
    public String toString() {
        return number1 + " " + operator + " " + number2 + " = " + result;
    }
    
}
