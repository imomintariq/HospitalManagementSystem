package Controllers;

import Entities.HmsUser;
import Main.Main;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

public class BookAppointment implements Initializable {

    @FXML
    private ImageView BookBtn;

    @FXML
    private ImageView LogOut;

    @FXML
    private DatePicker appointment_date;

    @FXML
    private ListView<String> doctors_list;

    @FXML
    private ImageView findDocBtn;

    @FXML
    private ImageView historyBtn;

    @FXML
    private TextField patients_name;

    @FXML
    private ImageView profileBtn;

    @FXML
    private Button signInButton;

    @FXML
    private Label signedInUserLabel;

    private String selectedRow;
    private ArrayList<String> selectedDoctor;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        selectedDoctor = new ArrayList<>();
        appointment_date = new DatePicker();
        loadDoctors();
    }


    private void loadDoctors() {
        HmsUser kms = new HmsUser();
        ArrayList<String> k = kms.retrieveDoctors();
        doctors_list.getItems().addAll(k);
        doctors_list.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                selectedRow = doctors_list.getSelectionModel().getSelectedItem();//getting current selection

                selectedDoctor.clear();
                StringTokenizer st = new StringTokenizer(selectedRow, " ");
                while (st.hasMoreTokens()) {
                    selectedDoctor.add(st.nextToken());
                }
                System.out.println("Selected Doctor Id = " + selectedDoctor.get(0) + ".");

            }
        });
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
            main.changeScene("ScreenFXMLs/Patient/BookAppointment.fxml");
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

    public void appointmentButtonClicked(MouseEvent mouseEvent) {

    }
}
