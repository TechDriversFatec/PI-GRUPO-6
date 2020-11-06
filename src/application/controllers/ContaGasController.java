package application.controllers;

import application.util.TextFieldFormatter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class ContaGasController {

    @FXML
    private TextField txtValorLeituraAnterior;

    @FXML
    private TextField txtNomeTitular;

    @FXML
    private TextField txtConsumo;

    @FXML
    private DatePicker txtDataLeituraAtual;

    @FXML
    private DatePicker txtDataLeituraAnterior;

    @FXML
    private DatePicker txtDataVencimento;

    @FXML
    private TextField txtCodUsuario;

    @FXML
    private TextField txtNumero;

    @FXML
    private TextField txtRua;

    @FXML
    private TextField txtNumeroMedidor;

    @FXML
    private TextField txtValorLeituraAtual;

    @FXML
    private TextField txtDiasConsumo;

    @FXML
    private TextField txtComplemento;

    @FXML
    private TextField txtTipoMedidor;

    @FXML
    private TextField txtSegmento;

    @FXML
    private TextField txtConsumoCorrigido;

    @FXML
    private BorderPane btnContaAgua;

    @FXML
    private TextField txtCidade;

    @FXML
    private TextField txtUf;

    @FXML
    private TextField txtCep;

    @FXML
    private TextField txtTotalPagar;

    @FXML
    private TextField txtBairro;
    
    @FXML
    private Button btnLimpar;
    
    @FXML
    private void txtCepKeyReleased() {
    	TextFieldFormatter tff = new TextFieldFormatter();
    	tff.setMask("#####-###");
    	tff.setCaracteresValidos("0123456789");
    	tff.setTf(txtCep);
    	tff.formatter();
    }
	
    @FXML
    void clickLimpar(ActionEvent event) {
    	txtCodUsuario.setText("");
    	txtNomeTitular.setText("");
    	txtUf.setText("");
    	txtCidade.setText("");
    	txtBairro.setText("");
    	txtRua.setText("");
    	txtNumero.setText("");
    	txtComplemento.setText("");
    	txtCep.setText("");
    	txtSegmento.setText("");
    	txtDiasConsumo.setText("");
    	txtTipoMedidor.setText("");
    	txtNumeroMedidor.setText("");
    	txtConsumoCorrigido.setText("");
    	txtConsumo.setText("");
    	txtValorLeituraAtual.setText("");
    	txtValorLeituraAnterior.setText("");
    	txtDataLeituraAtual.setValue(null);
    	txtDataLeituraAnterior.setValue(null);
    	txtDataVencimento.setValue(null);
    	txtTotalPagar.setText("");
    }
    
}
