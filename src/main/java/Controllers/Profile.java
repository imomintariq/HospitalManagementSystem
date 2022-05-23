package Controllers;

import Main.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class Profile {
    public Button signInButton;

    public void BackToLogin(MouseEvent mouseEvent) {
        Main main = new Main();
        try {
            main.changeScene("ScreenFXMLs/LoginScreen.fxml");
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
            main.changeScene("ScreenFXMLs/ViewProfile.fxml");
        }
        catch(Exception e) {
            System.out.println("Page not Loaded");
        }
    }

    public void ViewAppointments(MouseEvent mouseEvent) {
        Main main = new Main();
        try {
            main.changeScene("ScreenFXMLs/Doctor/ViewAppointments.fxml");
        }
        catch(Exception e) {
            System.out.println("Page not Loaded");
        }
    }
}
