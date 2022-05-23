package Controllers;

import Main.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class FindDoctor {

    @FXML
    private ImageView BookBtn;

    @FXML
    private ImageView LogOut;

    @FXML
    private ImageView findDocBtn;

    @FXML
    private ImageView historyBtn;

    @FXML
    private ImageView profileBtn;

    @FXML
    private Button signInButton;

    @FXML
    private Label signedInUserLabel;

    @FXML
    void BackToLogin(MouseEvent event) {
        Main main = new Main();
        try {
            main.changeScene("ScreenFXMLs/LoginScreen.fxml");
        }
        catch(Exception e) {
            System.out.println("Page not Loaded");
        }
    }

    @FXML
    void Booking(MouseEvent event) {
        Main main = new Main();
        try {
            main.changeScene("ScreenFXMLs/Patient/BookAppointment.fxml");
        }
        catch(Exception e) {
            System.out.println("Page not Loaded");
        }
    }

    @FXML
    void SignInButtonClicked(MouseEvent event) {

    }

    @FXML
    void ViewProfile(MouseEvent event) {
        Main main = new Main();
        try {
            main.changeScene("ScreenFXMLs/Patient/ViewProfile.fxml");
        }
        catch(Exception e) {
            System.out.println("Page not Loaded");
        }
    }

    @FXML
    void findDoctor(MouseEvent event) {
        Main main = new Main();
        try {
            main.changeScene("ScreenFXMLs/Patient/FindDoctor.fxml");
        }
        catch(Exception e) {
            System.out.println("Page not Loaded");
        }
    }

    @FXML
    void viewVisitingHistory(MouseEvent event) {
        Main main = new Main();
        try {
            main.changeScene("ScreenFXMLs/Patient/ViewPrescriptions.fxml");
        }
        catch(Exception e) {
            System.out.println("Page not Loaded");
        }
    }

}
