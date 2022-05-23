package Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import Main.Main;
import Utilities.SignedInUser;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ViewPatientProfile implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView BookBtn;

    @FXML
    private ImageView LogOut;

    @FXML
    private ImageView editButton;

    @FXML
    private Label email_address;

    @FXML
    private ImageView findDocBtn;

    @FXML
    private Label full_name;

    @FXML
    private ImageView historyBtn;

    @FXML
    private Label password;

    @FXML
    private Label patients_name;

    @FXML
    private ImageView profileBtn;

    @FXML
    private Label signedInUserLabel;

    @FXML
    private Label username;


    @FXML
    void initialize() {
        assert BookBtn != null : "fx:id=\"BookBtn\" was not injected: check your FXML file 'ViewProfile.fxml'.";
        assert LogOut != null : "fx:id=\"LogOut\" was not injected: check your FXML file 'ViewProfile.fxml'.";
        assert editButton != null : "fx:id=\"editButton\" was not injected: check your FXML file 'ViewProfile.fxml'.";
        assert email_address != null : "fx:id=\"email_address\" was not injected: check your FXML file 'ViewProfile.fxml'.";
        assert findDocBtn != null : "fx:id=\"findDocBtn\" was not injected: check your FXML file 'ViewProfile.fxml'.";
        assert full_name != null : "fx:id=\"full_name\" was not injected: check your FXML file 'ViewProfile.fxml'.";
        assert historyBtn != null : "fx:id=\"historyBtn\" was not injected: check your FXML file 'ViewProfile.fxml'.";
        assert password != null : "fx:id=\"password\" was not injected: check your FXML file 'ViewProfile.fxml'.";
        assert patients_name != null : "fx:id=\"patients_name\" was not injected: check your FXML file 'ViewProfile.fxml'.";
        assert profileBtn != null : "fx:id=\"profileBtn\" was not injected: check your FXML file 'ViewProfile.fxml'.";
        assert signedInUserLabel != null : "fx:id=\"signedInUserLabel\" was not injected: check your FXML file 'ViewProfile.fxml'.";
        assert username != null : "fx:id=\"username\" was not injected: check your FXML file 'ViewProfile.fxml'.";

    }
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
    void editButtonClicked(MouseEvent event) {

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SignedInUser signedInUser = SignedInUser.getInstance();
        patients_name.setText(signedInUser.getUser().getFirstName() + " "+signedInUser.getUser().getLastName());
        patients_name.setVisible(true);
        username.setText(signedInUser.getUser().getId());
        username.setVisible(true);
        email_address.setText(signedInUser.getUser().getEmailAddress());
        email_address.setVisible(true);
        full_name.setText(signedInUser.getUser().getFirstName() + " "+signedInUser.getUser().getLastName());
        full_name.setVisible(true);
        password.setText(signedInUser.getUser().getPassword());
        password.setVisible(true);

    }


}
