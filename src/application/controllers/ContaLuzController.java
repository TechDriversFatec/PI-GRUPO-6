package application.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
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
    private TextField txtDataLeituraAtual;

    @FXML
    private TextField txtContaMes;

    @FXML
    private TextField txtGrupoSubgrupo;

    @FXML
    private TextField txtRua;

    @FXML
    private TextField txtClasseSubclasse;

    @FXML
    private TextField txtDataDeVencimento;

    @FXML
    private TextField txtModTarifaria;

    @FXML
    private TextField txtUf;

    @FXML
    private TextField txtCep;

    @FXML
    private TextField txtDataLeituraAnterior;

    @FXML
    private TextField txtBairro;
    
    @FXML
    private TextField txtDataVencimento;
    
    
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
    	txtDataLeituraAtual.setText("");
    	txtDataLeituraAnterior.setText("");
    	txtDataVencimento.setText("");
    	txtTotalPagar.setText("");
    }
    
    @FXML
    void clickEditar(ActionEvent event) {
    	
    }

}
