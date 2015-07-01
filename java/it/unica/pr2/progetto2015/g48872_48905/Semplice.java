/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unica.pr2.progetto2015.g48872_48905;
import it.unica.pr2.progetto2015.interfacce.SheetFunction;
/**
 *
 * @author Mattia Bruno 
 * @author Alberto Musa
 */
public class Semplice implements SheetFunction {
    
    public Semplice() {}

    @Override
    /**
     *Chiamata del metodo execute.
     * Restituisce la stringa ricevuta dall'array in maiuscolo utilizzando il metodo
     * toUpperCase presente nella libreria String.
     */
	public Object execute(Object[] args){
            String str = (String) args[0];
            return str.toUpperCase();
	}

    @Override
    /**
     *Chiamata del metodo getCategory.
     * Il metodo restituisce la stringa Testo, categoria della funzione MAIUSC.
     */
	public String getCategory(){
		return "Testo";
	}

    @Override
    /**
     * Chiamata del metodo getHelp.
     * Il metodo restituisce la stringa con un messaggio dove spiega la funnzione utilizzata.
     */
	public String getHelp(){
		return "Converte la stringa specificata nel campo di testo in maiuscolo";
	}

    @Override
    /**
     * Chiamata del metodo getName.
     * Il metodo restituisce la stringa MAIUSC, nome della funzione.
     */
	public String getName(){
		return "MAIUSC";
        }

}
