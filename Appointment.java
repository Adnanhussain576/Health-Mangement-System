import java.time.LocalDate;
import java.time.LocalDateTime;

public class Appointment {

    private LocalDateTime date;
    private Patient patient;
    private Doctor doctor;
    final int MAX_DURATION_MINUTES = 60;

    Appointment(LocalDateTime date, Patient patient, Doctor doctor) {
        this.date = date;
        this.doctor = doctor;
        this.patient = patient;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

}
