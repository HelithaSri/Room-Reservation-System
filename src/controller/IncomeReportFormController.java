package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class IncomeReportFormController {

    public JFXButton btnAnnually;
    public AnchorPane reportContext;
    public JFXButton btnMonthly;

    void loadUi(String fileName) throws IOException {
        URL resource = getClass().getResource("../view/"+fileName+".fxml");
        Parent load = FXMLLoader.load(resource);
        reportContext.getChildren().clear();
        reportContext.getChildren().add(load);
    }

    public void btnMonthly(ActionEvent actionEvent) throws IOException {
        loadUi("MonthlyForm");
    }

    public void btnAnnually(ActionEvent actionEvent) throws IOException {
        loadUi("AnnuallyForm");
    }
}
