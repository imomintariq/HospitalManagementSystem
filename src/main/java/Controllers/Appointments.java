package Controllers;

import Entities.HmsAppointment;
import Entities.HmsUser;
import Main.Main;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.net.URL;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

public class Appointments implements Initializable {


    @FXML
    private ImageView Appointments;

    @FXML
    private ImageView Dashboard;

    @FXML
    private ImageView LogOut;

    @FXML
    private ImageView MyPatients;

    @FXML
    private ImageView Profile;

    @FXML
    private ListView<String> all_appointments;

    @FXML
    private Label signedInUserLabel;

    @FXML
    private ListView<String> todays_appointments;

    @FXML
    private ImageView Appointment;

    @FXML
    private ImageView Patients;

    private String selectedRow;
    private ArrayList<String> selectedAppointment;


    @FXML
    void BackToDashboard(MouseEvent event) {
        Main main = new Main();
        try {
            main.changeScene("ScreenFXMLs/Doctor/DashboardDoctor.fxml");
        }
        catch(Exception e) {
            System.out.println("Page not Loaded");
        }
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

    public void ViewAppointments(MouseEvent mouseEvent) {
        Main main = new Main();
        try {
            main.changeScene("ScreenFXMLs/Doctor/ViewAppointments.fxml");
        }
        catch(Exception e) {
            System.out.println("Page not Loaded");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        selectedAppointment = new ArrayList<>();
        loadTodaysAppointments();
        loadAllAppointments();
    }

    private void loadAllAppointments() {
        HmsAppointment kms = new HmsAppointment();
        ArrayList<String> k = kms.retrieveAllAppointments();
        all_appointments.getItems().addAll(k);
        all_appointments.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                selectedRow = all_appointments.getSelectionModel().getSelectedItem();//getting current selection

                selectedAppointment.clear();
                StringTokenizer st = new StringTokenizer(selectedRow, " ");
                while (st.hasMoreTokens()) {
                    selectedAppointment.add(st.nextToken());
                }
                System.out.println("Selected Doctor Id = " + selectedAppointment.get(0) + ".");

            }
        });
    }

    private void loadTodaysAppointments() {
        HmsAppointment kms = new HmsAppointment();
        ArrayList<String> k = kms.retrieveTodayAppointments();
        todays_appointments.getItems().addAll(k);
        todays_appointments.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                selectedRow = todays_appointments.getSelectionModel().getSelectedItem();//getting current selection

                selectedAppointment.clear();
                StringTokenizer st = new StringTokenizer(selectedRow, " ");
                while (st.hasMoreTokens()) {
                    selectedAppointment.add(st.nextToken());
                }
                System.out.println("Selected Appointment Id = " + selectedAppointment.get(0) + ".");

            }
        });
    }


}
