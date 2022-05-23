package Controllers;

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

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

public class Patients implements Initializable {

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
    private ListView<String> patients_list;

    @FXML
    private Label signedInUserLabel;


    @FXML
    private ImageView Dashboard;

    @FXML
    private ImageView Appointment;

    @FXML
    private ImageView Patients;

    @FXML
    private ImageView Profile;

    private String selectedRow;
    private ArrayList<String> selectedPatients;

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
    void ViewProfile(MouseEvent event) {
        Main main = new Main();
        try {
            main.changeScene("ScreenFXMLs/Doctor/ViewProfile.fxml");
        }
        catch(Exception e) {
            System.out.println("Page not Loaded");
        }
    }

    public void ViewPatients(MouseEvent mouseEvent) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        selectedPatients = new ArrayList<>();
        loadPatients();
    }

    private void loadPatients() {
        HmsUser kms = new HmsUser();
        ArrayList<String> k = kms.retrievePatients();
        patients_list.getItems().addAll(k);
        patients_list.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                selectedRow = patients_list.getSelectionModel().getSelectedItem();//getting current selection

                selectedPatients.clear();
                StringTokenizer st = new StringTokenizer(selectedRow, " ");
                while (st.hasMoreTokens()) {
                    selectedPatients.add(st.nextToken());
                }
                System.out.println("Selected Doctor Id = " + selectedPatients.get(0) + ".");

            }
        });
    }

}
