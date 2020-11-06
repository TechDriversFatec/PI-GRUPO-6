package application.controllers;

import application.util.TextFieldFormatter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class UsuarioController {

    @FXML
    private TextField txtLogin;

    @FXML
    private TextField txtNomeUsuario;

    @FXML
    private TextField txtSenha;

    @FXML
    private Button btnCadastrar;

    @FXML
    private TextField txtTelefone;

    @FXML
    private TextField txtCpf;

    @FXML
    private TextField txtNumMatricula;

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnLimpar;

    @FXML
    private Button btnBuscar;

    @FXML
    private Label lblMensagem;
    
    @FXML
    private void txtTelefoneKeyReleased() {
    	TextFieldFormatter tff = new TextFieldFormatter();
    	tff.setMask("(##)#####-####");
    	tff.setCaracteresValidos("0123456789");
    	tff.setTf (txtTelefone);
    	tff.formatter();
    }
    
    @FXML
    private void txtCpfKeyReleased() {
    	TextFieldFormatter tff = new TextFieldFormatter();
    	tff.setMask("###.###.###-##");
    	tff.setCaracteresValidos("0123456789");
    	tff.setTf (txtCpf);
    	tff.formatter();
    }

    @FXML
    void executarClickCadastrar(ActionEvent event) {

    }

    @FXML
    void executarClickEditar(ActionEvent event) {

    }

    @FXML
    void executarClickBuscar(ActionEvent event) {

    }
    
    @FXML
    void executarClickLimpar(ActionEvent event) {
    	txtNomeUsuario.setText("");
    	txtTelefone.setText("");
    	txtLogin.setText("");
    	txtNumMatricula.setText("");
    	txtSenha.setText("");
    	txtCpf.setText("");
    	
    }

}
