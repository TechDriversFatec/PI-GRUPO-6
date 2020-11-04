package application.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class ContaAguaController {

	@FXML
    private TextField txtEsgoto;

    @FXML
    private TextField txtNomeTitular;

    @FXML
    private TextField txtTipoFaturamento;

    @FXML
    private TextField txtRgi;

    @FXML
    private DatePicker txtDataVencimento;

    @FXML
    private TextField txtNumero;

    @FXML
    private TextField txtValorLeituraAtual;

    @FXML
    private TextField txtComplemento;

    @FXML
    private BorderPane btnContaAgua;

    @FXML
    private TextField txtAgua;

    @FXML
    private TextField txtCidade;

    @FXML
    private TextField txtTotalPagar;

    @FXML
    private Button btnLimpar;

    @FXML
    private TextField txtValorLeituraAnterior;

    @FXML
    private TextField txtConsumo;

    @FXML
    private TextField txtDataLeituraAtual;

    @FXML
    private TextField txtRua;

    @FXML
    private TextField txtTipoLigacao;

    @FXML
    private TextField txtCodigoCliente;

    @FXML
    private TextField txtUf;

    @FXML
    private TextField txtPeriodoConsumo;

    @FXML
    private TextField txtCep;

    @FXML
    private TextField txtHidrometro;

    @FXML
    private TextField txtDataLeituraAnterior;

    @FXML
    private TextField txtBairro;

	@FXML
    void clickLimpar(ActionEvent event) {
    	txtRgi.setText("");
    	txtNomeTitular.setText("");
    	txtUf.setText("");
    	txtCidade.setText("");
    	txtBairro.setText("");
    	txtRua.setText("");
    	txtNumero.setText("");
    	txtComplemento.setText("");
    	txtCep.setText("");
    	txtCodigoCliente.setText("");
    	txtTipoLigacao.setText("");
    	txtHidrometro.setText("");
    	txtTipoFaturamento.setText("");
    	txtPeriodoConsumo.setText("");
    	txtAgua.setText("");
    	txtEsgoto.setText("");
    	txtConsumo.setText("");
    	txtValorLeituraAtual.setText("");
    	txtValorLeituraAnterior.setText("");
    	txtDataLeituraAtual.setText("");
    	txtDataLeituraAnterior.setText("");
//    	txtDataVencimento.setValue();
    	txtTotalPagar.setText("");
    }

}
