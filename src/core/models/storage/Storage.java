/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models.storage;

import core.models.Operation;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Storage {

    // Instancia Singleton
    private static Storage instance;

    // Atributos del Storage
    private ArrayList<Operation> operations;

    private Storage() {
        this.operations = new ArrayList<>();
    }
    
    public void addOperation(Operation operation) {
        this.operations.add(operation);
    }
    
    public static Storage getInstance() {
        if (instance == null) {
            instance = new Storage();
        }
        return instance;
    }
    
    public ArrayList<Operation> getOperations() {
        return operations;
    }
    
}
