package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AdminHomeFormController {
    public ToggleButton btnDashBoard;
    public ToggleButton btnLogOut;
    public ToggleGroup menuBtnAdmin;
    public AnchorPane admincontext;
    public ToggleButton btnIncomeReport;
    public ToggleButton btnCreateUsers;
    public ToggleButton btnChangePackages;


    void loadUi(String fileName) throws IOException {
        URL resource = getClass().getResource("../view/"+fileName+".fxml");
        Parent load = FXMLLoader.load(resource);
        admincontext.getChildren().clear();
        admincontext.getChildren().add(load);
    }

    void logOutUi(String logOutFileName) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("../view/"+logOutFileName+".fxml"));
        Scene scene = new Scene(parent);
        Stage primaryStage =(Stage) this.admincontext.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
    }

    public void toggleButton(ActionEvent actionEvent) throws IOException {
        if(actionEvent.getSource()==btnDashBoard){
            loadUi("DashBoardForm");
        }
        if(actionEvent.getSource()==btnIncomeReport){
            loadUi("IncomeReportForm");
        }
        if(actionEvent.getSource()==btnCreateUsers){
            loadUi("CreateUsersForm");
        }
        if(actionEvent.getSource()==btnChangePackages){
            loadUi("ChangePackageForm");
        }
        if(actionEvent.getSource()==btnLogOut){
            logOutUi("LoginForm");
        }
    }
}
