import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Hospital {

    ArrayList<Patient> patientsList = new ArrayList<>();
    ArrayList<Doctor> doctorsList = new ArrayList<>();

    public void addPatient(Patient patient) throws InvalidPatientIdException {
        if (patient.getID() == null || patient.getID().isEmpty()) {
            throw new InvalidPatientIdException("Patient ID cannot be empty");
        }
        patientsList.add(patient);
    }

    public void addDoctor(Doctor doctor) {
        doctorsList.add(doctor);
    }

    public List<Appointment> getPatientAppointments(String patientId) {
        List<Appointment> patientAppointments = new ArrayList<>();
        for (Doctor doctor : doctorsList) {
            for (Appointment appt : doctor.getAppointments()) {
                if (appt.getPatient().getID().equals(patientId)) {
                    patientAppointments.add(appt);
                }
            }
        }
        return patientAppointments;
    }
}
