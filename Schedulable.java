import java.time.LocalDateTime;

public interface Schedulable {

    void scheduleAppointment(LocalDateTime date,Patient patient) throws DoctorUnavailableException;
    
    
}
