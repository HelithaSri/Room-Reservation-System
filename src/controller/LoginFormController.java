package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public TextField loginName;
    public PasswordField loginPassword;
    public AnchorPane loginPane;
    public Label lblError;

    public void userLogin(ActionEvent actionEvent) throws IOException {
        if (loginPassword.getText().equals("User") & loginName.getText().equals("User")){
            Stage window = (Stage) loginPane.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/HomeForm.fxml"))));
        }
        if (loginPassword.getText().equals("Admin") & loginName.getText().equals("Admin")){
            Stage window = (Stage) loginPane.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminHomeForm.fxml"))));
        }
        else {
            lblError.setText("Invalid Username or Password");

        }
    }
}
