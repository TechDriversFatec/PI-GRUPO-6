package application.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import application.models.Cliente;
import application.models.Imovel;
import application.models.dao.ClienteSQL;
import application.models.dao.ImovelSQL;
import application.util.TextFieldFormatter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class ImovelController implements Initializable {

    @FXML
    private TextField txtIdentificacao;

    @FXML
    private Button btnCadastrar;

    @FXML
    private TextField txtNumero;

    @FXML
    private TextField txtRua;

    @FXML
    private Button btnEditar;

    @FXML
    private TextField txtComplemento;

    @FXML
    private ChoiceBox<String> tiposImovel;

    @FXML
    private Button btnContinuarCadastro;

    @FXML
    private TextField txtCidade;

    @FXML
    private TextField txtUf;

    @FXML
    private TextField txtNomeCliente;

    @FXML
    private TextField txtCep;

    @FXML
    private Button btnLimpar;

    @FXML
    private TextField txtBairro;
    
    @FXML
    private TextField txtIdentificacaoImovel;
    
    @FXML
    private Button btnBuscarCliente;
    
    public Cliente cliente;
    
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
		txtIdentificacao.setText("");
		txtIdentificacaoImovel.setText("");
    	txtNomeCliente.setText("");
    	txtUf.setText("");
    	txtCidade.setText("");
    	txtBairro.setText("");
    	txtRua.setText("");
    	txtNumero.setText("");
    	txtComplemento.setText("");
    	txtCep.setText("");
    	
	}

    @FXML
    void clickEditar(ActionEvent event) {

    }

    @FXML
    void clickCadastrar(ActionEvent event) {
    	int idCliente = this.cliente.getId_cli();
    	String tipo = tiposImovel.getValue();
    	int identificacao = Integer.parseInt(txtIdentificacaoImovel.getText());
    	String uf = txtUf.getText();
    	String cidade = txtCidade.getText();
    	String bairro = txtBairro.getText();
    	String rua = txtRua.getText();
    	String numero = txtNumero.getText();
    	String complemento = txtComplemento.getText();
    	String cep = txtCep.getText();
    
    	Imovel imovel = new Imovel(0, idCliente, tipo, identificacao, uf, cidade, bairro, rua, numero, complemento, cep);
    	ImovelSQL imovelSQL = new ImovelSQL();
    	imovelSQL.create(imovel);

    }
    
    @FXML
    void clickBuscarCliente(ActionEvent event) {
    	ClienteSQL clienteSQL = new ClienteSQL();
    	this.cliente = clienteSQL.buscarClientePeloNome(txtNomeCliente.getText());
    	txtNomeCliente.setText(cliente.nome_cli);
    }

    @FXML
    void clickContinuarCadastro(ActionEvent event) {

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	    tiposImovel.getItems().add("Água: RGI");
	    tiposImovel.getItems().add("Gás: Código do Usuário");
	    tiposImovel.getItems().add("Luz: Número de Instalação");
	}
	

}
	

	

