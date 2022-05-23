package Entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "hms_appointments")
public class HmsAppointment {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "appointment_id", nullable = false)
    private Integer id;

    @Column(name = "doctors_username", nullable = false, length = 45)
    private String doctorsUsername;

    @Column(name = "patients_name", nullable = false, length = 45)
    private String patientsName;

    @Column(name = "date")
    private LocalDate date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDoctorsUsername() {
        return doctorsUsername;
    }

    public void setDoctorsUsername(String doctorsUsername) {
        this.doctorsUsername = doctorsUsername;
    }

    public String getPatientsName() {
        return patientsName;
    }

    public void setPatientsName(String patientsName) {
        this.patientsName = patientsName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setAppointment(String doctors_name, String patients_name, LocalDate appointment_date) {
        Configuration con = new Configuration();
        con.configure().addAnnotatedClass(HmsAppointment.class);

        SessionFactory sf= con.buildSessionFactory();
        Session session= sf.openSession();
        Transaction trans= session.beginTransaction();

        HmsAppointment appointment= new HmsAppointment();

        appointment.setDoctorsUsername(doctors_name);
        appointment.setPatientsName(patients_name);
        appointment.setDate(appointment_date);
        session.save(appointment);
        trans.commit();
    }

    public ArrayList<String> retrieveTodayAppointments() {
        Configuration con = new Configuration();
        con.configure().addAnnotatedClass(HmsAppointment.class);

        SessionFactory sf= con.buildSessionFactory();
        Session session= sf.openSession();
        Transaction trans= session.beginTransaction();
        List<HmsAppointment> memberList = session.createQuery("FROM HmsAppointment ").getResultList();
        ArrayList<String> appointments_list_string = new ArrayList<>();

        for(int i=0;i<memberList.size();i++)
        {

            if(memberList.get(i).getDate().isEqual(LocalDate.now(ZoneId.systemDefault()))){

                appointments_list_string.add(memberList.get(i).getPatientsName() +"         "+memberList.get(i).getDate());
            }


        }
        return appointments_list_string;

    }

    public ArrayList<String> retrieveAllAppointments() {
        Configuration con = new Configuration();
        con.configure().addAnnotatedClass(HmsAppointment.class);

        SessionFactory sf= con.buildSessionFactory();
        Session session= sf.openSession();
        Transaction trans= session.beginTransaction();
        List<HmsAppointment> memberList = session.createQuery("FROM HmsAppointment ").getResultList();
        ArrayList<String> appointments_list_string = new ArrayList<>();

        for(int i=0;i<memberList.size();i++)
        {
            appointments_list_string.add(memberList.get(i).getPatientsName() +"         "+memberList.get(i).getDate());
        }
        return appointments_list_string;
    }
}