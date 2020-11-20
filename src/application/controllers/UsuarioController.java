package application.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import application.models.Usuario;
import application.models.dao.UsuarioSQL;
import application.util.TextFieldFormatter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class UsuarioController implements Initializable {

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
    	tff.setTf(txtTelefone);
    	tff.formatter();
    }
    
    @FXML
    private void txtCpfKeyReleased() {
    	TextFieldFormatter tff = new TextFieldFormatter();
    	tff.setMask("###.###.###-##");
    	tff.setCaracteresValidos("0123456789");
    	tff.setTf(txtCpf);
    	tff.formatter();
    }

    @FXML
    void executarClickCadastrar(ActionEvent event) {
    	String nome = txtNomeUsuario.getText();
    	String telefone = txtTelefone.getText();
    	String login = txtLogin.getText();
    	String numMatricula = txtNumMatricula.getText();
    	String senha = txtSenha.getText();
    	String cpf = txtCpf.getText();

    	Usuario usuario = new Usuario(0, nome, cpf, login, senha, numMatricula, telefone);
    	UsuarioSQL usuarioSQL = new UsuarioSQL();
    	usuarioSQL.create(usuario);
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

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
//		btnEditar.setDisable(true);
	}

}
