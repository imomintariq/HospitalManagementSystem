package Controllers;

import Main.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Login {

    @FXML
    private Label incorrectTextLabel;

    @FXML
    private PasswordField password;

    @FXML
    private Button signInButton;

    @FXML
    private TextField username;

    @FXML
    void SignInButtonClicked(MouseEvent event) {
        Main main = new Main();
        try {
            main.changeScene("ScreenFXMLs/Doctor/DashboardDoctor.fxml");
        }
        catch(Exception e) {
            System.out.println("Page not Loaded");
        }
    }

}
