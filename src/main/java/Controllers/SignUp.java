package Controllers;

import Main.Main;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;

import java.awt.*;

public class SignUp {

    @FXML
    private Label ExceptionText;

    @FXML
    private Button backButton;

    @FXML
    private TextField cnic;

    @FXML
    private PasswordField confirmPassword;

    @FXML
    private TextField email;

    @FXML
    private TextField firstName;

    @FXML
    private TextField lastName;

    @FXML
    private PasswordField password;

    @FXML
    private TextField phoneNumber;

    @FXML
    private Button registerButton;

    @FXML
    private TextField username;

    public void registerButtonClicked(MouseEvent mouseEvent) {
        String _password = password.getText();
        String _email = email.getText();
        String _cnic = cnic.getText();
        String _firstName = firstName.getText();
        String _lastName = lastName.getText();
        String _phoneNumber = phoneNumber.getText();
        String _confirmedPassword = confirmPassword.getText();
        String _username = username.getText();
//        KametiDatabaseHandler kms = new KametiDatabaseHandler();
//        kms.registerAUser(_username, _password, _email, _cnic, _firstName, _lastName, _phoneNumber, _confirmedPassword,false);


    }

    public void backButtonClicked(MouseEvent mouseEvent) {
        Main main = new Main();
        try {
            main.changeScene("ScreenFXMLs/LoginScreen.fxml");
        }
        catch(Exception e) {
            System.out.println("Page not Loaded");
        }
    }
}
