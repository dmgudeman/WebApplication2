package murach.business;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User implements Serializable {
    private Long apptId;
    private String date;
    private String appointment;
    private String location;

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    public Long getApptId() {
        return apptId;
    }

    public void setApptId(Long userId) {
        this.apptId = userId;
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}