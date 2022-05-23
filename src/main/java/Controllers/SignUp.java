package Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import Entities.HmsUser;
import Main.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.awt.*;

public class SignUp {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label ExceptionText;

    @FXML
    private Button backButton;

    @FXML
    private TextField cnic;

    @FXML
    private PasswordField confirm_password;

    @FXML
    private TextField email;

    @FXML
    private TextField first_name;

    @FXML
    private CheckBox is_doctor;

    @FXML
    private TextField last_name;

    @FXML
    private PasswordField password;

    @FXML
    private TextField phone_number;

    @FXML
    private Button registerButton;

    @FXML
    private TextField username;

    @FXML
    void backButtonClicked(MouseEvent event) {
        Main main = new Main();
        try {
            main.changeScene("ScreenFXMLs/LoginScreen.fxml");
        }
        catch(Exception e) {
            System.out.println("Page not Loaded");
        }

    }

    @FXML
    void registerButtonClicked(MouseEvent event) {
        String _password = password.getText();
        String _email = email.getText();
        String _cnic = cnic.getText();
        String _firstName = first_name.getText();
        String _lastName = last_name.getText();
        String _phoneNumber = phone_number.getText();
        String _confirmedPassword = confirm_password.getText();
        String _username = username.getText();
        boolean _isDoctor = is_doctor.isSelected();
        HmsUser kms = new HmsUser();
        kms.registerAUser(_username, _password, _email, _cnic, _firstName, _lastName, _phoneNumber, _confirmedPassword,_isDoctor);

        Main main = new Main();
        try {
            main.changeScene("ScreenFXMLs/LoginScreen.fxml");
        }
        catch(Exception e) {
            System.out.println("Page not Loaded");
        }
    }

    @FXML
    void initialize() {
        assert ExceptionText != null : "fx:id=\"ExceptionText\" was not injected: check your FXML file 'SignupScreen.fxml'.";
        assert backButton != null : "fx:id=\"backButton\" was not injected: check your FXML file 'SignupScreen.fxml'.";
        assert cnic != null : "fx:id=\"cnic\" was not injected: check your FXML file 'SignupScreen.fxml'.";
        assert confirm_password != null : "fx:id=\"confirm_password\" was not injected: check your FXML file 'SignupScreen.fxml'.";
        assert email != null : "fx:id=\"email\" was not injected: check your FXML file 'SignupScreen.fxml'.";
        assert first_name != null : "fx:id=\"first_name\" was not injected: check your FXML file 'SignupScreen.fxml'.";
        assert is_doctor != null : "fx:id=\"is_doctor\" was not injected: check your FXML file 'SignupScreen.fxml'.";
        assert last_name != null : "fx:id=\"last_name\" was not injected: check your FXML file 'SignupScreen.fxml'.";
        assert password != null : "fx:id=\"password\" was not injected: check your FXML file 'SignupScreen.fxml'.";
        assert phone_number != null : "fx:id=\"phone_number\" was not injected: check your FXML file 'SignupScreen.fxml'.";
        assert registerButton != null : "fx:id=\"registerButton\" was not injected: check your FXML file 'SignupScreen.fxml'.";
        assert username != null : "fx:id=\"username\" was not injected: check your FXML file 'SignupScreen.fxml'.";

    }

}
