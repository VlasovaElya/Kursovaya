package hello.model;
import sun.awt.image.SunWritableRaster;
import sun.util.calendar.LocalGregorianCalendar;
import hello.model.Person;
import javax.persistence.*;
import java.util.Date;

/**
 * Created by elvir_000 on 03.05.2017.
 */

@Entity
@Table(name = "sickAll")
public class Sick {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer n_sick;
    private String severity_of_the_condition;
    private Date date_available;
    private Date statement_date;
    private String diagnosis;



    public Integer getN_sick() {
        return n_sick;
    }

    public void setN_sick(Integer n_sick) {
        this.n_sick = n_sick;
    }
    public String getSeverity_of_the_condition() {
        return severity_of_the_condition;
    }

    public void setSeverity_of_the_condition(String severity_of_the_condition) {
        this.severity_of_the_condition = severity_of_the_condition;
    }

    public Date getDate_available() {
        return date_available;
    }

    public void setDate_available(Date date_available) {
        this.date_available = date_available;
    }

    public Date getStatement_date() {
        return statement_date;
    }

    public void setStatement_date(Date statement_date) {
        this.statement_date = statement_date;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}