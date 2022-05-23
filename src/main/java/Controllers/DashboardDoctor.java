package Controllers;

import Main.Main;
import Utilities.SignedInUser;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardDoctor implements Initializable {

    @FXML
    private ImageView Appointments1;

    @FXML
    private ImageView Dashboard1;

    @FXML
    private ImageView LogOut;

    @FXML
    private ImageView MyPatients1;

    @FXML
    private ImageView Profile1;

    @FXML
    private ListView<String> alerts_list;

    @FXML
    private Label doctors_name;

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
    void ViewAppointments(MouseEvent event) {
        Main main = new Main();
        try {
            main.changeScene("ScreenFXMLs/Doctor/ViewAppointments.fxml");
        }
        catch(Exception e) {
            System.out.println("Page not Loaded");
        }
    }

    @FXML
    void ViewPatients(MouseEvent event) {
        Main main = new Main();
        try {
            main.changeScene("ScreenFXMLs/Doctor/ViewPatients.fxml");
        }
        catch(Exception e) {
            System.out.println("Page not Loaded");
        }
    }

    @FXML
    void ViewProfile(MouseEvent event) {
        Main main = new Main();
        try {
            main.changeScene("ScreenFXMLs/Doctor/ViewProfile.fxml");
        }
        catch(Exception e) {
            System.out.println("Page not Loaded");
        }
    }

    public void BackToDashboard(MouseEvent mouseEvent) {
        Main main = new Main();
        try {
            main.changeScene("ScreenFXMLs/Doctor/DashboardDoctor.fxml");
        }
        catch(Exception e) {
            System.out.println("Page not Loaded");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SignedInUser signedInUser = SignedInUser.getInstance();
        doctors_name.setText(signedInUser.getUser().getFirstName() + " "+signedInUser.getUser().getLastName());
        doctors_name.setVisible(true);
    }
}
