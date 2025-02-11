package it.polito.tdp.Lab01;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.Lab01.model.Parole;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole p = new Parole();
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnInserisci;

    @FXML
    private Button btnReset;
    
    @FXML
    private Button btnCancella;

    @FXML
    private TextField txtParola;

    @FXML
    private TextArea txtResult;
    
    @FXML
    private TextArea txtTempi;


    @FXML
    void doInsert(ActionEvent event) {
    	
    	String parola;
    	parola = txtParola.getText();
    	
    	p.addParola(parola);
    	
    	txtResult.clear();
    	txtTempi.clear();
    	p.getElenco();
    	//System.out.println(p.getParola());
    	txtResult.setText(p.getParola());
    	//txtTempi.setText(System.nanoTime());
    	long tempo = System.nanoTime();
    	
    	txtTempi.setText(Long.toString(tempo));

    }

    @FXML
    void doReset(ActionEvent event) {
    	txtTempi.clear();
    	p.reset();
    	txtResult.clear();
    	txtParola.clear();
    	long tempo = System.nanoTime();
    	
    	txtTempi.setText(Long.toString(tempo));

    }
    
    @FXML
    void doCancella(ActionEvent event) {
    	txtTempi.clear();
    	p.cancEl(txtParola.getText());
    	txtParola.clear();
    	p.getElenco();
    	txtResult.clear();
    	txtResult.setText(p.getParola());
    	long tempo = System.nanoTime();
    	
    	txtTempi.setText(Long.toString(tempo));

    }

    @FXML
    void initialize() {
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTempi != null : "fx:id=\"txtTempi\" was not injected: check your FXML file 'Scene.fxml'.";
        
        
    }

}
