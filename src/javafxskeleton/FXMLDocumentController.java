/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxskeleton;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import vehiclestarter.Vehicle;

/**
 *
 * @author J393552
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField manufacturerField;
    @FXML
    private TextField modelField;
    @FXML
    private TextField yearField;
    @FXML
    private TextField tankCapacityField;
    @FXML
    private TextField registrationNumberField;
    @FXML
    private TextField odometerField;
    @FXML
    private TextField petrolField;
    @FXML
    private TextField carPriceField;
    @FXML
    private TextField lastserviceField;
    @FXML
    private Button saveButton;
    @FXML
    private TableView<Vehicle> tableView;
    @FXML
    private TableColumn<Vehicle,String> manufacterColumn;
    @FXML
    private TableColumn<Vehicle,String> modelColumn;
    @FXML
    private TableColumn<Vehicle,Integer> yearColumn;
    @FXML
    private TableColumn<Vehicle,Integer> tankColumn;
    @FXML
    private TableColumn<Vehicle,Integer> regoColumn;
    @FXML
    private TableColumn<Vehicle,Integer> odometerColumn;
    @FXML
    private TableColumn<Vehicle,Integer> petrolColumn;
    @FXML
    private TableColumn<Vehicle,Integer> carPriceColumn;
    @FXML
    private TableColumn<Vehicle,Integer> serviceColumn;
    //ObservableList<Vehicle> vehicles;
    ArrayList<Vehicle> vehiclesList = new ArrayList();
    @FXML
    private Button newButton;
    private int positionVehicleTable;
    @FXML
    private Button rentCarButton;
    
    private void saveButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO        
        this.initializeTableView ();
        
        final ObservableList<Vehicle> tableVehicleSel = tableView.getSelectionModel().getSelectedItems();
        tableVehicleSel.addListener(selectorTablaVechicles);

    }    

    @FXML
    private void addData(ActionEvent event) {
        Vehicle vehicle = new Vehicle();
        vehicle.setManufacturer(manufacturerField.getText());
        vehicle.setModel((modelField.getText()));
        vehicle.setMakeYear(Integer.parseInt(yearField.getText()));
        vehicle.setTankCapacity((tankCapacityField.getText()));
        vehicle.setRegistrationNumber((registrationNumberField.getText()));
        vehicle.setOdometerReading((odometerField.getText()));
        vehicle.setPetrol((petrolField.getText()));
        vehicle.setPricePetrol((carPriceField.getText()));
        vehicle.setLastService((lastserviceField.getText()));
        vehiclesList.add(vehicle);
        //refresh tableview display  
        ObservableList<Vehicle>vehicles = FXCollections.observableArrayList(vehiclesList);
        tableView.setItems(vehicles);
        tableView.refresh();
    }

    @FXML
    private void newData(ActionEvent event) {
        manufacturerField.setText("");
        modelField.setText("");
        yearField.setText("");
        tankCapacityField.setText("");
        registrationNumberField.setText("");
        odometerField.setText("");
        petrolField.setText("");
        carPriceField.setText("");
        lastserviceField.setText("");
    }
    
    private void initializeTableView (){
        Vehicle v1 = new Vehicle("Ford", "T812", 2014, "8Litres", "2HP897", "14000km", "25", "36", "10000km");
        Vehicle v2 = new Vehicle("Toyota", "M456", 2012, "19Litres", "5HP737", "12000km", "46", "28", "10000km");
        Vehicle v3 = new Vehicle("Holden", "P741", 2017, "12Litres", "6DP157", "9000km", "35", "29", "6000km");
        Vehicle v4 = new Vehicle("Nissan", "N845", 2015, "11Litres", "8RP845", "15000km", "32", "30", "14000km");
        Vehicle v5 = new Vehicle("Audi", "Q592", 2015, "13Litres", "7H6897", "11000km", "37", "25", "10000km");
        ArrayList<Vehicle> vehiclesList = new ArrayList();
        vehiclesList.add(v1);
        vehiclesList.add(v2);
        vehiclesList.add(v3);
        vehiclesList.add(v4);
        vehiclesList.add(v5);
        
        manufacterColumn.setCellValueFactory(new PropertyValueFactory("manufacturer"));
        modelColumn.setCellValueFactory(new PropertyValueFactory("model"));
        yearColumn.setCellValueFactory(new PropertyValueFactory("makeYear"));
        tankColumn.setCellValueFactory(new PropertyValueFactory("tankCapacity"));
        regoColumn.setCellValueFactory(new PropertyValueFactory("registrationNumber"));
        odometerColumn.setCellValueFactory(new PropertyValueFactory("odometerReading"));
        petrolColumn.setCellValueFactory(new PropertyValueFactory("petrol"));
        carPriceColumn.setCellValueFactory(new PropertyValueFactory("pricePetrol"));
        serviceColumn.setCellValueFactory(new PropertyValueFactory("lastService"));
        
        ObservableList<Vehicle>vehicles = FXCollections.observableArrayList(vehiclesList);
        tableView.setItems(vehicles);
    }

    private final ListChangeListener<Vehicle> selectorTablaVechicles =
            new ListChangeListener<Vehicle>() {
                @Override
                public void onChanged(ListChangeListener.Change<? extends Vehicle> c) {
                    vehicleSelected();
                }
            };

    public Vehicle getTablaVehicleSelected() {
        if (tableView != null) {
            List<Vehicle> tabla = tableView.getSelectionModel().getSelectedItems();
            if (tabla.size() == 1) {
                final Vehicle competicionSeleccionada = tabla.get(0);
                return competicionSeleccionada;
            }
        }
        return null;
    }

    private void vehicleSelected() {
        final Vehicle vehicle = getTablaVehicleSelected();
        positionVehicleTable = vehiclesList.indexOf(vehicle);

        if (vehicle != null) {
            manufacturerField.setText(vehicle.getManufacturer());
            modelField.setText(vehicle.getModel());
            yearField.setText(Integer.toString(vehicle.getMakeYear()));
            tankCapacityField.setText(vehicle.getTankCapacity());
            registrationNumberField.setText(vehicle.getRegistrationNumber());
            odometerField.setText(vehicle.getOdometerReading());
            petrolField.setText(vehicle.getPetrol());
            carPriceField.setText(vehicle.getPricePetrol());
            lastserviceField.setText(vehicle.getLastService());

        }
    }

    @FXML
    private void rentCar(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("firstStage.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            
            FirstStageController firstController = fxmlLoader.getController();
            firstController.getVehicle(manufacturerField.getText());
            firstController.getCarPrice(carPriceField.getText());
            firstController.getTankVehicle(tankCapacityField.getText());
            firstController.getPetrolPrice(petrolField.getText());
            firstController.getModel(modelField.getText());
            firstController.getYear(yearField.getText());
            firstController.getRego(registrationNumberField.getText());
            firstController.getOdometer(odometerField.getText());
            firstController.getService(lastserviceField.getText());
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));  
            stage.show();
        } catch (Exception e){
            System.out.println("Cant load new window");
        }
    }
}
