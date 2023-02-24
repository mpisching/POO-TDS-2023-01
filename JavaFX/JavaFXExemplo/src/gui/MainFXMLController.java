/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author mpisc
 */
public class MainFXMLController implements Initializable {

    @FXML
    private TextField tfPrimeiroNome;
    @FXML
    private TextField tfUltimoNome;
    @FXML
    private Label lbNomeCompleto;
    @FXML
    private Button btOk;
    @FXML
    private Button btLimpar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleBtOk(ActionEvent event) {
        String primeiroNome = tfPrimeiroNome.getText();
        String ultimoNome = tfUltimoNome.getText();
        String nomeCompleto = primeiroNome + " " + ultimoNome;
        lbNomeCompleto.setText(nomeCompleto);
    }

    @FXML
    private void handleBtLimpar(ActionEvent event) {
        tfPrimeiroNome.clear();
        tfUltimoNome.clear();
        lbNomeCompleto.setText("");
        tfPrimeiroNome.requestFocus();
    }
    
}
