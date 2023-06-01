/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package br.edu.ifsc.fln.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;


/**
 * FXML Controller class
 *
 * @author mpisc
 */
public class FXMLVBoxMainAppController implements Initializable {
    @FXML
    private AnchorPane anchorPane;
    
    @FXML
    private MenuItem menuItemCadastroCliente;

    @FXML
    private MenuItem menuItemCadastroProduto;
    
    @FXML
    private MenuItem menuItemCadastroCategoria;

    @FXML
    private MenuItem menuItemGraficoVendasPorMes;

    @FXML
    private MenuItem menuItemProcessoEstoque;

    @FXML
    private MenuItem menuItemProcessoVendas;

    @FXML
    private MenuItem menuItemRelatorioQuantidadeEstoqueProdutos;

    @FXML
    void handleMenuItemCadastroProduto(ActionEvent event) {

    }

    @FXML
    public void handleMenuItemCadastroCategoria() throws IOException {
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("../view/FXMLAnchorPaneCadastroCategoria.fxml"));
        anchorPane.getChildren().setAll(a);
    }
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
