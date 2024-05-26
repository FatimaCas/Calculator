/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers;

import core.controllers.utils.Response;
import core.controllers.utils.Status;
import core.models.history.History;
import core.models.history.Operation;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;

/**
 *
 * @author USER
 */
public class HistoryController {

    public static Response updateHistory() {
        try {
            History history = History.getInstance();
            if (history.getOperations().isEmpty()) {
                return new Response("There is no history", Status.NOT_FOUND);
            }
            
            //History's not empty: prepare it and send it to the view
            
            //First declare a COPY of the List that belongs to history, so the original one does not get reversed
            ArrayList<Operation> operationHistory = new ArrayList<>(history.getOperations()); 
            Collections.reverse(operationHistory);

            DefaultListModel model = new DefaultListModel();
            model.addAll(operationHistory);
            
            return new Response("History updated", Status.OK, model);
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
}
