/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxskeleton;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author j393552
 */
public class FirstStageController implements Initializable {
    
    ObservableList<String> daysList = FXCollections.observableArrayList("0","1","2","3","4","5","6","7","8","9","10");

    @FXML
    private ComboBox daysCB;
    @FXML
    private Label carPriceLabel;
    @FXML
    private Label PetrolPriceLabel;
    @FXML
    private Label totalPriceLabel;
    @FXML
    private Button rentButton;
    @FXML
    private TextField carTF;
    @FXML
    private Label daySelected;
    @FXML
    private Button printButton;
    @FXML
    private TextField petrolTF;
    @FXML
    private TextArea recepitPanel;
    @FXML
    private Label modelLabel;
    @FXML
    private Label yearLabel;
    @FXML
    private Label regoLabel;
    @FXML
    private Label odometerLabel;
    @FXML
    private Label serviceLabel;
    @FXML
    private Button generateReceiptButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        daysCB.setValue("0");
        daysCB.setItems(daysList);

    }    
    
    public void getVehicle (String Text){
        carTF.setText(Text);
    }
    
    public void getCarPrice (String Text){
        carPriceLabel.setText(Text);
    }
    
    public void getTankVehicle (String Text){
        petrolTF.setText(Text);
    }
    
    public void getPetrolPrice (String Text){
        PetrolPriceLabel.setText(Text);
    }
    
    public void getAllInformation (String Text){
        recepitPanel.setText(Text);
    }
    
    public void getModel (String Text){
        modelLabel.setText(Text);
    }
    
    public void getRego (String Text){
        regoLabel.setText(Text);
    }
    
    public void getYear (String Text){
        yearLabel.setText(Text);
    }
    
    public void getOdometer (String Text){
        odometerLabel.setText(Text);
    }
    public void getService (String Text){
        serviceLabel.setText(Text);
    }
    
    public static String rentCalc (Double days,Double carMoney,  Double petrolFullPrice){
        String result = String.format("$ %.2f", (days * carMoney) + petrolFullPrice);
        return result;
    }
    
    public static int petrolCal(int TankCapacity, int petrolPrice) {
        int result = 0;
        result = (TankCapacity * petrolPrice);
        // TODO logic in here
        return result;
    }


    @FXML
    private void rent(ActionEvent event) {
        
        totalPriceLabel.setText( rentCalc( Double.parseDouble(daySelected.getText()), Double.parseDouble(carPriceLabel.getText()), Double.parseDouble(PetrolPriceLabel.getText())));
    }

    @FXML
    private void daySelected(ActionEvent event) {
        daySelected.setText(daysCB.getValue().toString());
    }

    @FXML
    private void printRecive(ActionEvent event) {
        recepitPanel.setText("                    Car Rent          ");
        recepitPanel.appendText("\n-----------------------------------");
        recepitPanel.appendText("\n Name: " );
        recepitPanel.appendText("\n Surname: " );
        recepitPanel.appendText("\n Mobile: " );
        recepitPanel.appendText("\n------------- DETAILS -------------");
        recepitPanel.appendText("\n Manufacturer: " + carTF.getText());
        recepitPanel.appendText("\n Model: " + modelLabel.getText());
        recepitPanel.appendText("\n Year: " + yearLabel.getText());
        recepitPanel.appendText("\n Tank Capacity: " + petrolTF.getText());
        recepitPanel.appendText("\n Registration number: " + regoLabel.getText());
        recepitPanel.appendText("\n Odometer Reading: " + odometerLabel.getText());
        recepitPanel.appendText("\n Last service: " + serviceLabel.getText());
        recepitPanel.appendText("\n-----------------------------------");
        recepitPanel.appendText("\n No. days: " + daySelected.getText());
        recepitPanel.appendText("\n Petro price: $" + PetrolPriceLabel.getText());
        recepitPanel.appendText("\n Car price: $" + carPriceLabel.getText());
        recepitPanel.appendText("\n-----------------------------------");
        recepitPanel.appendText("\n The total price is: " + totalPriceLabel.getText());
    }

    @FXML
    private void generateReceipt(ActionEvent event) {
    }
}
