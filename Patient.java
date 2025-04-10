import java.util.ArrayList;
import java.util.List;

public class Patient extends Person {

    ArrayList<MedicalRecord> medicalHistory = new ArrayList<>();
    Appointment[] lastThreeAppointments = new Appointment[3];
    int appointmentIndex = 0;

    Patient(String id, String name) {
        super(id, name);
    }

    public void addMedicalRecord(String diagnosis, String treatment) {
        medicalHistory.add(new MedicalRecord(diagnosis, treatment));

    }

    public void addAppointment(Appointment appointment) {
        lastThreeAppointments[appointmentIndex % 3] = appointment;
        appointmentIndex++;
    }

    public void displayInfo() {
        System.out.println("Patient" + getname() + ", ID" + getID());
    }

    public List<MedicalRecord> getMedicalHistory() {
        return medicalHistory;
    }

    public Appointment[] getLastThreeAppointments() {
        return lastThreeAppointments;
    }

}
