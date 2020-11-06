package application.controllers;

import application.util.TextFieldFormatter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class ContaLuzController {

    @FXML
    private TextField txtNumeroIdentificacao;

    @FXML
    private TextField txtNomeTitular;

    @FXML
    private TextField txtDiasFatura;

    @FXML
    private TextField txtNumero;

    @FXML
    private TextField txtValorLeituraAtual;

    @FXML
    private Button botaoLimparCamposLuz;

    @FXML
    private TextField txtTensaoNominal;

    @FXML
    private TextField txtComplemento;

    @FXML
    private TextField txtMedidor;

    @FXML
    private TextField txtBandeiraTarifaria;

    @FXML
    private BorderPane btnContaAgua;

    @FXML
    private TextField txtCidade;

    @FXML
    private TextField txtTotalPagar;

    @FXML
    private TextField txtCodIdentificacaoConta;
    
    @FXML
    private TextField txtValorLeituraAnterior;
    
    @FXML
    private TextField txtTpFornecimento;

    @FXML
    private TextField txtConsumo;

    @FXML
    private DatePicker txtDataLeituraAtual;

    @FXML
    private TextField txtContaMes;

    @FXML
    private TextField txtGrupoSubgrupo;

    @FXML
    private TextField txtRua;

    @FXML
    private TextField txtClasseSubclasse;

    @FXML
    private TextField txtModTarifaria;

    @FXML
    private TextField txtUf;

    @FXML
    private TextField txtCep;

    @FXML
    private DatePicker txtDataLeituraAnterior;

    @FXML
    private TextField txtBairro;

    @FXML
    private DatePicker txtDataVencimento;
    
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
    	txtNumeroIdentificacao.setText("");
    	txtNomeTitular.setText("");
    	txtUf.setText("");
    	txtCidade.setText("");
    	txtBairro.setText("");
    	txtRua.setText("");
    	txtNumero.setText("");
    	txtComplemento.setText("");
    	txtCep.setText("");
    	txtGrupoSubgrupo.setText("");
    	txtTpFornecimento.setText("");
    	txtModTarifaria.setText("");
    	txtClasseSubclasse.setText("");
    	txtTensaoNominal.setText("");
    	txtMedidor.setText("");
    	txtCodIdentificacaoConta.setText("");
    	txtContaMes.setText("");
    	txtBandeiraTarifaria.setText("");
    	txtDiasFatura.setText("");
    	txtConsumo.setText("");
    	txtValorLeituraAtual.setText("");
    	txtValorLeituraAnterior.setText("");
    	txtDataLeituraAtual.setValue(null);
    	txtDataLeituraAnterior.setValue(null);
    	txtDataVencimento.setValue(null);
    	txtTotalPagar.setText("");
    }
    
    @FXML
    void clickEditar(ActionEvent event) {
    	
    }

}
