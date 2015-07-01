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
public class Complessa implements SheetFunction{

	public Complessa() {}

        @Override
	public Object execute(Object[] args){
		double cost = (double) args[0];
		double val = (double) args[1];
		int life = (int)(double) args[2];
		
		Double[] ammort = new Double[life+1];
		for(int i = 0; i < life+1 ; i++)
			ammort[i] = ((cost-val) * (life - i)*2) / (life * (life + 1));
		
		return ammort;
			
	}

        @Override
	public String getCategory(){
		return "Finanza";
	}

        @Override
	public String getHelp(){
		return "Restituisce l'ammortamento degressivo aritmetico per un determinato periodo";
	}

        @Override
	public String getName(){
		return "AMMORT. ANNUO";
	}

} 
