/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;

/**
 *
 * @author edangulo
 */
public class History {

    private ArrayList<Operation> operations;

    public History(ArrayList<Operation> storage) {
        this.operations = storage;
    }
    //Da el historial de operaciones
    public DefaultListModel history() {
        ArrayList<Operation> operationHistory = this.operations;
        Collections.reverse(this.operations);

        DefaultListModel model = new DefaultListModel();
        model.addAll(operationHistory);
        
        return model;
    }
}
