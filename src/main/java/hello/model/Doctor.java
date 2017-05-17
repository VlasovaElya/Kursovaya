package hello.model;

/**
 * Created by elvir_000 on 17.05.2017.
 */
import hello.model.Person;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "doctorAll")
public class Doctor {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String scientific_degree;
    private String academic_title;
    private int n_person;
    private String specialty_branch;

    @ManyToOne
    private Doctor id ;





    public String getScientific_degree() {
        return scientific_degree;
    }

    public void setScientific_degree(String scientific_degree) {
        this.scientific_degree = scientific_degree;
    }

    public String getAcademic_title() {
        return academic_title;
    }

    public void setAcademic_title(String academic_title) {
        this.academic_title = academic_title;
    }

    public int getN_person() {
        return n_person;
    }

    public void setN_person(int n_person) {
        this.n_person = n_person;
    }

    public String getSpecialty_branch() {
        return specialty_branch;
    }

    public void setSpecialty_branch(String specialty_branch) {
        this.specialty_branch = specialty_branch;
    }

    public Doctor getId() {
        return id;
    }

    public void setId(Doctor id) {
        this.id = id;
    }



   }