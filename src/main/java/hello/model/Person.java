package hello.model;

import javax.persistence.*;
import java.util.Date;
import static javax.persistence.GenerationType.*;

/**
 * Created by elvir_000 on 03.05.2017.
 */

@Entity
@Table(name = "personAll")
public class Person {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Integer id;
    @Column(name = "person")
    private String name;
    private String surname;
    private String patronymic;
    private String gender;
    private Date date_of_birth;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }
}

