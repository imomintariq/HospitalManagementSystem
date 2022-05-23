package Controllers;

import Main.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ViewPatientProfile {

    @FXML
    private ImageView LogOut;

    @FXML
    private ImageView MyProfile;

    @FXML
    private ImageView bookApp;

    @FXML
    private ImageView findDoctor;

    @FXML
    private ImageView precriptionBtn;

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

    public void Booking(MouseEvent mouseEvent) {
        Main main = new Main();
        try {
            main.changeScene("ScreenFXMLs/Patient/BookAppointments.fxml");
        }
        catch(Exception e) {
            System.out.println("Page not Loaded");
        }
    }
}
