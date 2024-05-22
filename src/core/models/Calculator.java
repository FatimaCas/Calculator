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
    
    //Da el resultado de las operaciones con el formato de máximo tres decimales
    public String result(double result){
        return df.format(result);
    }
}
