package application.controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.mysql.jdbc.Connection;

import application.models.Usuario;
import application.models.dao.ConnectionBase;
import application.models.dao.UsuarioSQL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class LoginController {
	
	private AnchorPane rootLayout;
	
	@FXML
    private TextField txtNomeUsuario;
	@FXML
    private TextField txtSenha;
	@FXML
    private Button btnEntrar;
	
	
	@FXML
    private void logar(ActionEvent event) {
		
    	String nomeUsuarioLogin = txtNomeUsuario.getText();
    	String senhaUsuarioLogin = txtSenha.getText();
    	
    	

    }
	
	
}
