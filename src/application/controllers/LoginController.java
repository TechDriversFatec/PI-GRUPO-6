package application.controllers;

import application.models.dao.LoginSQL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LoginController {
	
	private AnchorPane rootLayout;
	
	@FXML
    private TextField txtNomeUsuario;
	@FXML
    private TextField txtSenha;
	@FXML
    private Button btnEntrar;
	
	//ERRO QUANDO CLICA NO BOTÃO DE ENTRAR :(
	@FXML
    public void login(ActionEvent event) throws Exception{
		
    	String nomeUsuarioLogin = txtNomeUsuario.getText();
    	String senhaLogin = txtSenha.getText();
    	
    	LoginSQL loginSQL = new LoginSQL();
    	
    	loginSQL.buscarUsuario(nomeUsuarioLogin, senhaLogin);
    	
    }
	
	
}
