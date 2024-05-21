/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models;

import java.text.DecimalFormat;

/**
 *
 * @author edangulo
 */
public class Calculator {
    DecimalFormat df = new DecimalFormat("#.###");
    
    public String add(double a, double b) {
        return df.format(a + b);
    }
    
    public String subtract(double a, double b) {
        return df.format(a - b);
    }
    
    public String multiply(double a, double b) {
        return df.format(a * b);
    }
    
    public String divide(double a, double b) {
        return df.format(a / b);
    }
    
    public String potency(double a , double b){
        return df.format(Math.pow(a, b));
    }
}
