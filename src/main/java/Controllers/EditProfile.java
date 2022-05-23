package Controllers;

import Entities.HmsUser;
import Main.Main;
import Utilities.SignedInUser;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class EditProfile {

    @FXML
    private ImageView BookBtn;

    @FXML
    private ImageView LogOut;

    @FXML
    private TextField email_address;

    @FXML
    private ImageView findDocBtn;

    @FXML
    private TextField first_name;

    @FXML
    private ImageView historyBtn;

    @FXML
    private TextField last_name;

    @FXML
    private TextField password;

    @FXML
    private ImageView profileBtn;

    @FXML
    private Button saveButton;

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
            main.changeScene("ScreenFXMLs/Patient/BookAppointments.fxml");
        }
        catch(Exception e) {
            System.out.println("Page not Loaded");
        }
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
    void onClickSave(MouseEvent event) {
        HmsUser.updateSignedInUser();
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

