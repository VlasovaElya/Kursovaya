package hello.model;

/**
 * Created by elvir_000 on 17.05.2017.
 */


import javax.persistence.*;
import java.util.Date;
import hello.model.Person;


@Entity
@Table(name = "doctorAll")
public class Doctor {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer n_doctor;
    private String scientific_degree;
    private String academic_title;
    private String specialty_branch;

    @ManyToOne
    private Person id;


    public Integer getN_doctor() {
        return n_doctor;
    }
    public void setN_doctor(Integer n_doctor) {
        this.n_doctor = n_doctor;
    }

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


    public String getSpecialty_branch() {
        return specialty_branch;
    }

    public void setSpecialty_branch(String specialty_branch) {
        this.specialty_branch = specialty_branch;
    }








      }