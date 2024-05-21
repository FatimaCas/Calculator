/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers;

import core.controllers.utils.Response;
import core.controllers.utils.Status;
import core.models.History;
import core.models.storage.Storage;

/**
 *
 * @author USER
 */
public class HistoryController {

    public static Response updateHistory() {
        try {
            Storage storage = Storage.getInstance();
            if(storage.getOperations().isEmpty()){
                return new Response("There is no history", Status.NOT_FOUND);
            }
            History history = new History(storage.getOperations());
            return new Response("History updated", Status.OK, history);
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
}
