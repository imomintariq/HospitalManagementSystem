package Controllers;

import Main.Main;
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
    }

    public void ViewProfile(MouseEvent mouseEvent) {
    }

    public void ViewAppointments(MouseEvent mouseEvent) {
    }

    public void ViewPatients(MouseEvent mouseEvent) {
    }
}
