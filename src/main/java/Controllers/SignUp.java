package Controllers;

import Main.Main;
import javafx.scene.input.MouseEvent;

public class SignUp {
    public void registerButtonClicked(MouseEvent mouseEvent) {

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
