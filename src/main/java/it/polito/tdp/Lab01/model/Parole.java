package it.polito.tdp.Lab01.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parole {
	
	List <String>lparole = new LinkedList<String> ();
	private String parola;	

	
	public Parole() {
		
		
	}

	public void addParola(String p) {
		lparole.add(p);
		
		//TODO
	}
	
	public List<String> getLparole() {
		return lparole;
	}

	public List<String> getElenco() {
		Collections.sort(lparole);
		//TODO
		return lparole;
	}
	
	public void reset() {
		lparole.clear();
		// TODO
	}
	
	public String getParola() {
		String output =  "";
		for(String p : lparole) {
			output = output + p.toString()+ "\n";
			//System.out.println(p);
			
		}
		return output;
	}

	@Override
	public String toString() {
		return "Parole [lparole=" + lparole + "]";
	}
	/*
	public List<String> Elimina(){
		lparole.clear();
		return lparole;
	}
	*/
	public List<String> cancEl(String pa){
		boolean flag = false;
		for(String p: lparole) {
			if(p.compareTo(pa)==0) {
				flag = true;
			}
			
		}
		if (flag==true) {
			lparole.remove(pa);
		}
		
		return lparole;
	}

}