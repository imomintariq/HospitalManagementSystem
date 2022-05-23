package Entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.*;

@Entity
@Table(name = "hmsuser")
public class Hmsuser {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "iduser", nullable = false)
    private Integer id;

    @Column(name = "username", nullable = false, length = 45)
    private String username;

    @Column(name = "password", nullable = false, length = 45)
    private String password;

    @Column(name = "firstName", length = 45)
    private String firstName;

    @Column(name = "lastname", length = 45)
    private String lastname;

    @Column(name = "cnic", nullable = false, length = 45)
    private String cnic;

    @Column(name = "phonenum", nullable = false, length = 45)
    private String phonenum;

    @Column(name = "emailaddress", length = 45)
    private String emailaddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }


    public void registerAUser(String username, String password, String email, String cnic, String firstName, String lastName, String phoneNumber, String confirmedPassword, boolean checkAdmin) {

        Configuration con = new Configuration();
        con.configure().addAnnotatedClass(Hmsuser.class);

        SessionFactory sf= con.buildSessionFactory();
        Session session= sf.openSession();
        Transaction trans= session.beginTransaction();

        Hmsuser user= new Hmsuser();

        user.setUsername(username);
        user.setPassword(password);
        user.setEmailaddress(email);
        user.setCnic(cnic);
        user.setPhonenum(phoneNumber);
        user.setFirstName(firstName);
        user.setLastname(lastName);

        session.save(user);

        trans.commit();

    }

}