/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models.history;

import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class History {
    
    private static History instance;
    private ArrayList<Operation> operations;

    public History(){
        this.operations = new ArrayList<>();
    }
    
    //Method of the class
    public void addOperation(Operation operation) {
        this.operations.add(operation);
    }
    
    //Getter
    public static History getInstance() {
        if (instance == null) {
            instance = new History();
        }
        return instance;
    }
    
    //Getter
    public ArrayList<Operation> getOperations() {
        return operations;
    }
}
