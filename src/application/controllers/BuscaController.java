package application.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tooltip;

public class BuscaController implements Initializable{

	@FXML
	private RadioButton rbCPF;
	
	@FXML
	private RadioButton rbNome;
	
	@FXML
	private RadioButton rbLuz;
	
	@FXML
	private RadioButton rbGas;
	
	@FXML
	private RadioButton rbAgua;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	      Tooltip toolTip1 = new Tooltip("CPF do Cliente");
	      rbCPF.setTooltip(toolTip1);
	      
	      Tooltip toolTip2 = new Tooltip("Nome do Cliente");
	      rbNome.setTooltip(toolTip2);
	      
	      Tooltip toolTip3 = new Tooltip("Número de Instalação");
	      rbLuz.setTooltip(toolTip3);
	      
	      Tooltip toolTip4 = new Tooltip("Código do Usuário");
	      rbGas.setTooltip(toolTip4);
	      
	      Tooltip toolTip5 = new Tooltip("RGI");
	      rbAgua.setTooltip(toolTip5);
	      
	      

	}

}
