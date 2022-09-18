package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;

public class HomeFormController {

    public AnchorPane dashBoardPane;
    public ToggleButton btnDashBoard;
    public ToggleGroup menuBtn;
    public ToggleButton btnBookingRoom;
    public ToggleButton btnCustomerDetails;
    public ToggleButton btnPackages;
    public ToggleButton btnLogOut;
    public AnchorPane context;

    void loadUi(String fileName) throws IOException {
        URL resource = getClass().getResource("../view/"+fileName+".fxml");
        Parent load = FXMLLoader.load(resource);
        context.getChildren().clear();
        context.getChildren().add(load);
    }

    void logOutUi(String logOutFileName) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("../view/"+logOutFileName+".fxml"));
        Scene scene = new Scene(parent);
        Stage primaryStage =(Stage) this.context.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
    }

    public void toggleButton(ActionEvent actionEvent) throws IOException {


        if(actionEvent.getSource()==btnDashBoard){
            loadUi("DashBoardForm");
        }
        if(actionEvent.getSource()==btnBookingRoom){
            loadUi("BookingRoomForm");
        }
        if(actionEvent.getSource()==btnCustomerDetails){
            loadUi("CustomerDetailsForm");
        }
        if(actionEvent.getSource()==btnPackages){
            loadUi("HotelPackageForm");
        }
        if(actionEvent.getSource()==btnLogOut){
            //new Alert(Alert.AlertType.WARNING,"Are You Sure?", ButtonType.CLOSE).show();
            logOutUi("LoginForm");
        }

    }
}
