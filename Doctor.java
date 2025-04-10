import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Doctor extends Person {

    private Specialty speciality;
    ArrayList<Appointment> appointments = new ArrayList<>();
    static int totalDoctors;

    Doctor(String id, String name, Specialty speciality) {
        super(id, name);
        this.speciality = speciality;
        totalDoctors++;
    }

    public void scheduleAppointment(LocalDateTime date, Patient patient) throws DoctorUnavailableException {
        for (Appointment app : appointments) {
            if (app.getDate().equals(date)) {
                throw new DoctorUnavailableException("Doctor is unavailable");
            }
        }
        appointments.add(new Appointment(date, patient, this));
    }

    public void displayInfo() {
        System.out.println("Doctor" + getname() + "Speciality" + speciality);
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

}
