package application.controllers;

import application.util.TextFieldFormatter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ClienteController {

    @FXML
    private Button btnCadastrar;

    @FXML
    private TextField txtTelefone;

    @FXML
    private TextField txtCpf;

    @FXML
    private TextField txtNumero;

    @FXML
    private TextField txtRua;

    @FXML
    private Button btnEditar;

    @FXML
    private TextField txtComplemento;

    @FXML
    private TextField txtCidade;

    @FXML
    private TextField txtUf;

    @FXML
    private TextField txtNomeCliente;

    @FXML
    private TextField txtCep;

    @FXML
    private Button btnBuscar;

    @FXML
    private Button btnLimpar;

    @FXML
    private TextField txtBairro;
    
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
    private void txtCepKeyReleased() {
    	TextFieldFormatter tff = new TextFieldFormatter();
    	tff.setMask("#####-###");
    	tff.setCaracteresValidos("0123456789");
    	tff.setTf(txtCep);
    	tff.formatter();
    }

    @FXML
    void executarClickCadastrar(ActionEvent event) {

    }

    @FXML
    void executarClickBuscar(ActionEvent event) {

    }


    @FXML
    void executarClickEditar(ActionEvent event) {

    }

    @FXML
    void executarClickLimpar(ActionEvent event) {
    	txtNomeCliente.setText("");
    	txtCpf.setText("");
    	txtUf.setText("");
    	txtCidade.setText("");
    	txtBairro.setText("");
    	txtRua.setText("");
    	txtNumero.setText("");
    	txtComplemento.setText("");
    	txtCep.setText("");
    	txtTelefone.setText("");
    	
	}

}
