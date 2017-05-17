package hello.model;
import sun.awt.image.SunWritableRaster;
import sun.util.calendar.LocalGregorianCalendar;

import javax.persistence.*;
/**
 * Created by elvir_000 on 03.05.2017.
 */

@Entity
@Table(name = "personAll")
public class Person {




    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer n_person;

    @Column(name = "person")
    private String name;
    private String surname;
    private String patronymic;
    private String gender;
    private float date_of_birth;



    public int getN_person() {
        return n_person;
    }

    public void setN_person(int n_person) {
        this.n_person = n_person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Float date_of_birth) {
        this.date_of_birth = date_of_birth;
    }
}

